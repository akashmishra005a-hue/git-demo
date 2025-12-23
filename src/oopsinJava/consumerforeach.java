package oopsinJava;
import java.sql.Array;
import java.util.*;
import java.util.function.Consumer;

public class consumerforeach {
    public static void main(String[] args) {
        Consumer<Integer> c = new Consumer<Integer>(){
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        List<Integer> l =  Arrays.asList(1, 2, 3, 45, 6);
       l.forEach(c);
    }
}




































