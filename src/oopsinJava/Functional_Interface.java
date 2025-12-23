package oopsinJava;
@FunctionalInterface
interface Lemda {
    void sum(int a, int b);
}
public class Functional_Interface {
    public static void main(String[] args) {
        Lemda l =( a, b) -> {
            System.out.println("by using lemada ");
            System.out.println(a+"a"+b+"b");
        };
        //interally lemda work neeeeche ke tarah hi kargea//
//        Lemda l = new Lemda() {
//            @Override
//            public void sum(int a, int b) {
//                return a+b;
//            }
//        };
        l.sum(2,3);

    }
}
