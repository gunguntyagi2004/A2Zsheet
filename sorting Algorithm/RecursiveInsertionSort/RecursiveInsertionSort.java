package RecursiveInsertionSort;
import java.util.Arrays;
public class RecursiveInsertionSort {
      public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n=arr.length;
        recursive_insertion_sort(arr,n);
        System.out.println(Arrays.toString(arr));
      }

      public static void recursive_insertion_sort(int [] arr,int n) {
        if(n<=1)
        return;
         recursive_insertion_sort(arr, n-1);
         int j=n-1;
         while(j>0 && arr[j] <arr[j-1]){
            swap(arr,j,j-1);
            j--;
         }
        
      }

       public static void swap(int[]arr,int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
    }

}


