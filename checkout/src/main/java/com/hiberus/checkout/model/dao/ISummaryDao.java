package com.hiberus.checkout.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiberus.checkout.model.entity.Summary;

public interface ISummaryDao extends JpaRepository<Summary, Integer>{

}
