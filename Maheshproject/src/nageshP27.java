class p1
{
    int i=50;
    {
        System.out.println("IIB-super-class");
    }
}
class p2 extends p1
{
    {
        System.out.println("IIB-sub-class");
    }
}
class driver
{
    public static void main(String[] args) {
        p2 ref=new p2();
        System.out.println(ref.i);
    }
}