
import java.util.Scanner;
class FindElement
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
     System.out.println("Enter Element to find :");
     int element=sc.nextInt();
     boolean found=false;
     int count=0;
     for(int i=0;i<n;i++)
     {
      if(element==arr[i])
      {
           found=true;
         count++;
     }
     
     }
     if(found)
     {        System.out.println("Elment Found "+ count+" Times");
}else
{
                 System.out.println("Elment Not Found");

}
    }
}