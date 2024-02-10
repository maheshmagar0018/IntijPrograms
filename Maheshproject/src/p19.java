//wap to check niven number
class p19
{
    public static void main(String[] args)
    {
        int n=24;
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        if(temp%sum==0)
        {
            System.out.println("niven number");
        }
        else{
            System.out.println("it is not niven number");
        }
    }
}