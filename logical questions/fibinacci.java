import java.util.Scanner;
public class fibinacci 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of terms");
        int term=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1;i<=term;i++)
        {
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
