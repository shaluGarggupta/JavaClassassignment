package pkg1;

public class CalculationAssignment1 {
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("The sum result is"+c);
		return c;
	}
    public int substract(int a, int b) 
    {
    	int sub = a-b;
		System.out.println("The substraction result is"+sub);
		return sub;
    }
    public int multiply(int a, int b) 
    {
    	int mul = a*b;
		System.out.println("The multiply result is"+mul);
		return mul;
    }
    public void divide(int a, int b) 
    {
    	int div = a/b;
		System.out.println("The final result is"+div);
    	
    }
    
    public static void main(String[] args) {
    	CalculationAssignment1 op = new CalculationAssignment1();
    	int sumresult=op.sum(10,2);
    	int sumresult1=op.sum(sumresult,2);
    	int subresult=op.substract(sumresult1,2);
    	int multiplyresult=op.multiply(subresult,2);
    	op.divide(multiplyresult, 2);
    	
	}
}
