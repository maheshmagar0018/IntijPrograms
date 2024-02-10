//create multiplication table 1 to 4
class p21
{
    public static void main(String[] args) {
        for(int i =1;i<=10;i++)
        {
            for(int n=1;n<=4;n++)
            {
                System.out.print(n+"X"+i+"=");
                System.out.printf("%2d\t",n*i);
            }
            System.out.println();
        }
    }
}
