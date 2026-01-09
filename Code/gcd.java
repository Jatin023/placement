 class gcd {
    static int GCD(int a,int b)
    {
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(GCD(18,12));
    }
}
