package sara;



public class Calculator {
	
	public void sub(int c, int d) {
		System.out.println(c-d);
	}
	
	 void add(int a, int b, int c, int d, String comment) {
		System.out.println(comment);
		System.out.println(a+b+c+d);
	}
	
	public static void main(String[] args) {
		
		int a = 10 , b = 5 , c=15 , d=20; //local variable
		
		Calculator myObject = new Calculator();
		
		myObject.sub(a,b);
		myObject.add(a, b, c, d,"Addition Value");
		
	}

}
