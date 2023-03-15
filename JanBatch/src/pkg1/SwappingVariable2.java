package pkg1;

import java.util.Scanner;

public class SwappingVariable2 {
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter value of a");
		System.out.println("Enter value of b");
		int a=myObj.nextInt();
		int b=myObj.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a:" +a);
		System.out.println("value of b:" +b);
		
	}

}
