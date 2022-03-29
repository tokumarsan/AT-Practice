package Pkg3;

public class sank extends swat
{
public void method() {
	System.out.println("Child default method");
}
public void method1(int a)
{
	System.out.println("Child one parameterized method");
}
public void method2(int a, int b)
{
	super.method3(10,20,30);
	super.method();
	super.method1(10);
	super.method2(10, 20);
    this.method();
    this.method3(10,20,30);
    this.method1(10);
	System.out.println("Child two parameterized method");
}
public void method3(int a, int b, int c)
{
	System.out.println("Child three parameterized method");
}
public static void main(String[] args) 
{System.out.println("Assignment on super keyword & "
		+ "output should be in the below sequence");
	sank aara=new sank();
	aara.method2(10,20);
	
}
}
