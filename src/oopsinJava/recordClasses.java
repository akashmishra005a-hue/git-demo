package oopsinJava;
//class Programmer
//{
//    private final int id;
//    private final String name;
//
//   public Programmer(int id,String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Programmer{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//    public String getName(){
//       return name;
//    }
//}
record Programmer(int id,String name){


    public Programmer(){
        this(0,"");
    }

    Programmer(int id, String name) {
        this.id = id;
        this.name = name;
    }



}
public class recordClasses {
    public static void main(String[] args) {
        Programmer p = new Programmer(1,"AKahs ");
        Programmer p1 = new Programmer(2,"Aman");
        Programmer p2 = new Programmer();
        System.out.println(p);
        System.out.println(p1.id());

    }
}
