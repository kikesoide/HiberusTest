package com.hiberus.logistic.apirest;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.logistic.model.entity.Logistic;
import com.hiberus.logistic.model.service.ILogisticService;

@RestController
@RequestMapping("logistic")
public class LogisticController {
	
	@Autowired
	ILogisticService billService;
	
	@PostMapping("/")
	public void sendOrder(@RequestBody @Valid Logistic logistic) {
		System.out.println(logistic);
		billService.save(logistic);
		//return new ResponseEntity<Object>("", HttpStatus.NO_CONTENT);
	}
}
