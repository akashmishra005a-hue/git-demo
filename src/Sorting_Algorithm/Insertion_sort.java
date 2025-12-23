package Sorting_Algorithm;

public class Insertion_sort {
    public static void InsertionSort(int []arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j =i;
     while(j>0 && arr[j]<arr[j-1]){
         int temp = arr[j];
         arr[j] = arr[j-1];
         arr[j-1] = temp;
         j--;
     }

        }
    }
    public static void main(String[] args) {
        int []arr = {13,21,4,7,5,3,78};
        InsertionSort(arr);
        for(int p : arr){
            System.out.print(p+" ");
        }
    }
}
