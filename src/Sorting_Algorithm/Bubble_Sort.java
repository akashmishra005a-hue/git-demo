package Sorting_Algorithm;

public class Bubble_Sort {
    public static void bubblesort(int []arr){
        boolean check = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    check = true;
                }
            }
            if(!check) return;
        }
    }

    public static void main(String[] args) {
//        int[]arr = {6,35,1,6,5};
//        bubblesort(arr);
//        for(int x:arr){
//            System.out.print(x+" ");
//        }


    }

    }



