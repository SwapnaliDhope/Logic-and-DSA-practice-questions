import java.util.Scanner;
public class pattern6
{
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int row=sc.nextInt();
        int count=0;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                count++;
                System.out.print(count+" ");

            }
            System.out.println();
        }
    }
    
}
