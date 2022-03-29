package Pkg3;

public class nodachild extends noda
{
public void matsui(int y, int z)
{
	int x;
	x=y-z;
	System.out.println("Child class "+x);
}
public static void main(String[] args) 
{
	System.out.println("Assignment: Dynamic poly/"
			+ "run time poly/method overriding poly");
	nodachild idohata=new nodachild();
	idohata.matsui(20, 10);
}
}
