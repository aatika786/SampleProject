package FirstPackage;

import java.util.Scanner;

public class SampleSwitch {

	public static void main(String[] args) 
	{
	
		int a=10,b=20,c;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
		System.out.println("Select the case....");
		String var = sc.next();
		
		
		switch(var)
		{
		case "add":
			c=a+b;
			System.out.println("Addition results: "+c);
			break;
		case "sub":
			c=a-b;
			System.out.println("Substracation results: "+c);
			break;
		
			default :
				System.out.println("try again");
				break;
			
		}
		

	}

}
}