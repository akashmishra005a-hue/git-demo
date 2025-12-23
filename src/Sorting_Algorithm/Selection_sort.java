package Sorting_Algorithm;

public  class Selection_sort {
    public static void Sort(int[]arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        int[]arr = {3,2,0,2,1,4};
        Sort(arr);
        for(int x :arr){
            System.out.print(x+" ");
        }

    }
}
