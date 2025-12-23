package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        System.out.println(dq);
        dq.addFirst(0);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
