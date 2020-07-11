package pkg1;
import java.util.Scanner;

public class ConditionalState {
	Scanner sc=new Scanner(System.in);
	private int productID;
	private int productQuantity;
	private double retailPrice;
	private double Bill;

	public void conditional() {
		System.out.println("enter product Id");
		productID=sc.nextInt();
		System.out.println("enter product quantity");
		productQuantity=sc.nextInt();
		switch(productID) {
		case 1: retailPrice=22.50;
		   break;
		case 2: retailPrice=44.50;
		   break;
		case 3:
			    retailPrice=9.98;
	    default : System.out.println("enter valid product id");
	         break;
		}
		System.out.print("your total bill is : ");
		System.out.println(Bill=retailPrice*productQuantity);
		
		
	}
	
	public static void main(String[] args) {
		ConditionalState cd=new ConditionalState();
		cd.conditional();
		}

}
