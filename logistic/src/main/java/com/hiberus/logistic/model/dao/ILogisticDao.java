package com.hiberus.logistic.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hiberus.logistic.model.entity.Logistic;

public interface ILogisticDao extends JpaRepository<Logistic, Integer>{

}
