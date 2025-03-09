import java.io.*;
import java.util.*;

class PalindromeNumbers{
    void Reverse(int num){
        int rem=0, rev=0;
        int X=num;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }
        
        if(X==rev){
            System.out.println(rev+" : This is a Palindrome number");
            }
        else 
            System.out.println(rev+" : This number is not Palindrome Number");
    }
}
class Question14
{
    public static void main(String []a){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter you number: ");
        int x=sc.nextInt();
        PalindromeNumbers obj=new PalindromeNumbers();
        obj.Reverse(x);
    }
}
