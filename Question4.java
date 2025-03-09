// Write a java program to print the following sequence:  0,2,1,4,1,8,2,16,3,32,5,64,8,... up to a given limit.

import java.io.*;
import java.util.*;
class JavaSequence{
    void EVEN(int n){
        int number1=0, number2=1, number3, i;
        System.out.print("Even and Fibonacci Series: ");
        for(i=1;i<=n;i++){
            
                System.out.print(number1+", "+(int)Math.pow(2,i)+", ");
                
                number3=number1+number2;
                number1=number2;
                number2=number3;
                
        }
    }
}
class Question4{
    public static void main(String[] args){
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to print Fibonacci and Even number: ");
        num=sc.nextInt();
        
        JavaSequence obj= new JavaSequence();
        obj.EVEN(num);
    }
}
