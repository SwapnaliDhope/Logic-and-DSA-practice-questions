import java.util.Scanner;
public class Pyramid1
{
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
    
}
