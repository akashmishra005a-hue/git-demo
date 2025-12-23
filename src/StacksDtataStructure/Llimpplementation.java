package StacksDtataStructure;
class Node {
    int val;
    Node next;
    static Node head = null;
    Node(int val) {
        this.val = val;
    }
}
    class Stackl {
            int size = 0;
        void push(int x) {
            Node temp = new Node(x);
           temp.next = Node.head;
           Node .head = temp;
           size++;
        }

        int peek() {
            return Node.head.val;
        }
        void printReverse(Node h)
        {
            if(h==null)
            {
                System.out.println();
                return;
            }
            printReverse(h.next);
            System.out.print(h.val+" ");
        }
        void display()
        {
           printReverse(Node.head);
            System.out.println();
        }
        int pop()
        {
            if(Node.head==null){
                System.out.println("stack is empty ");
                return -1;
            }
            int top = Node.head.val;
            Node.head = Node.head.next;
            size--;
            return top;
        }
        int getSize(){
            return size;
        }
        boolean isEmpty()
        {
            if(Node.head==null) return true;
            else
                return false;
        }
    }

public class Llimpplementation {
    public static void main(String[] args) {
        Stackl lt = new Stackl();
        lt.push(1);
        lt.push(2);
        lt.push(3);
        lt.push(4);
        lt.display();
        System.out.println(lt.peek());
        lt.push(5);
        lt.display();
        System.out.println(lt.getSize());
        lt.pop();
        lt.display();
        System.out.println(lt.getSize());
        System.out.println(lt.isEmpty());
    }
}
