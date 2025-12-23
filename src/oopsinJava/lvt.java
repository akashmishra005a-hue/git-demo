package oopsinJava;

public class lvt {
//    var v = 12; IT can not be used as instance Varriable
    public static void main(String[] args) {
       var a = 'A';
        System.out.println(a);
        int var = 234;
        System.out.println(var);
        var v  = new int[10];
        for(int i =0;i<v.length;i++) v[i] = i;
        for(int x : v) System.out.print(x+" ");

    }
}
