import java.util.Scanner;
public class Evenoddcount 
{
    public static void main(String []a)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Limit From 1 to");
         int limit=sc.nextInt();
         int count=0;
         int oddcount=0;
         for(int i=1;i<=limit;i++)
         {
            if(i%2==0)
            {
                count++;
            }else{
                oddcount++;
            }
         }
         System.out.println("Even Count :"+count);
         System.out.println("Odd Count :"+oddcount);

         
    }
    
}
