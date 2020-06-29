package com.hiberus.checkout.model.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hiberus.checkout.model.entity.Summary;

public interface ISummaryService {
	public List<Summary> findAll();
	
	public Page<Summary> findAll(Pageable p);
	
	public Summary findById(int id);
	
	public Summary save(Summary summary);
	
	public void delete(int id);
}
