
import java.util.Scanner;
class MinOfarray
{
    public static void main(String []s)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of an array");
     int n=sc.nextInt();
     int arr[]=new int[n];
        System.out.print("Enter array :");

     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();

     }
      int min=arr[0];
     System.out.println("Here is your minimum of array :");
     for(int i=0;i<arr.length;i++)
     {
       if(arr[i]<min)
       {
        min=arr[i];
       }

     }
      System.out.println(min);
           

    }
}