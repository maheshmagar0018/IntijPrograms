// wap to print all the digits from the number.
class P14
{
    public static void main(String[] args) {
        int n = 123456789;
        while(n !=0)
        {
            int d=n%10;
            System.out.println(d);
            n=n/10;
        }
    }
}