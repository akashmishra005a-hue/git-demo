package oopsinJava;
import java.util.*;
public class collection {
    public static void main(String[] args) {
        Comparator<Integer>com = new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
              return (a>b?1:-1);
            }
        };

        List<Integer> cllt = new ArrayList<Integer>();
        cllt.add(4);
        cllt.add(2);
        cllt.add(3);
        cllt.add(4);
        Collections.sort(cllt,com);
        System.out.println(cllt);


//       Set<Integer> sst = new HashSet<>();
//        sst.add(3);
//        sst.add(2);
//      sst.add(3);  //it remove the duplicate value//
//        System.out.println(sst);

//
//        Map<String,Integer>student = new HashMap<>();
//        student.put("akash",10);
//        student.put("aman",10);
//        student.put("ansh",10);
//        student.put("adam",10);
//        student.put("adam",10);
//        for(String s:student.keySet()){
//            System.out.println(s +" :"+student.get(s));
//        }
    }
}
