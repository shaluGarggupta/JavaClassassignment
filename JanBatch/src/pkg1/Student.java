package pkg1;

public class Student {
	int age;
	int rollno;
	
	public void method1()
	{
		System.out.println("Welcome to all of you");
		
	}
     
	public void method2()
	{
		System.out.println("Automation is very easy");
		
	}
	
	public static void main(String[] args) {
		Student stu=new Student();
		stu.method1();
		stu.method2();
		stu.age=25;
		System.out.println(stu.age);
		stu.rollno=2345;
		System.out.println(stu.rollno);
	}
}
