import java.util.Scanner;

class palidrome
{
    public static void main(String []s)
    {
           Scanner sc=new Scanner(System.in);
          System.out.println("Enter a Number");
          int num=sc.nextInt();
          int rev=0;
          int num2=num;
            while (num>0) 
            {
              int digit=num%10;
              rev=(rev*10)+digit; 
              num=num/10;             
            }
          if(num2==rev)
          {
            System.out.println("Number is palindrome");
          }
          else
            {
            System.out.println("Number is not palindrome");
          }

          
    }
}