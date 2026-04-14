import java.util.Scanner;
public class pattern2 
{
    public static void main(String []s)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of Rows");
        int row=sc.nextInt();
        for(int i=row;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
    }
    
}
