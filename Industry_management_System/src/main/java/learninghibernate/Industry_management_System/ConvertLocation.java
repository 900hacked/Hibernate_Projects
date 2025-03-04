package learninghibernate.Industry_management_System;

import javax.persistence.AttributeConverter;

public class ConvertLocation implements AttributeConverter<Location, String> {

	private static final String SEPARATOR = ", ";
	
	@Override
	public String convertToDatabaseColumn(Location loc) {
		if(loc == null) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(loc.getNameOfTheVillage() != null && !loc.getNameOfTheVillage().isEmpty()) {
			sb.append(loc.getNameOfTheVillage());
			sb.append(SEPARATOR);
		}
		
		if(loc.getTown() != null && !loc.getTown().isEmpty()) {
			sb.append(loc.getTown());
			sb.append(SEPARATOR);
		}
		
		if(loc.getPostalCode() != null && !loc.getPostalCode().isEmpty()) {
			sb.append(loc.getPostalCode());
			sb.append(SEPARATOR);
		}
		
		if(loc.getCountry() != null && !loc.getCountry().isEmpty()) {
			sb.append(loc.getCountry());
		}
		
		return sb.toString();
	}

	@Override
	public Location convertToEntityAttribute(String dbLoc) {
		if(dbLoc == null || dbLoc.isEmpty()) {
			return null;
		}
		
		String[] pieces = dbLoc.split(SEPARATOR);
		
		if(pieces == null || pieces.length == 0) {
			return null;
		}
		
		 Location loc = new Location();        
	        String firstPiece = !pieces[0].isEmpty() ? pieces[0] : null;
	        String secondPiece = !pieces[1].isEmpty() ? pieces[1] : null;
	        String thirdPiece = !pieces[2].isEmpty() ? pieces[2] : null;
	        String fourthPiece = !pieces[3].isEmpty() ? pieces[3] : null;
	        
	        if (dbLoc.contains(SEPARATOR)) {
	           loc.setNameOfTheVillage(firstPiece);

	         loc.setTown(secondPiece);
	         loc.setPostalCode(thirdPiece);
	         loc.setCountry(fourthPiece);
		
		
	}
	        return loc;

}
}
