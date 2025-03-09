import java.io.*;
import java.util.*;

class PowerNumber
{
	void JAVA(int a,int b)
	{
		System.out.print("The power of that number: "+(int) Math.pow(a,b));   // here use Math.pow Function
	
	}
}
class Question11
{
	public static void main(String []a)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.print("Enter the value of y: ");
		int y=sc.nextInt();
		
		PowerNumber obj=new PowerNumber();
		obj.JAVA(x,y);
	
	}
}
