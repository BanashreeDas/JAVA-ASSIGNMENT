import java.util.*;

class GreaterNumber
{
    void SumOfInteger(int num1,int num2){
        int X=num1, Y=num2, sum=0, rem=0;
        if(X>=100 && X<=200){
            for(int i=X;i<=Y;i++){
                if(i%7==0){
                    sum+=i;
                    System.out.print(i+" ");
                }
            }
            System.out.println("\nThe sum of the number: "+sum);
        }
        else{
            System.out.println("Error! Enter the only between 100 and 200");

        }
    }
}
class Question16
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Starting range X: ");
        int x=sc.nextInt();
        System.out.print("Enter the Ending Range Y: ");
        int y=sc.nextInt();
        GreaterNumber obj=new GreaterNumber();
        obj.SumOfInteger(x,y);
    }
}
