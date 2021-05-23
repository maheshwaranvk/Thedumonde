package sara;

public class Bike extends Car{
	
	public void doWheeling() {
		System.out.println("I am doing Wheeling");
	}
	


	public static void main(String[] args) {
		Bike myObject = new Bike();
		
		myObject.soundHorn();
		myObject.applyBreak();
		myObject.carDrive();
		
	}
}
