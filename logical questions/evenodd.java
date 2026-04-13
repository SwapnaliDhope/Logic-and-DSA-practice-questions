import java.util.Scanner;
class evenodd{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any Number");
      int num=sc.nextInt();
      if(num%2==0)
      {
        System.out.println(num+" Is a Even Number");
      }
      else{
            System.out.println(num+" Is  a Odd Number");

      }
    }
}