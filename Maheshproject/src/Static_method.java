class insta
{
    String un;                      //non-static variable
    public static void main(String[] args) {
        insta ref1 = new insta();
        ref1.un= "sheela";
        insta ref2 = new insta ();
        ref2.un = "leela";
        insta ref3 = new insta();
        ref3.un = "sunny";
        System.out.println("username 1 : " + ref1.un);
        System.out.println("username 2 : " + ref2.un);
        System.out.println("username 3 : " + ref3.un);
    }
}