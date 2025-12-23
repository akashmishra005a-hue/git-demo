package oopsinJava;
interface X
{
   void show();
    void config();
}
interface I extends X
{
void display();
}

class Y implements X,I
{
   @Override
    public void show() {
        System.out.println("in show method ");
    }
    public void config(){
        System.out.println("in a config");
    }
    public void display(){
        System.out.println("in a display  method ");
    }
}
public class Interface {
    public static void main(String[] args) {
        X obj;
        obj = new Y();
        obj.show();
        obj.config();
        I obj1 = new Y();
        obj1.show();
        obj1.show();


    }
}
