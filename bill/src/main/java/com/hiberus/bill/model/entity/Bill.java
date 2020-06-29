package com.hiberus.bill.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Model Product")
@Entity
@Table(name = "bill")
public class Bill {
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "the Bill's id", required = false, name = "id", example = "1")
	int id;
	
	@ApiModelProperty(value = "the Bill's date", required = true, name = "date")
	Date date;
	
	@NotNull
	@ApiModelProperty(value = "the client's id", required = false, name = "id", example = "1")
	int clientId;
	
	@ApiModelProperty(value = "the Bill's total", required = true, name = "total")
	Double total;
	
	@ApiModelProperty(value = "the Bill's number", required = true, name = "number")
	Double number;

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
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

	/**
	 * @return the number
	 */
	public Double getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Double number) {
		this.number = number;
	}
	
	
}
