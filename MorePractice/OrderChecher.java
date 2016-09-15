import java.io.*;
import java.util.*;
public class OrderChecher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner boltTaker=new Scanner(System.in);
		System.out.println("Enter the desired number of bolts: ");
		int bolts=boltTaker.nextInt();
		
		Scanner nutTaker=new Scanner(System.in);
		System.out.println("Enter the desired number of nuts: ");
		int nuts=nutTaker.nextInt();
		
		Scanner washerTaker=new Scanner(System.in);
		System.out.println("Enter the desired number of washers: ");
		int washers=washerTaker.nextInt();
		
		if (nuts>bolts)
			{
			System.out.println("Check order: too many nuts as it relates to bolts");
			}
		if ((2*washers)>bolts)
			{
			System.out.println("Check order: too few bolts as it relates to washers");
			}
		else
			{
			System.out.println("Order is OK");
			
			System.out.println("Your total is: " + ((bolts*5)+(nuts*3)+(washers)) + " cents");
			}
			}
	

}
