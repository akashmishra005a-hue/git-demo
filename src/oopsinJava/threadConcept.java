package oopsinJava;
//class Ta extends Thread
//{
//    public void run()
//    {
//        for(int i =0;i<=10;i++)
//        {
//            System.out.println("heyyy");
//            try{
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//
//            }
//        }
//    }
//}
class U extends Thread{
    public void run() {
        for (int i = 0; i <=10; i++) {
            System.out.println("hello");
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}
public class threadConcept {
    public static void main(String[] args) {
      Runnable obj1 = ()->{
              for(int i=1;i<=10;i++){
                  try{
                      System.out.println("heyy");
                      Thread.sleep(10);
                  } catch (Exception e){
                      System.out.println("something went wrong ");
                  }

              }
      };
        U obj2= new U();

        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
        t1.start();
        obj2.start();

    }
}
