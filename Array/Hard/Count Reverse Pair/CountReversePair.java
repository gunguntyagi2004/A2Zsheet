import java.util.ArrayList;
public class CountReversePair {





    

// public static int pairs(int arr[],int n){
//     int count=0;
//     for (int i=0;i<n;i++){
       
//         for(int j=i+1;j<n;j++){
//            if(arr[i]>2*arr[j]){
//             count++;
//            }
//         }
//     }
//     return count;
// }







 private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;   
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }


        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

       
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

       
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2 * arr[right]){ 
            right++;
            
        }
    }
        cnt += (right - (mid + 1));
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += countPairs(arr, low, mid, high); //Modification
        merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }

    public static int pairs(int[] skill, int n) {
        return mergeSort(skill, 0, n - 1);
    }




    public static void main(String[] args) {
        int arr[]={4, 1, 2, 3, 1};
        int N=5;
        int cnt=pairs(arr,N);
        System.out.println("count of all pairs "+cnt);

    }
}
