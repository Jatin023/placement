import java.util.*;
public class removedupliarray {
    public static void main(String[] args) {
        
        int a[]={1,2,2,3,3,4,5};
        HashSet<Integer> set=new HashSet<>();

        for(int x:a)
        {
            set.add(x);
        }

        System.out.println(set);
    }
    
}
