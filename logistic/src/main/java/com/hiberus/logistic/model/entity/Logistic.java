package com.hiberus.logistic.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "logistic")
public class Logistic {
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	Date date;
	
	@NotNull
	@Column(name="client_id", nullable = false)
	int clientId;
	
	@Column(name="bill_id", nullable = false)
	int billId;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the clientId
	 */
	public int getClientId() {
		return clientId;
	}

	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	/**
	 * @return the billId
	 */
	public int getBillId() {
		return billId;
	}

	/**
	 * @param billId the billId to set
	 */
	public void setBillId(int billId) {
		this.billId = billId;
	}

	@Override
	public String toString() {
		return "Logistic [id=" + id + ", date=" + date + ", clientId=" + clientId + ", billId=" + billId + "]";
	}

	
}
