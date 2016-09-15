import java.io.*;
import java.util.*;
public class StartandEndValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner startingNumber=new Scanner(System.in);
		System.out.println("Enter Starting integer: ");
		int s=startingNumber.nextInt();
		
		Scanner endingNumber=new Scanner(System.in);
		System.out.println("Enter Ending integer: ");
		int e=endingNumber.nextInt();
		
		for (int c=e-s;s<=e;s++)
		{System.out.println(s);
			s=s*1;
		
		}
			
	}

}
