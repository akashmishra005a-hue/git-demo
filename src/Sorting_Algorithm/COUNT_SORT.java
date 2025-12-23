package Sorting_Algorithm;
public class COUNT_SORT {
    static void countSort(int[]arr){
        int count_1 = 0;
        int count_2 = 0;
        int count_3 = 0;
        for(int i =0;i<arr.length;i++) {
            if (arr[i] == 0) count_1++;
            else if (arr[i] == 1) count_2++;
            else count_3++;
        }
            int k = 0;
            while(count_1>0){
                arr[k++] = 0;
                count_1--;
            }
            while(count_2>0){
                arr[k++] = 1;
                count_2--;
            }
            while(count_3>0){
                arr[k++] = 2;
                count_3--;
            }
    }
    public static void main(String[] args) {
        int[]nums = {0,1,0,2,1,0};
        countSort(nums);
        for(int x : nums){
            System.out.print(x+" ");
        }

    }
}
