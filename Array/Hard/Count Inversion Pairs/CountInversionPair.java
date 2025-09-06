import java.util.ArrayList;

public class CountInversionPair {


    // public static int inversionPairs(int arr[]){
    //     int count=0;
    //     int n=arr.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]>arr[j]){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }







public static int merge(int arr[],int st,int mid,int end){
    ArrayList<Integer> ans=new ArrayList<>();
       int left=st;
       int right=mid+1;
       int count=0;
       while(left<=mid && right <=end){
          if(arr[left]<=arr[right]){
            ans.add(arr[left]);
            left++;
          }
          else{
            ans.add(arr[right]);
            count+=(mid-left+1);
            right++;
          }
       }

       while(left<=mid){
           ans.add(arr[left]);
           left++;
       }

       while(right<=end){
             ans.add(arr[right]);
             right++;
       }


        for (int i = st; i <= end; i++) {
            arr[i] = ans.get(i - st);
        }
        return count; 
    
}




public static int mergeSort(int arr[],int st,int end){
    int n=arr.length;
    int count=0;
    if(st>=end) return count;
    int mid=(st+end)/2;
    count+=mergeSort(arr,st,mid);
    count+=mergeSort(arr,mid+1,end);
    count+=merge(arr,st,mid,end);
    return count;

}



public static int inversionPairs(int arr[]){
    int n=arr.length;
         return mergeSort(arr,0,n-1);
}


    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println("total pairs are"+inversionPairs(arr));
    }
}
