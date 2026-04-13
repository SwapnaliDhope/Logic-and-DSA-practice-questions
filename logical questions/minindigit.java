import java.util.Scanner;
public class minindigit 
{
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter Number");
        int num=sc.nextInt();
        int min=9;
        while(num>0)
        {
            int dig=num%10;
        if(min>dig)
        {
             min=dig;
        }
            num=num/10;

        }
      System.out.println("Minimum digit in number is : "+min);
        
     

    }
}
