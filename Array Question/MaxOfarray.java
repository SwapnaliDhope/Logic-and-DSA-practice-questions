
import java.util.Scanner;
class MaxOfarray
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
      int max=arr[0];
     System.out.println("Here is your max of array :");
     for(int i=0;i<n;i++)
     {
       if(max<arr[i])
       {
        max=arr[i];
       }
     }
            System.out.println(max);

    }
}