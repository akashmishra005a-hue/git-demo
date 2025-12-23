package oopsinJava;
import java.util.Scanner;
class Worker{
    double payrate;
    int noofworkers;
   public  void setData(double payrate,int noofworkers){
       this. payrate = payrate;
       this.noofworkers = noofworkers;
    }
    public double calculateSalary(double payrate,int noofworkers,int hours){
       if(hours<40) return payrate*noofworkers;
       return 2*payrate*noofworkers;
    }
}
public class WorkerClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker w = new Worker();
        System.out.println("enter the ratee for workers ");
        double payrate = sc.nextDouble();
        System.out.println("enter the no of workers ");
        int noofworkers = sc.nextInt();
        System.out.println("enter the totoal hours ");
        int hours = sc.nextInt();
        w.setData(payrate,noofworkers);
        System.out.println("toatal salry is of worker is"+ w.calculateSalary(payrate,noofworkers,hours));
    }


}
