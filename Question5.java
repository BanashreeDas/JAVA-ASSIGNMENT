//Write a java program to print the following sequence:  0,-1,1,-4,1,-7,2,-10,3,-13,5,-16,8,... up to a given limit.

import java.io.*;
import java.util.*;

class SequenceLimit
{

    void Num(int n){
        int num1=0, num2=1, num3, i,a=-1, d=-3;
        System.out.print("Sequence of Series: ");
        for(i=1;i<=n;i++){
        
            System.out.print(num1+", "+a+", ");
            a+=d;
            num3=num1+num2;
            num1=num2;
            num2=num3;
        }
    }
}

class Question5{
    public static void main(String a[]){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to print: ");
        num=sc.nextInt();
        SequenceLimit obj=new SequenceLimit();
        obj.Num(num);
    }
}
