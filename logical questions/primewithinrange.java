public class primewithinrange {
    public static void main(String []a)
    {
        boolean isprime=false;
        for(int i=2;i<=50;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    isprime=false;   break;            
                }
                else
                {
                    isprime=true;
                }
            }
          if(isprime)
          {
            System.out.println(i);
          }
        }
    }
}
