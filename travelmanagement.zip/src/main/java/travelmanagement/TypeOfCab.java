package travelmanagement;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class  TypeOfCab  {
	 
	TreeMap<String, Double > typeCabAmt;
	
	public TypeOfCab() {
			List<String>  typeCab =  Arrays.asList("MiniCab","CrewCab","DoubleCab","TruckCab");
			 typeCabAmt = new TreeMap<String, Double>();
			
			typeCabAmt.put(typeCab.get(0), 20.0);
			typeCabAmt.put(typeCab.get(1), 50.0);
			typeCabAmt.put(typeCab.get(2), 80.0);
			typeCabAmt.put(typeCab.get(3), 100.0);
	}
	
	public Double calculateMinFare(String tC) {
		return typeCabAmt.containsKey(tC)? typeCabAmt.get(tC) : 250.0;
	}
	
	public Double calculateFare(String tC, Double Dist) {
		
		return typeCabAmt.containsKey(tC)? (Dist + (Dist*typeCabAmt.get(tC))) : (Dist+Dist*200.0);
	}
	
	public Double calculateFareWithTax(String tC, Double dist) {
		
		double amtToPay = calculateFare(tC, dist);
		return (amtToPay*0.30) + amtToPay;
	}
	
	
	
}
