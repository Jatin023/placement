import java.util.*;

public class checkprime{
    public static void main(String[] args)
    {
        int a=28;
        boolean isPrime=true;

        if(a<=1)
        {
            isPrime=false;
        }
        else{
            for(int i=2;i*i<a;i++)
            {
                if(a%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("NOT prime");
        }
    }
}