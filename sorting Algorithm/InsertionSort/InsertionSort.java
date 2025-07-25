package InsertionSort;

import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
         int[] var1 = new int[]{13, 46, 24, 52, 20, 9};
         insertion_sort(var1);
         System.out.println(Arrays.toString(var1));
    }

    public static void insertion_sort(int[]arr){
             int n=arr.length;
             for(int i=1;i<=n-1;i++){
                 int j=i;
                 while(j>0 && arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    j--;
                 }
             }

    }

    public static void swap(int[]arr,int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    }
}
