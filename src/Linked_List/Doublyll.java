package Linked_List;

class  Dnode {
    int val;
    Dnode next;
    Dnode prev;
    static Dnode head = null;
    static Dnode tail = null;

    Dnode(int val) {
        this.val = val;
    }

    public static void dispalyrev(Dnode tail) {
        Dnode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }

        
        System.out.println();
    }

    public static void displayHead(Dnode random) {
        Dnode temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void insertAtTail(int value) {
        Dnode temp = new Dnode(value);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void insertAtHead(int value) {
        Dnode temp = new Dnode(value);
        if (head == null) head = tail = temp;
        else {
            head.prev = temp;
            temp.next = head;
            head = temp;
        }
    }
}
    public class Doublyll {
    public  static void display(Dnode head){
        while(head!=null)
        {
            System.out.print(head.val+" ");
           head = head.next;
        }
        System.out.println();
    }
    public static void insertAtIdx(Dnode head,int idx,int x)
    {
        Dnode temp = head;
      for(int i=1;i<=idx-1;i++){
          temp = temp.next;
      }
      Dnode d = new Dnode(x);
      d.next = temp.next;
      d.prev = temp;
      d.next.prev = d;
      temp.next = d;
    }
    public static void deleteAtTail(Dnode head )
    {
        Dnode temp = head;
        while (temp.next.next!=null)
        {
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;
    }
    public static void deleteAtidx(Dnode head,int idx)
    {
        Dnode temp = head;
        for(int i =1;i<=idx-1;i++){
            temp = temp.next;
        }
        Dnode r = temp.next.next;
        temp.next = r;
        r.prev = temp;
    }
        public static void main(String[] args) {
            Dnode a = new Dnode(1);
            Dnode b = new Dnode(2);
            Dnode c = new Dnode(3);
            Dnode d = new Dnode(4);
            Dnode e = new Dnode(5);
            a.prev = null;
            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            d.next = e;
            e.prev = d;
            e.next = null;
           display(a);
           deleteAtidx(a,2);
           display(a);
        }
    }


