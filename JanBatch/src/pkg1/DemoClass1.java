package pkg1;

public class DemoClass1 {
int a;

public void abc()
{
	System.out.println("welcome");
}

public static void main(String[] args)
{
	DemoClass1 d1 = new DemoClass1();
	d1.a=123;
	d1.abc();
	System.out.println(d1.a);
}
}
