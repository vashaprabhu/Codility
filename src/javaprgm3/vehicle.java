package javaprgm3;

public class vehicle implements Comparable<vehicle>{
	
	int vehicleNum;
	String vehicleModel;
	double parkedDuration;
	
	public vehicle(int vehicleNum, String vehicleModel, double parkedDuration) {
		this.vehicleNum = vehicleNum;
		this.vehicleModel = vehicleModel;
		this.parkedDuration = parkedDuration;
	}
	

	@Override
	public int compareTo(vehicle vcl) {
		return (int) (vcl.parkedDuration - parkedDuration);
	}
	


}
