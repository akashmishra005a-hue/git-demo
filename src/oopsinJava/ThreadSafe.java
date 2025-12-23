package oopsinJava;
class temp implements Runnable{
    int count;
    public synchronized void run(){
        for(int i =1;i<=1000;i++) {
          count++;
        }
    }
}
public class ThreadSafe {
    public static void main(String[] args) throws InterruptedException {
        temp t0 = new temp();
        Runnable r =  () ->{
            {
                try{
                  for(int i =1;i<=1000;i++) t0.count++;
                } catch (Exception e){};
            }
        };
        Thread t1 = new Thread(t0);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t0.count);

    }
}
