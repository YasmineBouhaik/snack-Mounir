
public class Produit {
	private String description;
	private int quantity; 
	private double price;
	
	public Produit(String Description, int Quantity, Double Price) {
		this.description = Description;
		this.quantity = Quantity;
		this.price = Price;
		
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
		
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
		
	}
	

}
