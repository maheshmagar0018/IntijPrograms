//special number
class p15
{
    public static void main(String[] args) {
        int n=69;
        int temp=n;
        int sum=0;
        int prod=1;
        while(n!=0)
        {
            int d=n%10;
            sum =sum+d;
            prod =prod*d;
            n=n/10;
        }
        int res=sum+prod;
        if(temp==res)
        {
            System.out.println("special number");
        }else {
            System.out.println("it is not a special number");
        }
    }
}