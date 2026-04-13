import java.util.Scanner;
public class armstrong {
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int number=num;
        int sum=0;
        while(num>0)
        {
         int digit=num%10;
         sum=sum+(digit*digit*digit);
         num=num/10;

        }
        if(number==sum)
        {
            System.out.println("Number is Armstrong");

        }else{
            System.out.println("Not a armstrong");
        }
    }
}
