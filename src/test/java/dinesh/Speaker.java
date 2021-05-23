package dinesh;

import sara.Bike;



public class Speaker extends Bike{
	
	public void callDoWheeling() {
		super.doWheeling();

	}

	public static void main(String[] args) {
		
		Speaker obj = new Speaker();
		obj.callDoWheeling();

		
	}
}
