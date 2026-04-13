import java.util.Scanner;
public class maxindigit {
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Number");
        int num=sc.nextInt();
        int max=0;
        while(num>0)
        {
            int dig=num%10;
        if(max<dig)
        {
             max=dig;
        }
            num=num/10;

        }
      System.out.println("Maximum digit in number is : "+max);
        
     

    }
}
