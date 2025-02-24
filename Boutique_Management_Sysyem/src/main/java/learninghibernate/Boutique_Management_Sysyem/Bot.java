package learninghibernate.Boutique_Management_Sysyem;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;
@EntityListeners(EntityListener.class)
@Entity
@Table(name = "Boutique")
public class Bot {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int itemId;

private String name;

private String category;

private double price;

//private double discount(double price, int stockQuantity) {
//	if(stockQuantity > 20) {
//		price *= 0.10;
//	}
//	return price;
//}




//total price = discountedPrice * quantity
private double totalPrice ;

//discounted price = originalPrice * discount;


private int stockQuantity;

public Bot() {
	
}

public Bot( String name, String category, double price, int stockQuantity,  double totalPrice) {
	
	
	this.name = name;
	this.category = category;
	this.price = price;
	this.stockQuantity = stockQuantity;
	
	
	this.totalPrice = totalPrice;
}

public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public double getPrice() {
	
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getStockQuantity() {
	
	return stockQuantity;
}

public void setStockQuantity(int stockQuantity) {
	this.stockQuantity = stockQuantity;
}




public double getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}

@Override
public int hashCode() {
	return Objects.hash(name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Bot other = (Bot) obj;
	return  other.name == name;
}



	
}
