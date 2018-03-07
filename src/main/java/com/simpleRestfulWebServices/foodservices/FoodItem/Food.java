package com.simpleRestfulWebServices.foodservices.FoodItem;

public class Food {
	
	public enum UnitType{
		Can,
		Gram,
		Pound,
		Liter,
		Ounce;
	}
	
	private String name;
	private UnitType unitType;
	private int quantity;
	private String location;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UnitType getUnitType() {
		return unitType;
	}
	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	protected Food() {
		
	}
	
	public Food(String name, UnitType unitType, int quantity, String location, double price) {
		super();
		this.name = name;
		this.unitType = unitType;
		this.quantity = quantity;
		this.location = location;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("Food [name=%s, unitType=%s, quantity=%s, location=%s, price=%s]", name, unitType,
				quantity, location, price);
	}

	

}
