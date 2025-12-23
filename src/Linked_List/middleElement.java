package Linked_List;
public class middleElement {
   static int n;
    public static Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;
            while (fast!= null&&fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
    }

    public static Node deleteMiddleElement(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast.next.next!=null&&fast.next.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
         return head;
    }
    public static void display(Node temp)
    {
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
        System.out.println();
    }
    public static Node oddEvenList(Node head)
    {
        Node temp = head;
        Node even = new Node(100);
        Node eventemp = even;
        Node odd = new Node(101);
        Node oddtemp = odd;
        while(temp!=null){
            if(temp.data%2==0){
                eventemp.next = temp;
                eventemp = eventemp.next;
            }
            else{
                oddtemp.next = temp;
                oddtemp = oddtemp.next;

            }
            temp = temp.next;
        }
            eventemp.next = odd.next;
        oddtemp.next = null;
        return even.next;
    }
    public static Node removeDuplicate(Node head)
    {
        Node temp = head;
        while(temp!=null&&temp.next!=null) {
            if (temp.data != temp.next.data)  temp = temp.next;
             else {
                 Node a = temp;
                 while(a.data==a.next.data) {
                     a  = a.next;

                     if(a.next==null) break;
                 }
                 temp.next = a.next;
                 temp = a.next;
                 }

        }
        return head;
    }
    public static Node reverseList(Node head)
    {
        if(head==null||head.next==null) return head;
        Node temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
    public static Node iterateReverseList(Node head)
    {
        Node current  = head;
        Node prev = null;
        Node agla = null;
        while(current!=null){
            agla = current.next;
            current.next = prev;
            prev = current;
            current = agla;
        }
        return prev;
    }
    public static Node  makeConnection(int...val)
    {
         Node head = new Node(val[0]);
         Node current = head;
         n = val.length;
         for(int i =1;i<n;i++){
             current.next = new Node(val[i]);
             current = current.next;
         }
         return head;
    }
    public static void main(String[] args) {
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//        Node n5 = new Node(5);
//        Node n6 = new Node(6);
//        Node n7 = new Node(6);
//        Node n8 = new Node(7);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
//        n5.next = n6;
//        n6.next = n7;
//        n7.next = n8;
       Node head =  makeConnection(1,2,3,4,5,6);
        display(head);
        Node i =middleNode(head);
        System.out.println(i.data);
//        display(i);



    }
}
