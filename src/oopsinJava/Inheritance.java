package oopsinJava;
import java.util.Scanner;
 class Mobile{
    final int a = 4;
     public void display(){
        System.out.println("it has andriod operating system");
    }
}
class Realme extends Mobile {
    int ram;
    int storage;
    public void display() {
        this.ram = ram;
        this.storage = storage;
        System.out.println(ram);
        System.out.println(storage);
    }
}
class Samsung extends Realme{
    public void show(){
        System.out.println("it has spical features like camera and pixel quality");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Realme r = new Realme();
       r.display();
      Samsung s = new Samsung();
      Mobile m = new Mobile();


//      s.display();
//      s.show();
//      s.display(4,61);


    }
}
