interface I1
{
    void test();
}
interface I2
{
    void test();
}
//implementing class
class c3 implements I1,I2
{
    public void test()
    {
        System.out.println("providing body/implements");
    }
}
class driver2
{
    public static void main(String[] args) {
        I1 ref = new c3();
        ref.test();
    }
}