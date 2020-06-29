package com.hiberus.bill.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiberus.bill.model.entity.Bill;

public interface IBillDao extends JpaRepository<Bill, Integer>{

}
