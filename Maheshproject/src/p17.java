//wap to check if the number is palindroms or not
class p17
{
    public static void main(String[] args)
    {
        int n=1221;
        int temp=n;
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp == rev)
        {
            System.out.println("palindroms number");
        }
        else{
            System.out.println("choti bacchi he kya");
        }
    }
}