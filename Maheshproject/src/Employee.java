class Employee
{
    int num;
    String name;
    double sal;

    Employee() {
        System.out.println("no formal arguments");
    }

    Employee(int num) {
        this();
        this.num = num;
        System.out.println("1FA");
    }

    Employee(int num, String name) {
        this(num);
        this.name = name;
        System.out.println("2FA");
    }

    Employee(int num, String name, double sal) {
        this(num, name);
        this.sal = sal;
        System.out.println("3FA");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(23, "vinay", 89000);
        System.out.println("num: " + e1.num);
        System.out.println("name: " + e1.name);
        System.out.println("sal: " + e1.sal);
    }
    {
        System.out.println("IIB");
    }

}

