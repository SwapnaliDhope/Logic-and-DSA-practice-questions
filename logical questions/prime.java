
import java.util.Scanner;
public class prime 
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter  a Number");
      int num=sc.nextInt();
      boolean isprime=false;
      if(num<0)
      System.out.println( num+ "  is Not Prime");
         
      for(int i=2;i<num;i++)
      {
        if(num%i==0)
        {
          isprime=false;
          break;
        }
        else{
            isprime=true;
        }
        }
        if(isprime)
        {
            System.out.println( num+ " is  a prime number");

        }else{
                        System.out.println( num+ " is not a prime number");
        }
        }
      

}

