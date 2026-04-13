import java.util.Scanner;
public class evenindigit {
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Number");
        int num=sc.nextInt();
        int count=0;
        int oddcount=0;
        int sum=0;
        int sum2=0;
        while(num>0)
        {
            int dig=num%10;
            if(dig%2==0)
            {
                System.out.println(dig+" is even");
                count++;
                sum=sum+dig;
            }
            else{
                System.out.println(dig +" Is odd");
                oddcount++;
                sum2=sum2+dig;
            }
            num=num/10;

        }
        System.out.println("even count :"+count +" and sum of even numbers in  digit is :"+sum);
        System.out.println("Odd count :"+oddcount+" and sum of odd numbers in  digit is :"+sum2);
        
     

    }
}
