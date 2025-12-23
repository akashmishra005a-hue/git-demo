package recursion;
import java.util.*;
public class sortedAarry {
//    public static boolean findsorted(int []arr,int idx){
//        if(idx>=arr.length) return true;
//        else if(arr[idx]<arr[idx-1]) return false;
//        return findsorted(arr,idx+1);
//    }
//    public static int lastindex(int[]arr,int idx,int target){
//        if(idx<0) return 0;
//        if (arr[idx]==target) {
//            return idx;
//        }
//         return lastindex(arr,idx-1,target);
//    }
    static void  swap(int[]arr,int i,int j){
     int temp = arr[i];
     arr[i] = arr[j];
     arr[j] = temp;
    }
    public static void sortarray(int[]arr,int idx){
      if(idx ==arr.length) return;
      for(int i=idx;i==idx;i++){
          int j=i;
          while(j>0&&arr[j]<arr[j-1]){
              swap(arr,j,j-1);
              j--;
          }
      }
      sortarray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("enter the "+n+"element of array");
        int []arr = new int[n];
        for(int i =0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target element");
        int target = sc.nextInt();
//        if(findsorted(arr,1)){
//            System.out.println("sorted");
//        }
//        else{
//            System.out.println("not sorted ");
//        }

//        System.out.println(lastindex(arr,arr.length-1,target));
sortarray(arr,1);
for(int x:arr){
    System.out.print(x+" ");
}
    }
}
