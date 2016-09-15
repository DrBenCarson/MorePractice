import java.io.*;
import java.util.*;
public class AddingupIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iHateXav=new Scanner(System.in);
		System.out.println("How many integers will be added: ");
		int number=iHateXav.nextInt();
		int c=0;
		int x=0;
		while (x<number)
		{
			x++;
			System.out.println("enter an integer: ");;
			Scanner iHeartXav=new Scanner(System.in);
			int b=iHeartXav.nextInt();
			c += b;
		}
		System.out.println("The sum is " + c);
		/*for (int x=0; x<number; x++)
		{
			System.out.println("Enter an integer: ");
			Scanner iHeartXav=new Scanner(System.in);
			int b=iHeartXav.nextInt();	
			c += b;*/
		
		
	}

}
