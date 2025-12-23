package Queue;

import java.util.LinkedList;
import java.util.Queue;


public class BasicsStl {
    public static void reversePrintQueue(Queue<Integer>q){
        if(q.size()==0) return;
        int x = q.remove();
        reversePrintQueue(q);
        System.out.print(x+" ");
        q.add(x);
    }
    public static void main(String[] args) {
       Queue<Integer> qe = new LinkedList<>();
       Queue<Integer>helper = new LinkedList<>();
         qe.add(1);
         qe.add(2);
         qe.add(3);
         qe.add(4);
         qe.add(5);
//        for(int i =qe.size();i>0;i--){
//            System.out.print(qe.peek()+" ");
//            helper.add(qe.remove());
//        }
//        while(helper.size()>0){
//            qe.add(helper.remove());
//        }

        reversePrintQueue(qe);
        System.out.println(qe);
    }
}
