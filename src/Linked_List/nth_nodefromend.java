package Linked_List;
import Linked_List.Node;
public class nth_nodefromend {
    public static Node nthNodelast(Node head,int v)
    {
        Node slow = head;
        Node fast = head;
        for(int i =1;i<=v;i++) fast = fast.next;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
//    public static Node  nthNodelast(Node head ,int n,int v)
//    {
//       Node temp = head;
//       for(int i =1;i<=n-v;i++){
//           temp = temp.next;
//       }
//       return temp;
//    }
    public static Node removeNThnode(Node head,int val)
    {
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=val;i++) fast = fast.next;
        if(fast==null) {
            return head.next;

        }

        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }
    public static int display(Node head)
    {
        int size = 0;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head = head.next;
            size++;
        }
        System.out.println();
        return size;
    }
    public static Node findIntersectionNode(Node h1,Node h2)
    {
        while(h1!=null&&h2!=null)
        {
            h1 = h1.next;
            h2 = h2.next;
            if(h1.next==h2.next){
               h1 = h1.next;
               return h1;

            }
        }
        return h2;
    }
    public static int size(Node head)
    {
        int size = 0;
        while(head!=null) size++;
        return size;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i =1;i<arr.length;i++){
            curr.next = new Node(arr[i]);
          curr = curr.next;
        }
        Node last = removeNThnode(head,2);
       int l1 = display(last);
//        System.out.println(l1);
//       int l2 =  display(f);
//        System.out.println(l2);
//        if(l1>l2){
//            for(int i=1;i<=l1-l2;i++)
//                a = a.next;
//        }
//        else{
//            int fixed = (-1)*(l1-l2);
//            for(int i=1;i<=fixed;i++)
//                f= f.next;
//        }
//    Node i = findIntersectionNode(a,f);
//        System.out.println(i.data);

    }
}
