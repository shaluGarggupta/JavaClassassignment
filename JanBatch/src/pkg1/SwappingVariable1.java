package pkg1;

import java.util.Scanner;

public class SwappingVariable1 {

	
	public static void main(String[] args) {
		int c;
		Scanner myObj1 = new Scanner(System.in); 
		System.out.println("Enter value of a");
		System.out.println("Enter value of b");
		int a=myObj1.nextInt();
		int b=myObj1.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("value of a:" +a);
		System.out.println("value of b:" +b);
		
	}
}
