package oopsinJava;

public class Constructor {
    public static class Crickter {
       private String name;
        int age;
        double average;

        public Crickter(String name, int age, double average) {
            this.name = name;
            this.age = age;
           this.average = average;
        }
//        public void print(){
//            System.out.println(name);
//            System.out.println(age);
//        }
////        copied constructor make
//        public Crickter(Crickter c){
//            this.name = c.name;
//            this.age = c.age;
//        }
        public Crickter(){

        }
        public int set(int age,Crickter c){
            c.age = age;
            return age;
        }

    }

    public static void main(String[] args) {
      Crickter c1 = new Crickter("akash", 18, 52.5);
        Crickter c2 = new Crickter("Aman", 20, 0.9);
        System.out.println(c2.set(12,c1));
////        System.out.println(c1.name);
////        System.out.println(c1.age);
////        System.out.println(c1.average);
////        System.out.println(c2.name);
////        System.out.println(c2.age);
////        System.out.println(c2.average);
//        Crickter c1 = new Crickter();
//        c1.name = "virat kohli";
//        c1.age  = 36;
//        c1.print();
//        Crickter c2 = new Crickter(c1);
//        c2.print();
    }
}
