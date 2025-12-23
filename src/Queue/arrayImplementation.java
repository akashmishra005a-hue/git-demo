package Queue;

import java.util.LinkedList;
import java.util.Queue;

class queue{
    int [] arr = new int[10];
    int front = 0;
    int rare = 0;
    int size = 0;

    void add(int val){
        arr[rare] = val;
        rare++;
        size++;
    }
    int remove(){
        int x = arr[front];
        arr[front] = 0;
        front++;
        size--;
        return x;
    }
    int peek(){
        return arr[front];
    }
    void display(){
        for(int i = front;i<rare;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
public class arrayImplementation {
    public static void main(String[] args) {
      queue q = new queue();
      q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
     q.display();
        System.out.println("size is "+q.size);
        System.out.println("peek value is "+q.peek());
        q.remove();
        q.display();
        System.out.println("size is "+q.size);
        System.out.println("peek value is "+q.peek());
        q.remove();
        q.display();
        System.out.println("size is "+q.size);
        System.out.println("peek value is "+q.peek());
        q.remove();
        q.display();
        System.out.println("size is "+q.size);
        System.out.println("peek value is "+q.peek());
        q.remove();
        q.display();
        System.out.println("size is "+q.size);
        System.out.println("peek value is "+q.peek());
        q.remove();



    }

}
