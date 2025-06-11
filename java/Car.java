package Activities;

public class Car {

	private String color;
	private String transmission;
	private int make;
	private int tyres;
	private int doors;
	
	
	Car(String color,String transmission,int make,int tyres,int doors){
		
	
	this.color=color;
	this.transmission=transmission;
	this.make=make;
	this.tyres=4;
	this.doors=4;
	}
	
	 public void displayCharacterstics() {
		 System.out.println("color of the car is: " + this.color);
		 System.out.println("Transmissiontype is: " + this.transmission);
		 System.out.println("car was made in: " + this.make);
		 System.out.println("It has: " + this.tyres +"tyres and"+this.doors + "doors");

		 
	 }
	 
	 public void accerlate() {
		 System.out.println("The car moves forward");
	 }
	 
	 
	 public void brake() {
		 System.out.println("the car has stopped");
		 
	 }
	
	
	
}
