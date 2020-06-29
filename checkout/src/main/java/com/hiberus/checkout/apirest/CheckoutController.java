package com.hiberus.checkout.apirest;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hiberus.checkout.model.dto.Bill;
import com.hiberus.checkout.model.dto.Customer;
import com.hiberus.checkout.model.dto.Logistic;
import com.hiberus.checkout.model.dto.Order;
import com.hiberus.checkout.model.dto.RespuestaDTO;
import com.hiberus.checkout.model.entity.Summary;
import com.hiberus.checkout.model.services.ISummaryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("checkout")
@Api(value = "Checkout microservice")
public class CheckoutController {
	
	@Autowired
	private RestTemplate restTemplate;
	
//	@Autowired
//	private Environment env;
	
	@Autowired
	private ISummaryService summaryService;
	/**
	 * send checkout request
	 * @param order
	 * @return summary
	 */
	@PostMapping("/")
	@ApiOperation(value = "Regitrar orden de compra")
	public ResponseEntity<?> sendCheckout(@RequestBody @Valid Order order) {
		//register bill and calc the total
		try {
			Bill bill = restTemplate.postForObject("http://localhost:9001/bill/", order, Bill.class);
			
			/*suppose you call another microservice to validate and get customer information */
			Customer customer = callCustomService(order.getClientId());
			
			Logistic logistic = new Logistic();
			logistic.setBillId(bill.getId());
			logistic.setClientId(bill.getClientId());
			logistic.setDate(new Date());
			//register de order in the logistic microservices
			restTemplate.postForObject("http://localhost:9002/logistic/", logistic, Object.class);
			
			
			if(customer != null) {
				Summary sum = new Summary(order.getClientId(), customer.getName(), new Date(), customer.getAddress(), bill.getTotal());
				sum = summaryService.save(sum);
				return new ResponseEntity<Summary>(sum, HttpStatus.OK);
			}else {
				return new ResponseEntity<Object>(new RespuestaDTO("clientId doesn't exist"), HttpStatus.NOT_FOUND);
			}
		}catch(Exception e) {
			return new ResponseEntity<Object>(new RespuestaDTO("operation cannot be completed"), HttpStatus.FAILED_DEPENDENCY);
		}
		
	}
	
	/**
	 * get checkout info
	 * @param order
	 * @return summary
	 */
	@GetMapping("/summary/{id}")
	@ApiOperation(value = "consultar resumen de compra por id")
	public ResponseEntity<?> getCheckOut(@PathVariable Integer id) {
		
		Summary res = summaryService.findById(id);
		summaryService.findAll();
		summaryService.delete(1);
		if(res != null) {
			return new ResponseEntity<Summary>(res, HttpStatus.OK);
		}else {
			return new ResponseEntity<Object>("no hay resultados", HttpStatus.NOT_FOUND);
		}
		
	}
	
	/**
	 * emulate get address of the client
	 * @param id
	 * @return address
	 */
	Customer callCustomService(int id) {
		if(id<10) {
			return new Customer(id,"Jorge Torres","cll 24 #11-30");
		}
		return null;
	}
	
}
