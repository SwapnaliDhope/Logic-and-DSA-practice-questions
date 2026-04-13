import java.util.Scanner;
public class positive
{
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        if(num>0)
        {
System.out.println("Positive Number");

        }
        else if(num<0)
        {
            System.out.println("Negative Number");

        }
        else if(num==0)
        {
            System.out.println("Its Zero");
        }

        
    }
}
