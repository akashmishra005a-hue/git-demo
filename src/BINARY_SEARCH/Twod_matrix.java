package BINARY_SEARCH;
import java.util.Scanner;
public class Twod_matrix {
    static void print(int[][]a){
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean search(int[][]arr,int target){
        int start,end;
        start = 0;
        int n = arr.length;
        int m = arr[0].length;
        end = n*m-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid/m][mid%m]==target) return true;
            else if(target<arr[mid/m][mid%m]){
                end= mid-1;
            }
            else start = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row ");
        int n = sc.nextInt();
        System.out.println("enter the number of column ");
        int m = sc.nextInt();
        int[][]a = new int[n][m];
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                a[i][j] = sc.nextInt();
            }
        }
        print(a);
        System.out.println("enter target value");
        int target = sc.nextInt();
        System.out.println(search(a,target));
    }
}
