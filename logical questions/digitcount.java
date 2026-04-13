import java.util.Scanner;
public class digitcount {
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int count=0;
        while(num>0)
        {
            count++;
           num= num/10;

        }
        System.out.println("Count :"+count);


    }
}
