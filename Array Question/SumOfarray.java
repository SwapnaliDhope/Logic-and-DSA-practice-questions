
import java.util.Scanner;
class SumOfarray
{
    public static void main(String []s)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of an array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     int sum=0;
    System.out.println("Enter array :");

     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();

     }
     System.out.println("  sum of array :");
     for(int i=0;i<n;i++)
     {
           sum=sum+arr[i]; 
     }
     System.out.println(sum);
    }

}