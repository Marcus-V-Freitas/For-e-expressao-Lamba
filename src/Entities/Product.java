package Entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double TotalValueInStock() {
		return price*quantity;
	}
	
	public void AddQuantity(int quantity) {
		this.quantity+=quantity;
	}
	
	public void RemoveQuantity(int quantity) {
		this.quantity-=quantity;
	}
	
	public String toString() {
		return name + "$" + String.format("%.2f", price) 
		+ " ," + quantity + "units, total $" + String.format("%.2f", TotalValueInStock());  
	}
}
