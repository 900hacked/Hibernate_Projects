package learninghibernate.Industry_management_System;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Industry")
public class Industry {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@Convert(converter = ConvertIndustries.class)
	private Industries industries;
	
	@Convert(converter = ConvertLocation.class)
	private Location location;
	
	public Industry() {
		
	}

	public Industry(Industries industries, Location location) {
		super();
		this.industries = industries;
		this.location = location;
	}

	public Industries getIndustries() {
		return industries;
	}

	public void setIndustries(Industries industries) {
		this.industries = industries;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
	

}
