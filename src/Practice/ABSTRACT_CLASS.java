package Practice;

abstract class declare{
    abstract public void make();
}
//class define extends declare{
//    public void make(){
//        System.out.println("define method in a concreate class");
//    }
//    define(){
//        System.out.println("object is crretae ");
//    }
//}
public class ABSTRACT_CLASS
{
    public static void main(String[] args) {
//        new define().make();
//        new define().make();
//        declare d = new define();
//        d.make();
//        d.make();
        declare d = new declare(){
            public void make(){
                System.out.println("acceses by anonyms classs ");
            }
        };
        d.make();


    }
}
