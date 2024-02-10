class para
{
    public static void add(int a, int b)
    {
        int c = (a + b);
        System.out.println(c);
    }
        public static void sub(int a, int b)
        {
            int c = (a - b);
            System.out.println(c);
        }
            public static void div(int a, int b)
            {
                int c =(a / b);
                System.out.println(c);
            }
            public static void mult(int a,int b)
            {
                int c = (a*b);
                System.out.println(c);
            }
    public static void main(String [] args)
    {
        System.out.println("Using parameterised method");
        //add
        add(20,30);
        add(-12,98);
        add(233,45);
        add(67,9);
        //sub
        sub(20, 60);
        sub(43,56);
        sub(3,90);
        sub(19,54);
        //div
        div(12,23);
        div(3444444,34229);
        div(809,33);
        div(32,100);
        //mult
        mult(12,2);
        mult(2,400);
        mult(40,3);
        mult(109,78);
    }
}