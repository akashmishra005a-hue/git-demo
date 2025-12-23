package recursion;
import java.util.Scanner;
public class ArrayRecursion {
//    public static void print(int[]arr,int idx){
////        if(idx==arr.length){
////            return;
////        }
////        System.out.print(arr[idx]+" ");
////        print(arr,idx+1);
//
//    }
//public static int printmax(int []arr,int idx){
//    if(idx ==arr.length-1
//    ) return arr[idx];
//int small_ans = printmax(arr,idx+1);
//return Math.max(small_ans,arr[idx]);
//}

public static int sumArray(int []arr,int idx){
    if(idx ==arr.length-1) return arr[idx];
    return sumArray(arr,idx+1)+arr[idx];
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int []arr  = new int [n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
        System.out.println("sum is "+sumArray(arr,0));
    }
}
