import java.util.HashMap;

public class LongestSubarray {



// public static int longestSubarray(int [] arr){
//     int maxlen=0;
//     int n=arr.length;
//     for(int st=0;st<n;st++){
//         int sum=0;
//         for(int end=st;end<n;end++){
           
//             sum=sum+arr[end];
//             if (sum==0){
//                int len=(end-st)+1;
//                maxlen=Math.max(maxlen,len);
//             }
//         }
//         }
    
//     return maxlen;
// }



public static int longestSubarray(int arr[]){
    int n=arr.length;
    int maxlen=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    int i=-1;
    int sum=0;
    map.put(sum,i);
    while(i<n-1){
        i++;
        sum+=arr[i];
        if(map.containsKey(sum)){
            int len=i-map.get(sum);
            maxlen=Math.max(maxlen,len);
        }
        else{
            map.put(sum,i);
        }

    }
   return maxlen;

}



v




    public static void main(String[] args) {
        int arr[]={6, -2, 2, -8, 1, 7, 4, -10};
        System.out.println("longest subarray len is"+longestSubarray(arr));
    }
}
