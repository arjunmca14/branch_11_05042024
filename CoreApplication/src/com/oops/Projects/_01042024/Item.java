package com.oops.Projects._01042024;

public abstract class Item {
	private int id;
	private String name;
	private double quantity;
	private double price;
	private long barcode;
	private int discount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getBarcode() {
		return barcode;
	}
	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", barcode="
				+ barcode + ", discount=" + discount + "]";
	}
	public Item(int id, String name, double quantity, double price, long barcode, int discount) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.barcode = barcode;
		this.discount = discount;
	}
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
