import java.util.Scanner;
public class sumofdigits {
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Number");
        int num=sc.nextInt();
        int sum=0;
        while(num>0)
        {
            int dig=num%10;
            sum=sum+dig;
            num=num/10;

        }
        System.out.println("sum of each digit in number :"+sum);
     

    }
}
