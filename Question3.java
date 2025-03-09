//  Write a java program to print a Fibonacci sequence where only first 8 positive prime numbers are present. 
// Also print the prime numbers separately.

import java.io.*;
import java.util.*;

class PositivePrime
{
    void Numbers(int n)
    {
        int number1=-1, number2=1, number3, i, j;
        System.out.print("Prime Fibonacci: ");
        for(i=1;i<=n;i++)
        {
            number3=number1+number2;
            number1=number2;
            number2=number3;

            if(number3>=2){
                int count=0;
                for(j=2;j*j<=n3;j++){
                    
                    if(number3%j==0){
                        
                        count++;
                        break;

                    }

                }
                if(count==0)
                System.out.print(number3+" ");
            }
            
        }
    }
}

public class Question3{
    public static void main(String[] args){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number you want to print Fibonacci Prime number: ");
        num=sc.nextInt();
        
        PositivePrime obj= new PositivePrime();
        obj.Numbers(num);

}
}
