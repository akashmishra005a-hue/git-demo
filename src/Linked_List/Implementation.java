
package Linked_List;
class Linkedlist
{
   Node Head=null;
   Node Tail = null;
   int size = 0;

   void InsertAtTail(int val){
      Node temp = new Node(val);
      size++;
      if(Head==null){
          Head = Tail = temp;
      }
      Tail.next = temp;
      Tail = temp;
   }
 void InserAtHead(int val)
   {
       Node temp = new Node(val);
       if(Head==null) Head=Tail=temp;
    else{
        temp.next = Head;
           Head = temp;
           size++;
       }

   }
   void InsertAt(int idx,int val)
   {
      Node temp = new Node(val);
      Node a = Head;
      for(int i =1;i<=idx-1;i++){
          a.next = a;
      }
        temp.next = a.next;
      a.next = temp;
      size++;
   }
   void DeleteAtHead()
   {
       if(Head==null){
           System.out.println("There is no element for deletion");
           return;

       }
       Node temp = Head;
       Head = Head.next;
       size--;

   }
   void DelteAtidx(int idx)
   {
       if(idx==0){
           DeleteAtHead();
           return;
       }
        Node temp = Head;
       for(int i =1;i<=idx-1;i++){
          temp = temp.next;
       }
       temp.next = temp.next.next;
       size--;
   }
   void deleteAtTail()
   {
       if(Head==null){
           System.out.println("liist is empty");
           return;
       }
       if(Head.next==null) {
           Head = Head.next;
           return;
       }
       Node temp = Head;
       while(temp.next.next!=null)
       {
           temp = temp.next;

       }
       temp.next = null;
   }
   void Display()
   {
       Node temp = Head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
       System.out.println();
   }
   Node getIdx(int idx)
   {
           Node temp = Head;
      for(int i =1;i<=idx;i++){
          temp = temp.next;
      }
      return temp;
   }
}
public class Implementation {
    public static void main(String[] args) {
        Linkedlist l = new Linkedlist();
//        l.InsertAtTail(1);
//        l.InsertAtTail(2);
//        l.InsertAtTail(3);
        l.InserAtHead(10);
        l.InserAtHead(11);
        l.InserAtHead(12);
        l.InserAtHead(13);

        l.Display();
//        l.InsertAt(1,9);
//        l.Display();
//         l.deleteAtTail();
//        l.Display();
//        l.deleteAtTail();
//        l.Display();

    }
        }








