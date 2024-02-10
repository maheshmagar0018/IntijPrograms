//wap to print the first 10 numbers from the lucas series
class p18
{
    public static void main(String[] args) {
        int a=2;
        int b=1;
        System.out.print(a+ " " + b + " ");
        for(int i=1; i<=8; i++)
        {
            int c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }
    }
}