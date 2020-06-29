package com.hiberus.bill.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hiberus.bill.model.entity.Bill;

public interface IBillService {
	public List<Bill> findAll();
	
	public Page<Bill> findAll(Pageable p);
	
	public Bill findById(int id);
	
	public Bill save(Bill product);
	
	public void delete(int id);
	
	public List<Bill> saveAll(List<Bill> products);
}
