package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Price {

	@Id
	private int priceId;
	private double productPrice;

	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Price [priceId=" + priceId + ", productPrice=" + productPrice + "]";
	}

}
