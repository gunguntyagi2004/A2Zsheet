package QuickSort;


import java.util.Arrays;



public class QuickSort {
    public static void main(String[] args) {
         int arr[] = {13, 46, 24, 52, 20, 9};
         int n=arr.length;
        Quick_sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

 public static int partition(int [] arr,int low,int high){
         int pivot=arr[high];
         int i=low-1;
         for(int j=low;j<high;j++){
                if(arr[j]<pivot){
                    i++;
                    swap(arr,i,j);
                }
         }
         i++;
         int temp=arr[i];
         arr[i]=pivot;
         arr[high]=temp;
         return i;
 }

public static void swap(int[]arr,int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    }




    public static void Quick_sort(int [] arr,int low ,int high){
             if(low < high){
                int pivotidx=partition(arr,low,high);
                Quick_sort(arr,low,pivotidx-1);
                Quick_sort(arr,pivotidx+1,high);
             }
    }



}
