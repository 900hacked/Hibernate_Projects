package learninghibernate.Industry_management_System;

public class Location {
	
	private String nameOfTheVillage;
	
	private String town;
	
	private String postalCode;
	
	private String country;
	
	public Location() {
		
	}

	public Location(String nameOfTheVillage, String town, String postalCode, String country) {
		
		this.nameOfTheVillage = nameOfTheVillage;
		this.town = town;
		this.postalCode = postalCode;
		this.country = country;
	}

	public String getNameOfTheVillage() {
		return nameOfTheVillage;
	}

	public void setNameOfTheVillage(String nameOfTheVillage) {
		this.nameOfTheVillage = nameOfTheVillage;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
