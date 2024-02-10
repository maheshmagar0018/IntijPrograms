public class global_member {
    static boolean a;
    static int b;
    public static void qsp()
    {
        System.out.println("qsp b");
        System.out.println(a);
        System.out.println(b);
        a = true;
        b=10;
        test();
        System.out.println("qsp e");
    }
    public static void test()
    {
        System.out.println("test b");
        System.out.println(a);
        System.out.println(b);
        a=false;
        b=20;
        System.out.println("test e");
    }
    static{
        System.out.println("sib-1");
    }

    public static void main(String[] args) {
        System.out.println("mb");
        int a=25;
        a=30;
        qsp();
        System.out.println(a);
        System.out.println(global_member.a);
        System.out.println(b);
        System.out.println("me");
    }
    static{
        test();
    }
}
