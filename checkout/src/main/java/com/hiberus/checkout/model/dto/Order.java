package com.hiberus.checkout.model.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Model Order")
public class Order {
	@Id
	@NotNull
	@ApiModelProperty(value = "the order's id", required = false, name = "id", example = "1")
	int clientId;

	@ApiModelProperty(value = "the order's date", required = true, name = "date")
	Date date;

	@ApiModelProperty(value = "the order's list product", required = true, name = "products")
	List<Product> products;
	
	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [clientId=" + clientId + ", date=" + date  + ", products=" + products
				+ "]";
	}
	
	
}
