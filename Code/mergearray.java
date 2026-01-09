public class mergearray {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]={5,6,7,8};
        int c[]=new int[a.length+b.length];
        int i=0;

    for(int j=0;j<a.length;j++)
    {
        c[i]=a[j];
        i++;
    }
     for(int j=0;j<b.length;j++)
    {
        c[i]=b[j];
        i++;
    }

    for(int k=0;k<c.length;k++)
    {
        System.out.println(c[k]);
    }
    }
}
