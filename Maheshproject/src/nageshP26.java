class dhirubhai
{
    String company ="reliance industry";
    public void thinkingStyle()
    {
        System.out.println("dhirubhai's unique thinkingStyle...!!!");
    }
}
class mukesh extends dhirubhai
{
}
class mumbai
{
    public static void main(String[] args)
    {
        mukesh ref=new mukesh();
        System.out.println(ref.company);
        ref.thinkingStyle();
    }
}