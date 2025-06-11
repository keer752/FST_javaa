package Activities;

public class Activity7 {
	public static void main(String[] args)  throws InterruptedException{
		Plane plane = new Plane(10);
		plane.onboard("john");
		plane.onboard("steve");
		plane.onboard("ana");
		System.out.println("plane took off at:" + plane.setTakeOff());
		System.out.println("people on the plane:" + plane.getPassengers());
		Thread.sleep(5000);
		plane.setLand();
		System.out.println("plane landed at:" + plane.getLastTimeLanded());
		System.out.println("people on the plane after landing:" + plane.getPassengers());
	
		
	}
   
	
	
}
