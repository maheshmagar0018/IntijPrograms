class p14
{
    public static void main(String[] args)
    {
        int n =736;
        while(n!=0)
        {
            int d=n%10;
            int fact =1;
            for(int i=1;i<=d;i++)
            {
                fact=fact*i;

            }
            System.out.println(fact);
            n=n/10;
        }
    }
}