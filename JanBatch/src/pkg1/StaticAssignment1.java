package pkg1;

public class StaticAssignment1 {
	
	public static void method1()
	{
		System.out.println("this is static method");
	}
	
	public void method2()
	{
		method1();
		StaticAssignment1.method1();
		//this.method1();
		StaticAssignment1 staObj = new StaticAssignment1();
		staObj.method1();
		System.out.println("this is not static method");
		
	}

//	public static void main(String[] args) {
//		method1();
//		StaticAssignment1.method1();
//		//this.method1();
//		StaticAssignment1 staObj = new StaticAssignment1();
//		staObj.method1();
//		System.out.println("this is not static method");
//		
//	}
}
