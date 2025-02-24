package learninghibernate.Boutique_Management_Sysyem;

import javax.persistence.PrePersist;

public class EntityListener {

	@PrePersist
	public void updateTax(Bot bot) {
		
		if ("Shoes" == bot.getCategory()) {
			System.out.println("Before Persist: " + bot.getCategory());
			double discountedPrice = bot.getPrice() * 0.05;
			System.out.println("After Persist: " + discountedPrice);
			double newPrice = bot.getPrice() - discountedPrice;
			System.out.println("new Price " + newPrice);
			bot.setPrice(newPrice);
			bot.setTotalPrice(newPrice * bot.getStockQuantity());
		} else {
			bot.setTotalPrice(bot.getPrice() * bot.getStockQuantity());
		}

	}
}
