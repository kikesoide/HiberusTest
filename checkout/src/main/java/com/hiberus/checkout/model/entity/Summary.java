package com.hiberus.checkout.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Model Summary")
@Entity
@Table(name = "summary")
public class Summary {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(value = "the client's id", required = false, name = "id", example = "1")
	int Id;
	
	@NotNull
	@ApiModelProperty(value = "the client's id", required = false, name = "idClient", example = "1")
	@Column(name="client_id", nullable = false)
	int clientId;

	@ApiModelProperty(value = "the Client's name", required = false, name = "name", example = "1")
	String name;

	@ApiModelProperty(value = "the Summary's date", required = true, name = "date")
	Date date;

	@ApiModelProperty(value = "the Client's direction", required = true, name = "address", example = "cll 24 # 11-30")
	String address;

	@ApiModelProperty(value = "the Summary's total", required = true, name = "total")
	Double total;

	public Summary() {}
	
	public Summary(int clientId,String name, Date date, String address, double total) {
		this.clientId = clientId;
		this.name = name;
		this.date = date;
		this.address = address;
		this.total = total;
	}

	
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}


	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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


}
