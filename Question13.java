import java.io.*;
import java.util.*;

class SUM
{
    int SumOfPrime(int num)
    {
        int c=0;
        if(num<2){
            System.out.println(num+" is not a prime number");
            return 0;
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                c++;
                break;
            }
        }
        if(c ==0)
        {
            System.out.println(num+" is a prime number");
            return num;
        }
        else{
            System.out.println(num+" is not prime number");
        }
        return 0;
    }
}
class Question13
{
    public static void main(String []args){
        int sum=0, x, y;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x=sc.nextInt();
        System.out.print("Enter the second number: ");
        y=sc.nextInt();
        
        SUM obj=new SUM();
        int X=obj.SumOfPrime(x);
        int Y=obj.SumOfPrime(y);
        sum=X + Y;
        if(X !=0 && Y !=0)
        {
            obj.SumOfPrime(sum);
             System.out.println("Sum of two Prime number: "+sum);
        }
        else{
            System.out.println("Number are not Prime Number");
        }
    }
}
