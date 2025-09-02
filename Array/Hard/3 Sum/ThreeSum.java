
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ThreeSum{





// public static List<List<Integer>> threeSum(int arr[]){
//    HashSet<List<Integer>>set=new HashSet<>();
//     int n=arr.length;
//     for(int i=0;i<n;i++){
//         for(int j=i+1;j<n;j++){
//             for(int k=j+1;k<n;k++){
//                 if(arr[i]+arr[j]+arr[k]==0){
//                      List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                       
//                         Collections.sort(triplet);
                        
//                         set.add(triplet);
                    
//                 }
//             }
//         }
//     }
//     List<List<Integer>> ans = new ArrayList<>(set);
        // return ans;
// }





// public static List<List<Integer>> threeSum(int arr[]){
//        Set<List<Integer>> st = new HashSet<>();
//         int n=arr.length;
//         for (int i = 0; i < n; i++) {
//             Set<Integer> hashset = new HashSet<>();
//             for (int j = i + 1; j < n; j++) {
                
//                 int third = -(arr[i] + arr[j]);

                
//                 if (hashset.contains(third)) {
//                     List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
//                     temp.sort(null);
//                     st.add(temp);
//                 }
//                 hashset.add(arr[j]);
//             }
//         }

       
//         List<List<Integer>> ans = new ArrayList<>(st);
//         return ans;


// }



public static  List<List<Integer>>threeSum(int arr[]){
        Arrays.sort(arr);
       List<List<Integer>>ans=new ArrayList<>();
       int n=arr.length;
       for(int i=0;i<n;i++){
        if (i != 0 && arr[i] == arr[i - 1]) continue;
        int j=i+1;
        int k=n-1;
        while(j<k){
            int sum=arr[i]+arr[j]+arr[k];
            if(sum<0){
                j++;
            }
            else if(sum>0){
                k--;
            }
            else{
                List<Integer> triplet=Arrays.asList(arr[i],arr[j],arr[k]);
                ans.add(triplet);
                j++;
                k--;
                 while(j<k && arr[j]==arr[j-1]) j++;
                 while(j<k && arr[k]==arr[k+1])k--;
            }
        }
       }
       return ans;
}






    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>>res=threeSum(arr);
        System.out.println(res);

    }
}