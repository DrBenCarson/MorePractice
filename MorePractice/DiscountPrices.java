import java.io.*;
import java.util.*;
public class DiscountPrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner priceTaker= new Scanner(System.in);
		System.out.println("Enter amount of purchases: ");
		int c=priceTaker.nextInt();
		
		if (c>1000)
			{System.out.println("Discounted price: " + (c*.9));}
		
			
			else 
				{System.out.println("Price: "+c);}
	}
	
}
