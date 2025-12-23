package oopsinJava;

public class Static{

    public static void main(String[] args) {

        Testing t1 = new Testing(2,"akash",45.5);
        t1.commonname = 100;
        System.out.println(t1.commonname);
        Testing t2 = new Testing(3,"amna",45.5);
        System.out.println(t2.commonname);
        Testing t3 = new Testing(3,"amna",45.5);
        System.out.println(t3.commonname);
//        Testing.commonname = 95;
//        System.out.println(Testing.commonname);


////        t1.setCommonname(23);
////        System.out.println(t1.getCommonname());
//        Testing.setCommonname(12);
//        System.out.println(Testing.getCommonname());

    }
}
