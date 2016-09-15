import java.io.*;
import java.util.*;
public class LastChanceGase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gasTank=new Scanner(System.in);
		Scanner gasGauge=new Scanner(System.in);
		Scanner milesperGallon= new Scanner(System.in);
		
		System.out.println("Capacity of your gas tank in gallons: ");
		int gallon=gasTank.nextInt();
		
		System.out.println("What percent of your tank is remaining? ");
		/*System.out.println("Enter a \"2\" for a 75% full tank");
		System.out.println("Enter a \"3\" for a 50% full tank");
		System.out.println("Enter a \"4\" for a 25% full tank");
		System.out.println("Enter a \"5\" for a an empty tank");*/
		int tank=gasGauge.nextInt();
		
		System.out.println("Enter the miles per gallon the car gets: ");
		int mpg=milesperGallon.nextInt();
		
		if (((gallon*(tank/100))*mpg)<200)
				{
					System.out.println("Get Gas!");
				}
	
				else
					{
					System.out.println("Safe to proceed");
					}
	}

}
