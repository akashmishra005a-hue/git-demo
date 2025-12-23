package Queue;
class Node{
    int val;
    Node next;
   static Node head = null;
     static Node tail = null;

    public Node(int val){
        this.val = val;
    }
}
public class LinkedListImplementation {
    static class queueL{
        int size = 0;
        void add(int val){
            Node temp = new Node(val);
           if(Node.head==null) Node.head = Node.tail = temp;
           else{
               Node.tail.next = temp;
              Node.tail = temp;
           }
         size++;
        }
        int remove(){
            if(size==0){
                System.out.println("Queue is empty ");
                return -1;
            }
            int val = Node.head.val;
           Node.head = Node.head.next;
           size--;
           return val;
        }
        int peeK(){
            if(size==0){
                System.out.println("Queue is empty ");
                return -1;
            }
            return Node.head.val;
        }
        void display(){
            Node temp = Node.head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueL ll = new queueL();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.display();
        System.out.println("peak value is "+ll.peeK());
        System.out.println("size is "+ll.size);
        ll.remove();
        ll.display();
        System.out.println("peak value is "+ll.peeK());
        System.out.println("size is"+ll.size);
        ll.remove();
        ll.display();
        System.out.println("peak value is "+ll.peeK());
        System.out.println("size is "+ll.size);
        ll.remove();
        ll.display();
        System.out.println("peak value is "+ll.peeK());
        System.out.println("size is "+ll.size);
        ll.remove();
        ll.display();
        System.out.println("peak value is "+ll.peeK());
        System.out.println(ll.size);
        ll.remove();
        ll.remove();



    }

}
