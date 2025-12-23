package oopsinJava;
 class  Outer
{
    void display()
    {
        System.out.println("in outer ");
    }

}

public class AnonoymsClass {
    public static void main(String[] args) {
        Outer obj = new Outer() {
            public  void diplay() {
                System.out.println("in Annpnyms class method ");
            }
        };
        obj.display();
    }
}
