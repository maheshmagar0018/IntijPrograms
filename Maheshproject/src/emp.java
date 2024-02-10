class emp
{
    int  num;
    String  name;
    double  sal;
    emp()
    {
        System.out.println("no argument constructor");
    }
    emp(int num)
    {
        this.num=num;
    }
    emp(int num,String name)
    {
        this.num=num;
        this.name=name;
    }
    emp(int num,String name,double sal)
    {
        this.num=num;
        this.name=name;
        this.sal=sal;
    }

    public static void main(String[] args)
    {
        emp E1 = new emp(18,"Virat",9900000);
        System.out.println("num: "+ E1.num);
        System.out.println("name: "+E1.name);
        System.out.println("sal: "+E1.sal);

        System.out.println("***************************");

        emp E2 = new emp(45,"Rohit",670000);
        System.out.println("num: "+ E2.num);
        System.out.println("name: "+E2.name);
        System.out.println("sal: "+E2.sal);

        System.out.println("***************************");

        emp E3 = new emp(7,"Mahii",860000);
        System.out.println("num: "+ E3.num);
        System.out.println("name: "+E3.name);
        System.out.println("sal: "+E3.sal);

    }
}
