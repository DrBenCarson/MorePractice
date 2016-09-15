import java.io.*;
import java.util.*;
public class OneLineWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iHateXav=new Scanner(System.in);
		Scanner iHeartXav=new Scanner(System.in);
		System.out.println("Enter your first of two words: ");
		String first=iHateXav.next();
		System.out.println("Enter your second word: ");
		String second=iHeartXav.next();
		
		int y=first.length();
		int z=second.length();
		int x=0;
		System.out.print(first);
		
		while ((x+y+z)<30)
		{
			x++;
			System.out.print(".");
		}
		System.out.print(second);
		/*int y=first.length();
		int z=second.length();
		
		System.out.print(first);
		for (int x=0; (x+y+z)<30; x++)
		{System.out.print(".");}
		System.out.print(second);*/
	}
		
}
