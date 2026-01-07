import java.util.*;

public class palindrome {
    public static void main(String[] args)
    {
        String str="madam";
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();

        if(str.equals(sb.toString()))
        {
            System.out.println(sb);
        }
        else{
            System.out.println("no");
        }
    }
}
