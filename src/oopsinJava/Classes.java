package oopsinJava;
 class Student {
     public int a;
     String name = "akash";
    public  int rollno;
    double percentage;
    public Student(){
        rollno++;
    }
        public  void change(Student a) {
         a.name = "aman";
        }
}
public class Classes {
    public static void main(String[] args) {
       Student s1 =  new Student();
        Student s2 =  new Student();
        Student s3 =  new Student();
        Student s4 =  new Student();
        System.out.println(s4.rollno);
//Testing t1 = new Testing("asjdnsj");
//t1.name = "akash";
//        s1.name = "akash";
//        s1.rollno = 1;
//        s1.percentage =90.7;
       System.out.println(s1.name);
      s1.change(s1);
        System.out.println(s1.name);


    }
}
