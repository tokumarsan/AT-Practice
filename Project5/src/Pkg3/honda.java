package Pkg3;

public class honda 
{
public void cbr(int a, int b)
{
int d;
d=a+b;
System.out.println("sum result is "+d);
}
public void cbr(int a1, int b1, int c1)
{
	int d1;
	d1=a1*b1*c1;
	System.out.println("multi result is "+d1);
}
public static void main(String[] args) 
{
	System.out.println("Assignment: Static poly/Compile run poly/Method overloading poly");
	honda cbz=new honda();
	cbz.cbr(10,20);
	cbz.cbr(2,3,4);
}
}
