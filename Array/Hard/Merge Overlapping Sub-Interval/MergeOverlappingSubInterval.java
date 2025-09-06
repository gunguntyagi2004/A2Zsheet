import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MergeOverlappingSubInterval {

    // public static List<List<Integer>> intervals(int [][] arr) {
    //     int n = arr.length;
    //     if (n == 0) return new ArrayList<>();

     
    //     Arrays.sort(arr, (a, b) -> a[0] - b[0]);

    //     List<List<Integer>> ans = new ArrayList<>();
       
    //     for (int i = 0; i < n; i++) { 
    //         int start = arr[i][0];
    //         int end = arr[i][1];

          
    //         if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
    //             continue;
    //         }

    //         for (int j = i + 1; j < n; j++) {
    //             if (arr[j][0] <= end) {
    //                 end = Math.max(end, arr[j][1]);
    //             } else {
    //                 break;
    //             }
    //         }
    //         ans.add(Arrays.asList(start, end));
    //     }
    //     return ans;
    // }


public static List<List<Integer>> intervals(int[][]arr){

    int n=arr.length;
    if(n==0) return new ArrayList<>();
    Arrays.sort(arr,(a,b)->a[0]-b[0]);
    List<List<Integer>>ans=new ArrayList<>();
    for(int i=0;i<n;i++){
        if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1).get(1) ){
                     ans.add(Arrays.asList(arr[i][0],arr[i][1]));
        }
        else{
             ans.get(ans.size() - 1).set(1,Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
        }
    }
    return ans;

}








    public static void main(String[] args) {
        int arr[][] = {{4,7},{1,4}};
        List<List<Integer>> res = intervals(arr);
        System.out.println("All merged intervals are:");
        for (List<Integer> it : res) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
    }
}
