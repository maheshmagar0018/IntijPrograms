//wap to find factorial of anumber in range 1 to 10
class p20
{
    public static void main(String[] args) {
        for(int n=1;n<=10;n++)
        {
            int fact =1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            System.out.println(n+" "+ fact);
        }
    }
}