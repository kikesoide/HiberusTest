package com.hiberus.bill.apirest;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.bill.model.entity.Bill;
import com.hiberus.bill.model.entity.Order;
import com.hiberus.bill.model.service.IBillService;

/**
 * Bill Microservice
 * All about product model 
 * @author kikesoide
 *
 */


@RestController
@RequestMapping("bill")
public class BillController {
	
	@Autowired
	IBillService billService;
	/**
	 * calc the total of the bill 
	 * @param order
	 * @return total cost
	 */
	@PostMapping("/")
	public Bill sendCheckout(@RequestBody @Valid Order order) {
		
		Double sum = order.getProducts().stream()
				  .map(item -> item.getCost() * item.getQuantity())
				  .reduce(0d, (a, b) -> a + b);
		/**
		 *  ...suppose you call another microservice to save the bill details with the products
		 */
		Bill newBill = new Bill();
		newBill.setClientId(order.getClientId());
		newBill.setDate(new Date());
		newBill.setTotal(sum);
		newBill.setNumber(Math.random()+1000000);
		billService.save(newBill);
		return newBill;
	}
	
}
