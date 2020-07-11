package pkg1;

public class Calculator {
	
	
	public void addition(int a1,int a2 ) {
		System.out.println("addition of two numbers is :"+(a1+a2));
	}
	public void addition(double a3,double a4 ) {
		System.out.println("addition of two numbers is :"+(a3+a4));
	}
	public void addition(int a5,double a6 ) {
		System.out.println("addition of two numbers is :"+(a5+a6));
	}
	public void addition(double a7,int a8 ) {
		System.out.println("addition of two numbers is :"+(a7+a8));
	}
	
	public void difference(int d1,int d2 ) {
		System.out.println("difference of two numbers is :"+(d1-d2));
	}
	public void difference(double d3,double d4 ) {
		System.out.println("difference of two numbers is :"+(d3-d4));
	}
	public void difference(int d5,double d6 ) {
		System.out.println("difference of two numbers is :"+(d5-d6));
	}
	public void difference(double d7,int d8 ) {
		System.out.println("difference of two numbers is :"+(d7-d8));
	}
	public void multiplication(int m1,int m2 ) {
		System.out.println("multiplication of two numbers is :"+(m1*m2));
	}
	public void multiplication(double m3,double m4 ) {
		System.out.println("multiplication of two numbers is :"+(m3*m4));
	}
	public void multiplication(int m5,double m6 ) {
		System.out.println("multiplication of two numbers is :"+(m5*m6));
	}
	public void multiplication(double m7,int m8 ) {
		System.out.println("multiplication of two numbers is :"+(m7*m8));
	}
	public void division(int div1,int div2 ) {
		System.out.println("division of two numbers is :"+(div1/div2));
	}
	public void division(double div3,double div4 ) {
		System.out.println("division of two numbers is :"+(div3/div4));
	}
	public void division(int div5,double div6 ) {
		System.out.println("division of two numbers is :"+(div5/div6));
	}
	public void division(double div7,int div8 ) {
		System.out.println("division of two numbers is :"+(div7/div8));
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.addition(1,2);
		c.addition(5, 5.61);
		c.addition(4.2, 5.3);
		c.addition(5.43, 8);
		c.difference(5, 4);
		c.difference(7, 5.43);
		c.difference(5.67, 2.89);
		c.difference(8.97, 6);
		c.division(4.5, 3.1);
		c.division(5.4, 3);
		c.division(8, 5.4);
		c.division(9, 2);
		c.multiplication(42.43, 3.56);
		c.multiplication(12.5, 6);
		c.multiplication(4, 19.5);
		c.multiplication(4, 10);
		// TODO Auto-generated method stub

	}

}
