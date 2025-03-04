package learninghibernate.Industry_management_System;



public class Industries {
	
	
	
	private String name;
	
	private String product;
	
	public Industries() {
		
	}

	public Industries( String name, String product) {
		
		this.name = name;
		this.product = product;
	}

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	
	

}
