package com.hiberus.checkout.model.dto;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Model Product")
public class Product {
	@Id
	@NotNull
	@ApiModelProperty(value = "the product's id", required = false, name = "id", example = "1")
	int id;
	
	@ApiModelProperty(value = "the product's quantity", required = true, name = "quantity", example = "2")
	double quantity;
	
	@ApiModelProperty(value = "the product's cost", required = true, name = "cost", example = "400000")
	double cost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	} 
	
	
}
