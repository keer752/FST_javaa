package Activities;

interface BicycleParts{
	int tyres = 2;
	int maxSpeed = 20;
}
interface BicycleOperations{
	void applyBrake(int decrementValue);
	void speedUp(int incrementValue);
}

class Bicycle implements BicycleOperations,BicycleParts{
	int gears;
	int currentSpeed;
	
	Bicycle(int gears,int currentSpeed){
		this.gears = gears;
		this.currentSpeed = currentSpeed;
	}

	@Override
	public void applyBrake(int decrementValue) {
		// TODO Auto-generated method stub
		System.out.println("cycle speed decreased");
		if(currentSpeed != 0) {
			currentSpeed -= decrementValue;
		
			
	}
		else {
			System.out.println("cycle stopped");
		}}

	@Override
	public void speedUp(int incrementValue) {
		// TODO Auto-generated method stub
		System.out.println("cycle speed increased");
		if(currentSpeed <= maxSpeed) {
			currentSpeed += incrementValue;
		}
		else {System.out.println("cycle at max speed");
	}
	}
	
	public void bicycleDesc() {
		System.out.println("Bicycle has"+ gears +"gears," + tyres+"tyres and maxspeed of" + maxSpeed);
	    System.out.println("its current speed is :" + currentSpeed);
		
	}
	class MountainBike extends Bicycle{
		int seatHeight;
//		constructor
		MountainBike(int gears,int currentSpeed,int seatHeight){
			super(gears,currentSpeed);
			this.seatHeight=seatHeight;
		}
		public void setSeatHeight(int newValue) {
			this.seatHeight=newValue;
		}
//		override for the description function
		@Override
		public void bicycleDesc() {
			System.out.println("bicycle has"+gears+"gears, "+tyres+"tyres and a maxspeed of "+maxSpeed);
			System.out.println("current seat height is:"+seatHeight);
			System.out.println("Its current speed is:"+currentSpeed);
		}
	}
	public class Activity8 {
		public void main(String[] args) {
			Bicycle mb=new MountainBike(3,0,25);
			mb.bicycleDesc();
			mb.speedUp(20);
			mb.applyBrake(5);
			mb.bicycleDesc();
		}
	}
		
	}
	
	


