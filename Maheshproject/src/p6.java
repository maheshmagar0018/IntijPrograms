//WAP to print the first 10 numbers from fibonacci series
 class p6
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        System.out.print(a+ " " + b + " ");
        for (int i =1; i<=8; i++)
        {
            int c=a+b; //next term
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}

