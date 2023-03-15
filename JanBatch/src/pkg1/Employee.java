package pkg1;

public class Employee {
	
	public Employee()
	{
		this(11,10,9);
      System.out.println("default constructor");
	}
	
	public Employee(int a)
	{
		this();
      System.out.println("one parameterized constructor");
	}
	
	public Employee(int a, int b)
	{
		this(22,11,33,44);
      System.out.println("Two parameterized constructor");
	}
	
	public Employee(int a, int b, int c)
	{
      System.out.println("Three parameterized constructor");
	}
	
	public Employee(int a, int b,int c,int d)
	{
		this(11);
      System.out.println("four parameterized constructor");
	}
	
	public static void main(String[] args) {
		Employee obj1 = new Employee(22,33);
	}
}
