package com.cts.ecart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stock {

	@Id
	private int stockId;
	private int stockItems;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public int getStockItems() {
		return stockItems;
	}

	public void setStockItems(int stockItems) {
		this.stockItems = stockItems;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockItem=" + stockItems + "]";
	}

}
