package com.hiberus.logistic.model.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hiberus.logistic.model.entity.Logistic;

public interface ILogisticService {
	public List<Logistic> findAll();
	
	public Page<Logistic> findAll(Pageable p);
	
	public Logistic findById(int id);
	
	public Logistic save(Logistic logistic);
	
	public void delete(int id);
}
