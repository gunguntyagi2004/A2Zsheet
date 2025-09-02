import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
public class FourSum{




// public static List<List<Integer>> fourSum(int[]arr,int K) {
//     HashSet<List<Integer>>set=new HashSet<>();
//     int n=arr.length;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             for(int k=j+1;k<n;k++){
//                 for(int l=k+1;l<n;l++){
//                     if(arr[i]+arr[j]+arr[k]+arr[l]==K){
//                         List<Integer>triplet=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
//                         triplet.sort(null);
//                          set.add(triplet);

//                     }
//                 }
//             }
//         }
//     }

// List<List<Integer>>ans=new ArrayList<>(set);
// return  ans;
// }


// public static List<List<Integer>>fourSum(int arr[],int K){
//     int n=arr.length;
//     HashSet<List<Integer>>set=new HashSet<>();
//      for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             HashSet<Integer> hashset=new HashSet<>();
//             for(int k=j+1;k<n;k++){
//                 int fourth=K-(arr[i]+arr[j]+arr[k]);
//                 if(hashset.contains(fourth)){
//                     List<Integer>triplet=Arrays.asList(arr[i],arr[j],arr[k],fourth);
//                     triplet.sort(null);
//                     set.add(triplet);

//                 }
//                 else{
//                     hashset.add(arr[k]);

//                 }
//             }
//         }
//      }
// List<List<Integer>>ans=new ArrayList<>(set);
// return ans;

// }

public static List<List<Integer>> fourSum(int arr[],int K){
          Arrays.sort(arr);
          List<List<Integer>> ans = new ArrayList<>();
         int n=arr.length;
         for(int i=0;i<n;i++){
            if (i!=0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
               if (j>i+1 && arr[j]==arr[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l){
                    long sum=(long)(arr[i]+arr[j]+arr[k]+arr[l]);
                    if(sum<K){
                        k++;
                    }
                    else if(sum>K){
                          l--;
                    }
                    else{
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                    
                     k++;
                     l--;
                     while(k<l && arr[k]==arr[k-1]) k++;
                     while(k<l && arr[l]==arr[l-1]) l--;
                    }
                }





            }
         }

        
           return ans;
}















    public static void main(String[] args) {
        int arr[]={4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target=9;
        List<List<Integer>>res=fourSum(arr,target);
        System.out.println("all quadriplet are");
        System.out.println(res);

    }
}