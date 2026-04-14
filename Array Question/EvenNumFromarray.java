
import java.util.Scanner;
class EvenNumFromarray
{
    public static void main(String []s)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter size of an array");
     int n=sc.nextInt();
     int arr[]=new int[n];
    int count=0;
    int count2=0;
    System.out.print("Enter array :");

     for(int i=0;i<n;i++)
     {
        arr[i]=sc.nextInt();

     }
     System.out.println("  sum of array :");
     for(int i=0;i<n;i++)
     {
         if(arr[i]%2==0)
         {
            System.out.println(arr[i]+" Is Even");
            count++;
         }
         else
         {
                        System.out.println(arr[i]+" Is Odd");
                        count2++;
         }
     }
     System.out.println("No Of Even Numbers in array :"+count);
          System.out.println("No Of Odd Numbers in array :"+count2);

   
    }

}