package MaximumSubarraySum;

public class MaximumSubarraySum {

// public static int maximumSubarraySum(int [] arr){
//     int ms=0;
//     for(int i=0;i<arr.length;i++){
//         int cs=0;
//         for(int j=i;j<arr.length;j++){
//             cs+=arr[j];
//             ms=Math.max(ms,cs);

//         }
       
//     }
//      return ms;
// }

public static int maximumSubarraySum(int [] arr){
    int ms= Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<arr.length;i++){
        cs+=arr[i];
        ms=Math.max(ms,cs);
        if (cs<0){
            cs=0;
        }
        }
        return ms;
    }
    










    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
;
        System.out.println("maximum sum is:-"+maximumSubarraySum(arr));

           }
}
