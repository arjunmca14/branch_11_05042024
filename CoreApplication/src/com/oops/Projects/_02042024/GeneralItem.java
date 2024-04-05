package com.oops.Projects._02042024;

public class GeneralItem {
	
	private int id;
	private String name;
	private double quantity=1;
	private double price;
	private long barcode;
	private int discount;
	private String color;
	
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "GeneralItem [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", barcode="
				+ barcode + ", discount=" + discount + ", color=" + color + "]";
	}
	public GeneralItem(int id, String name, double quantity, double price, long barcode, int discount, String color) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.barcode = barcode;
		this.discount = discount;
		this.color = color;
	}
	public GeneralItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
