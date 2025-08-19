import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {



      //Brute froce

// public static boolean linearSearch(int []arr,int K){
//       for (int i=0;i<arr.length;i++){
//         if(arr[i]==K)
//         return true;
//       }
//       return false;
// }




// public static int longestSeq(int arr[]){
//     int longest=1;
//     for (int i=0;i<arr.length;i++){
//         int x=arr[i];
//         int cnt=1;
//         while(linearSearch(arr,x+1)){
//             cnt++;
//             x++;
//         }
//         longest=Math.max(longest,cnt);
//     }
//     return longest;
// }

  // Better approach

//   public static  int longestSeq(int arr[]){
//        int n=arr.length;
//        if(n==0){
//         return 0;
//        }
//        Arrays.sort(arr);
//        int prev=arr[0];
//        int max_len=1;
//        int len=1;
//        for(int i=0;i<arr.length;i++){
//          if(arr[i]==prev){
//             continue;
//          }
//          else if(arr[i]==prev+1){
//             len++;
//             prev=arr[i];
//          }
//          else{
//             prev=arr[i];
//             len=1;
//          }
//          max_len=Math.max(max_len,len);
//        }


//        return max_len;

//   }



public static int longestSeq(int []arr){
    HashSet<Integer>s=new HashSet<>();
    int n=arr.length;
    if(n==0){
        return 0;
    }

     for(int i=0;i<arr.length;i++){
        s.add(arr[i]);
     }
     int max_len=1;
     for(int x:s){
        int prev=x-1;
        if(!s.contains(prev)){
            int len=1;
            int next=x+1;
            while(s.contains(next)){
                len++;
                next++;
            }
            max_len=Math.max(max_len,len);
        }
     }
     return max_len;

}












    public static void main(String[] args) {
        int arr[]={2,0,11,7,6,9,8,8};
        System.out.println("length is:-"+longestSeq(arr));
    }
}
