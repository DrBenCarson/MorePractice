import java.io.*;
import java.util.*;
public class PieEatingConstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner weightEntry=new Scanner(System.in);
		System.out.println("Enter your weight: ");
		int weight= weightEntry.nextInt();
		
		if ((220<weight<<280))
			{
			System.out.println("You are permitted to compete.");
			}
		else
			{
			System.out.println("I'm sorry you are not permitted to comptet.");
			}
		
	}

}
