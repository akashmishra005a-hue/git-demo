package Sorting_Algorithm;

public class MERGE_SORT {
    static void MergeTwosorted(int[]arr,int l,int mid,int r) {
        int firstarraysize = mid - l + 1;
        int secoandarraysize = r - mid;
        int[] left = new int[firstarraysize];
        int[] right = new int[secoandarraysize];
        int i, j, k;
        for (i = 0; i < firstarraysize; i++) left[i] = arr[l + i];
        for (j = 0; j < secoandarraysize; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = l;
        while (i < firstarraysize && j < secoandarraysize) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            }
            else arr[k++] = right[j++];
        }
        while(i<firstarraysize){
            arr[k++] = left[i++];
        }
        while(j<secoandarraysize){
            arr[k++] = right[j++];
        }
    }
    static void MergeSort(int[]arr,int l,int r){
        if(l>=r) return;
        int mid = (l+r)/2;
        MergeSort(arr,l,mid);
        MergeSort(arr,mid+1,r);
        MergeTwosorted(arr,l,mid,r);

    }
    public static void main(String[] args) {
        int[]arr = {4,5,1,3,2,7};
        int n = arr.length;
        MergeSort(arr,0,n-1);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
