import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
      //Brute Force
// public static int[] twoSum(int arr[],int k){
//     int ans[]=new int[2];
//     for (int i=0;i<arr.length;i++){
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]+arr[j]==k){
//                 ans[0]=i;
//                 ans[1]=j;
//             }
//         }
//     }
//     return ans;
// }

     //Better Approach
//  public static int[] twoSum(int[]arr,int K){
//     Arrays.sort(arr);
//     int ans[]=new int[2];
//     int st=0;
//     int end=arr.length-1;
//     int sum=0;
//     while(st<end){
//         sum=arr[st]+arr[end];
//         if(sum==K){
//             ans[0]=st;
//             ans[1]=end;
//             break;

//         }
//         else if(sum>K){
//             end--;
//         }
//         else{
//             st++;
//         }
//     }
//     return ans;
//  }    


// optimized approach

public static int[] twoSum(int[]arr,int K){
     HashMap<Integer,Integer>map=new HashMap<>();
     int [] ans=new int[2];
     for (int i=0;i<arr.length;i++){
        
        int val=K-arr[i];
        if(map.containsKey(val)){
            
            ans[0]=map.get(val);
            ans[1]=i;
            break;
        }
        else{
            map.put(arr[i], i);
        }
     }
     
     return ans;
}



    public static void main(String[] args) {
        int arr[]={1,6,2,10,3};
        int target=7;
        int result[]=twoSum(arr,target);
        for(int x:result){
            System.out.print(x+" ");
        }
    
    }
}