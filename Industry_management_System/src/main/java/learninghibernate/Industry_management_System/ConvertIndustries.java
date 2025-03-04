package learninghibernate.Industry_management_System;

import javax.persistence.AttributeConverter;



public class ConvertIndustries implements AttributeConverter<Industries, String> {

	private static final String SEPARATOR = ", ";
	
	@Override
	public String convertToDatabaseColumn(Industries ind) {
		if(ind == null) {
			return null;
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(ind.getName() != null && !ind.getName().isEmpty()) {
			
			sb.append(ind.getName());
			sb.append(SEPARATOR);
		}
		
		if(ind.getProduct() != null && !ind.getProduct().isEmpty()) {
			
			sb.append(ind.getProduct());
		}
		
		return sb.toString();
		
	}

	@Override
	public Industries convertToEntityAttribute(String dbInd) {
		if(dbInd == null || dbInd.isEmpty()) {
			return null;
		}
		
		String[] pieces = dbInd.split(SEPARATOR);
		
		if(pieces == null || pieces.length == 0) {
			return null;
		}
		
		 Industries industries = new Industries();        
	        String firstPiece = !pieces[0].isEmpty() ? pieces[0] : null;
	        String secondPiece = !pieces[1].isEmpty() ? pieces[1] : null;
	        
	        if (dbInd.contains(SEPARATOR)) {
	           industries.setName(firstPiece);

	          industries.setProduct(secondPiece);
		
	}
	        return industries;
	

}
}
