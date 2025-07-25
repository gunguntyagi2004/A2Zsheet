package BubbleSort;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
         int arr[] = {13, 46, 24, 52, 20, 9};
        Bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
public static void Bubble_sort(int []arr){
    int n=arr.length;
       for(int i=0;i<n-1;i++){
            for(int j=0;j<=n-2;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
       }
    }
       public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

       }
}
   

