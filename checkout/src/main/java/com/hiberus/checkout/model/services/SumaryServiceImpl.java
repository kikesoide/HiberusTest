package com.hiberus.checkout.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hiberus.checkout.model.dao.ISummaryDao;
import com.hiberus.checkout.model.entity.Summary;

@Service
public class SumaryServiceImpl implements ISummaryService{
	@Autowired
	private ISummaryDao summaryDao;
	
	@Override
	public List<Summary> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Summary> findAll(Pageable p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Summary findById(int id) {
		return summaryDao.findById(id).orElse(null);
	}

	@Override
	public Summary save(Summary summary) {
		return summaryDao.save(summary);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
