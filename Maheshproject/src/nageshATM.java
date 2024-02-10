class ATM
{
    private double money=85000.9;
//getter method --->to get private data
    public double getMoney()
    {
        return money;
    }
//setter method --->to set/modify private data
    public void setMoney(double money)
    {
        this.money=money;
    }
    public void withdraw()
    {
        System.out.println("you can withdraw money, enjoy...!!!");
    }
}
//driver class
class SBI
{
    public static void main(String[]args)
    {
        ATM ref=new ATM();
        ref.setMoney(125000);
        System.out.println("Total amount in ATM: "+ ref.getMoney());
        ref.withdraw();
    }
}