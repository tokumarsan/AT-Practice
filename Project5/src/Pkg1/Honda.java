package Pkg1;

public class Honda 
{
public Honda() 
{
System.out.println("Parent default constructor");	// TODO Auto-generated constructor stub
}
public Honda(int a)
{
	this(10,20,30);
	System.out.println("Parent one parameterized const");
}
public Honda(int a, int b)
{
	this();
	System.out.println("Parent two parameterized const");
}
public Honda(int a, int b, int c)
{
	this(10,20);
	System.out.println("Parent three parameterized const");
}

}
