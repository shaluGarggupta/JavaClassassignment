package pkg1;

public class CalculationAssignment2 {
	public int sum(int a,int b)
	{
		int c = a+b;
		System.out.println("The sum result"+c);
		return c;
	}
	public int substract(int a,int b)
	{
		int sub = a-b;
		System.out.println("The sub result"+sub);
		return sub;
	}
	public int divide(int a,int b)
	{
		int div = a/b;
		System.out.println("The divide result is"+div);
		return div;
	}
	public void multiply(int a,int b)
	{
		int mul = a*b;
		System.out.println("The final result is result"+mul);
	}
	
	public static void main(String[] args) {
		CalculationAssignment2 obj1 = new CalculationAssignment2();
		int result1=obj1.divide(10,2);
		int result2=obj1.substract(result1,2);
		int result3=obj1.sum(result2,2);
		int result4=obj1.substract(result3, 2);
		obj1.multiply(result4, 2);
	}

}
