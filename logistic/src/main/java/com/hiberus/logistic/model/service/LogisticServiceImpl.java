package com.hiberus.logistic.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hiberus.logistic.model.dao.ILogisticDao;
import com.hiberus.logistic.model.entity.Logistic;

@Service
public class LogisticServiceImpl implements ILogisticService{
	@Autowired
	private ILogisticDao logisticDao;
	
	@Override
	public List<Logistic> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Logistic> findAll(Pageable p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Logistic findById(int id) {
		return logisticDao.findById(id).orElse(null);
	}

	@Override
	public Logistic save(Logistic logistic) {
		return logisticDao.save(logistic);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
