package oopsinJava;
class A extends Object
{
    public A()
    {
        super();
        System.out.println("default constructor A");
    }
    public A(int n)
    {
        super();
        System.out.println("default constructor A int a");
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("default constructor in B");

    }
    public B(int a)
    {

        this();
        System.out.println("constructor in B in int b");
    }
}
public class super_and_this {
    public static void main(String[] args) {
        B obj = new B(3);
    }
}
