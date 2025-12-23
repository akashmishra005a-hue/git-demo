package oopsinJava;
class polymorphism {
    String name;
    double type;

    public void sum(int a, int b) {

        System.out.println(a + b);
    }

    public void sum(double a, int b) {

        System.out.println(a * b);
    }
}
    class Check extends polymorphism
    {
        public void sum(int a,int  b)
        {
            System.out.println(a*b);
        }
    }
    class Check1 extends Check
    {
        public void sum(int a,int b)
        {
            System.out.println(a/b);
        }
    }

public class Practice {
    public static void main(String[] args) {
        polymorphism c = new polymorphism();
       c.sum(2,3);
       c = new Check();
       c.sum(2,3);
       c = new Check1();
      c.sum(3,1);
    }

}
