package javaprgm3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Write a java program to implement the fallowing Consider vehicle parking application where each vehicle
//information which enters into the parking location stored in 2 lists. at the end of each day these lists 
//to be merged into single list and one vehicle information which has highest parked hour should be retrieved, 
//where each vehicle information has vehicle number, vehicle model, total duration parked in minutes.

public class vehicleLists {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<vehicle> vl1 = new ArrayList<vehicle>();
		vl1.add(new vehicle(001, "honda", 2));
		vl1.add(new vehicle(101, "Accord", 2.5));
		vl1.add(new vehicle(103, "toyota", 1));
		
		List<vehicle> vl2 = new ArrayList<vehicle>();
		vl1.add(new vehicle(201, "BMW", 2));
		vl1.add(new vehicle(231, "Benz", 0.5));
		vl1.add(new vehicle(113, "volvo", 3));
		
		
		vl1.addAll(vl2);
		Collections.sort(vl1);
		
		
		
//		double timeParkedDuration = 0;
//		List<vehicle> vDur = new ArrayList<vehicle>();
//		for(vehicle v : vl1 ) {
//			timeParkedDuration =v.parkedDuration * 60;
//			vDur.add(new vehicle(v.vehicleNum, v.vehicleModel, v.parkedDuration*60));
//		}
//		System.out.println(vDur.toString());
		
		
		
		
		
		
		

	}


	

}
