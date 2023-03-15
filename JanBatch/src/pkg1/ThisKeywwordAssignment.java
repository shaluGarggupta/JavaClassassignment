package pkg1;

public class ThisKeywwordAssignment {

	public void method1()
	{
		
      System.out.println("default method");
	}
	
	public void method2(int a)
	{
		
      System.out.println("one parameterized method");
	}
	
	public void method3(int a, int b)
	{
		this.method5(12,10,19,33);
		this.method1();
		this.method2(30);
		this.method4(123, 1234, 12345);
      System.out.println("Two parameterized method");
	}
	
	public void method4(int a, int b, int c)
	{
      System.out.println("Three parameterized method");
	}
	
	public void method5(int a, int b,int c,int d)
	{
		
      System.out.println("four parameterized method");
	}
	
	public static void main(String[] args) {
		ThisKeywwordAssignment obj1 = new ThisKeywwordAssignment();
		obj1.method3(10,20);
	}
}
