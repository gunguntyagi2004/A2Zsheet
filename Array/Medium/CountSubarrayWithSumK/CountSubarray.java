import java.util.HashMap;

public class CountSubarray{
    // public static int countSubarray(int []arr,int K){
    //     int count=0;
    //     for (int i=0;i<arr.length;i++){
    //         int sum=0;
    //         for(int j=i;j<arr.length;j++){
    //            sum+=arr[j];
    //               if(sum==K){
    //                 count++;
    //               }
    //         }
            
    //     }
    //     return count;
    // }



    public static int countSubarray(int arr[],int K){
        int count =0;
        int n=arr.length;
        int prefixsum[]=new int[n];
        prefixsum[0]=arr[0];

        for (int i=1;i<n;i++){
          prefixsum[i]=arr[i]+prefixsum[i-1];

        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<n;i++){
            if(prefixsum[i]==K){
                count++;
            }
           int val=prefixsum[i] - K;
           if(map.containsKey(val)){
                  count+=map.get(val);
           }
           else{
           map.put(prefixsum[i],  1);
           }
        }
        return count;

    }
    public static void main(String[]args){
        int arr[]={3, 4, 7, 2, -3, 1, 4, 2};
        int k=7;
        System.out.println("count is:-"+countSubarray(arr,k));
    }
}