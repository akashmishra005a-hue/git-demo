package Sorting_Algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class Problems {
    static void swap(int[]arr,int x,int y){
        int temp = arr[x];
       arr[x] = arr[y];
        arr[y]= temp;
    }
//    static void sort(int []arr){
//        if(arr.length<=1) return; corner case
//        int x = 0;
//        int y = 0;
//        for(int i=1;i<arr.length;i++) {
//            if (arr[i] < arr[i - 1]) {
//                if (x == 0) {
//                    x = i - 1;
//                    y = i;
//                } else y = i;
//            }
//        }
//     swap(arr,x,y);
//    }
//    static int[] postiveNegative(int[]arr){
////        int[]ans = new int[arr.length];
////        int n = ans.length-1;
////        int j = 0;
////        for(int i =0;i<arr.length;i++){
////            if(arr[i]<=0){
////                ans[j++] = arr[i];
////            }
////            else ans[n--] = arr[i];
////        }
////        return ans;
//    }
//public static void ArrangePstvNtv(int []arr){
//    int i,j;
//    i =0;
//    j = arr.length-1;
//    while(i<=j){
//        while(arr[i]<0) i++;
//        while(arr[j]>0) j--;
//        if(i<j){
//            swap(arr,i,j);
//            i++;
//            j--;
//        }
//    }
//
//
//}
static void DutchProblem(int[]a,int low,int mid,int high){
    while(mid<=high){
        if(a[mid]==0){
            swap(a,mid,low);
            mid++;
            low++;
        }
   else if(a[mid]==1){
      mid++;
        }
  else{
      swap(a,mid,high);
      high--;
        }
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]a = {2,1,0,1,2,1,1,0,0,2};
        DutchProblem(a,0,0,a.length-1);
        for(int x:a) System.out.print(x+" ");

    }
}
