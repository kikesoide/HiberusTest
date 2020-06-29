package com.hiberus.bill.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.hiberus.bill.model.dao.IBillDao;
import com.hiberus.bill.model.entity.Bill;


@Service
public class BillServiceImpl implements IBillService{
	@Autowired
	private IBillDao productDao;
	
	@Override
	public List<Bill> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Bill> findAll(Pageable p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bill findById(int id) {
		return productDao.findById(id).orElse(null);
	}

	@Override
	public Bill save(Bill product) {
		return productDao.save(product);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Bill> saveAll(List<Bill> products) {
		return productDao.saveAll(products);
	}

}
