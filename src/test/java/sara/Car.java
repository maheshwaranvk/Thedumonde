package sara;

public class Car {


	public void applyBreak() {
		System.out.println("Apply Break");
		String leftBreak = "Left Break"; //Local Variable
		System.out.println(leftBreak);
	}
	
	public void carDrive() {
		System.out.println("Car Drive");
	}
	
	protected void soundHorn() {
		System.out.println("Sound Horn in Car");
	}
	
	
	//Global Variable
	public String wheels="Wheels";
	public String cluch="Cluch";
	public String breaks = "Break";
	
	public char a = 'a';
	public boolean s = true;
	
public static void main(String[] args) {
	
	Car myObject = new Car();
	
	myObject.applyBreak();
	myObject.carDrive();
	myObject.soundHorn();	
	
	
	System.out.println(myObject.wheels);
	System.out.println(myObject.cluch);
	System.out.println(myObject.breaks);
	
	Calculator object = new Calculator();
	
	
	
}
}
