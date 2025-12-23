package Sorting_Algorithm;

public class QUICK_SORT {
    static void print(int[]a){
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
        System.out.println();
    }
    static void swap(int[]arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;

    }
    static int partionPivot(int[]arr,int start,int last ){
        int pivot = arr[start];
        int count = 0;
        for(int i = start+1;i<=last;i++) {
            if(arr[i]<=pivot) count++;
        }
        int pvtidx = count+start;
        swap(arr,start,pvtidx);
        int i,j;
        i = start;
        j = last;
        while(i<pvtidx&&j>pvtidx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<=pvtidx && j>pvtidx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pvtidx;
    }
    static void quickSort(int[]arr,int start,int last){
        if(start>=last) return;
        int pvtindex = partionPivot(arr,start,last);
        quickSort(arr,start,pvtindex-1);
        quickSort(arr,pvtindex+1,last);
    }
    public static void main(String[] args) {
        int[]arr = {5,6,8,4,2,1,7,9};
        System.out.println("array before sorting ");
        print(arr);
        quickSort(arr,0,arr.length-1);
       System.out.println("array after sorting");
        print(arr);
    }
}
