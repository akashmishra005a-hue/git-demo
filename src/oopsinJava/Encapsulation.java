package oopsinJava;
class Databind
{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
       return name;
    }
    public void setAge(int age,Databind obj){
        obj.age = age;
    }
    public void setName(String s){
        name = s;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Databind obj = new Databind();
       obj.setAge(10,obj);
       obj.setName("akash");
        System.out.println(obj.getName()+" :"+obj.getAge());
    }
}
