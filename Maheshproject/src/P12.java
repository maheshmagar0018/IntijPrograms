// wap to print all the even digits from the number
class P12
{
    public static void main(String[] args) {
        int n = 123456789;
        while(n!=0)
        {
            int d=n%10;
            if(d%2==0)
            {
                System.out.println(d);
            }n=n/10;
        }
    }
}
