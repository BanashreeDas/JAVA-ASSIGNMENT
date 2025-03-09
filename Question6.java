import java.io.*;
import java.util.*;
class Factorial
{
	void fact(int num){
		int i, f=1;
		System.out.print("Factorial: ");
		for(i=1;i<=num;i++){
			f*=i;
			
			
		}
		System.out.print(f);
	}
}
class Question6{
	public static void main(String a[]){
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number you want to print the sequence:");
		n=sc.nextInt();
		Factorial obj=new Factorial();
		obj.fact(n);
	}

}
