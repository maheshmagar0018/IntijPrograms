//wap to add all the digits numbers
class p13
{
    public static void main(String[] args) {
        int n=5926;
        int sum=0;
        while (n!=0)
        {
           int d=n%10;
           sum=sum+d;
           n=n/10;
        }
        System.out.println(sum);
    }
}