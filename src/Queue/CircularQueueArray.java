package Queue;
 class CircularQueue {
     int[] arr = new int[5];
     int n = arr.length;
     int size = 0;
     int f = -1;
     int r = -1;

     void add(int val) {
         if (size == n) {
             System.out.println("queue is full");
             return;
         }
         else if(size==0){
             r = f =0;
             arr[0] = val;
         }
          else if (r == n-1 ) {
             r = 0;
             arr[r] = val;
         }

             else  {
                 arr[++r] = val;
             }
         size++;
     }

     int remove() throws Exception {
         int x = 0;
         if (size == 0) {
             System.out.print("queue is empty");
             throw new Exception();
         } else if (f == n - 1) {
             x = arr[f];
             f = 0;
         } else {
             x = arr[f];
             f++;
         }
         size--;
         return x;
     }

     int peek() {
         return arr[f];
     }
     void display(){
         if(f<=r){
             for(int i = f;i<=r;i++) System.out.print(arr[i]+" ");
         }
         else {
             for(int i = f;i<=n-1;i++) System.out.print(arr[i]+" ");
             for(int i =0;i<=r;i++) System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
 }
public class CircularQueueArray {
    public static void main(String[] args) throws Exception {
        CircularQueue ce = new CircularQueue();
        ce.add(1);
        ce.add(2);
        ce.add(3);
        ce.add(4);
        ce.add(5);
        ce.display();
        System.out.println("delte the value "+ ce.remove());
        System.out.println("add the value ");
        ce.add(6);
        ce.display();
        System.out.println("delete the value "+ ce.remove());
        System.out.println("delete the value "+ ce.remove());
        System.out.println("delete the value "+ ce.remove());
        System.out.println("delete the value "+ ce.remove());
        ce.display();
        ce.add(7);
        ce.add(8);
        ce.add(9);
        ce.add(10);
        ce.display();
    }
}
