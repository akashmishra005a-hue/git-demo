package Linked_List;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }


}
public class Intilization {
    static void printNodeList(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    static void reverseDisplay(Node head){
        if(head==null) return;
        reverseDisplay(head.next);
        System.out.print(head.data+" ");
    }
    static int  Length(Node a){
        if(a.next==null) return 1;
        return Length(a.next)+1;
    }
    static void Display(Node head) {
        while (head!=null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

    }
    public static Node makeConnection(int...values)
    {
        Node head = new Node(values[0]);
        Node temp = head;
        for(int i=1;i< values.length;i++){
            temp.next = new Node(values[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
//        Node _1 = new Node(1);
//        Node _2= new Node(2);
//        Node _10 = new Node(10);
//        Node _3= new Node(3);
//        Node _4= new Node(4);
//        Node _5= new Node(5);
//        _1.next = _2;
//        _10.next = _3;
//        _2.next = _10;
//        _3.next = _4;
//        _4.next = _5;
//        int[]arr = {1,2,3,4,5};
//        Node head = new Node(arr[0]);
//        Node current  = head;
//        for(int i = 1;i<arr.length;i++){
//            current.next = new Node(arr[i]);
//            current = current.next;
//        }
        Node head = makeConnection(1,2,3,4,5);
        Display(head);
//       printNodeList(_1);
//        System.out.println("reverse is ");
//      reverseDisplay(_1);
//        System.out.println(  Length(head));



    }
}