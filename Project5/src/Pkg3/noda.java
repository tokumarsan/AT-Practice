package Pkg3;

public class noda 
{
public void matsui(int a, int b)
{
int c;
c=a+b;
	System.out.println("Parent class "+c);
}
public static void main(String[] args) {
	noda kawai=new noda();
	kawai.matsui(1,2);
}
}
