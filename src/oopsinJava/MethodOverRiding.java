package oopsinJava;
class Aa
{
    public void add(int a,int b)
    {
        System.out.println("in aaa");
    }
}
class Bb extends Aa
{
    public void add(int a,int b)
    {
        System.out.println("in bbbb");
    }
}
public class MethodOverRiding {
   public static void main(String[] args) {
//        Bb obj = new Aa();
        Aa obj1 = new Bb();
        //it cannot possible to create the parent object with the refrece of child//
       //its possible to create child object with parent refrence//
        obj1.add(2,3);
    }
}
