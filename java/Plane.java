package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane {

	private List<String> passengers;
	private final int maxPassengers;
	private Date lastTimeTakeof;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<>();
		
	}
	public void onboard(String passengerName) {
		if(passengers.size() <= maxPassengers) {
			this.passengers.add(passengerName);
		}
		else {
			System.out.println("plane is full");
		}
	}
	public Date setTakeOff() {
		this.lastTimeTakeof = new Date();
		return lastTimeTakeof;
		
	}
	public void setLand() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	public Date getLastTimeLanded() {
		return lastTimeLanded;
	}
	public List<String> getPassengers(){
		return passengers;
	}
}
	

	

