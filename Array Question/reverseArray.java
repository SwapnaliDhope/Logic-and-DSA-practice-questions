import java.util.Scanner;
public class reverseArray {
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter SIze of array :");
        int size=sc.nextInt();
       System.out.println("enter Array :");
       int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int start=0;int last=size-1;
        while(start<last)
        {
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;

        }
        System.out.println("Reversed array :");
        for(int i=0;i<size;i++)
        {
                                System.out.println(arr[i]);

        }
      

    }
}
