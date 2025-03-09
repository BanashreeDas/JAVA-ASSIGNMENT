import java.io.*;
import java.util.*;
class Factors
{
    void NUMBERS(int num)
    {
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+", ");
            }
        }
    }
}
class Question12
{
    public static void main(String []a)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value: ");
        int x=sc.nextInt();
        
        Factors obj=new Factors();
        obj.NUMBERS(x);
    }
}
