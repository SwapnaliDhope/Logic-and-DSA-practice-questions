import java.util.Scanner;
public class reversenum {
    public static void main(String []a)
    {
        Scanner sc=new  Scanner(System.in);
        System.out.println("ENter a number");
        int num=sc.nextInt();
        int number=num;
        int rev=0;
        while(num>0)
        {
            int digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;


        }
       System.out.println("Reversed number :"+rev);



    }
}
