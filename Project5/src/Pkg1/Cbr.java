package Pkg1;

public class Cbr extends Honda
{
	public Cbr() 
	{
		this(10,20);
		System.out.println("Child default const");
	}
	public Cbr(int a)
	{
		this(10,20,30);
		System.out.println("Child one parameterized const");
	}
	public Cbr(int a, int b)
	{
		this(10);
		System.out.println("Child two parameterized const");
	}
	public Cbr(int a, int b, int c)
	{
	super(10);
		System.out.println("Child three parameterized const");
	}
	public static void main(String[] args) {
		Cbr monkey=new Cbr();
	}

}
