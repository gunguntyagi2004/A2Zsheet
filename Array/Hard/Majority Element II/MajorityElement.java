import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
public class MajorityElement {

    //Brute force 

//    public static List<Integer> MajorityElement(int arr[],int n){
//        List<Integer>ans=new ArrayList<>();
//     for(int i=0;i<n;i++){
//         int count=1;
//          for(int j=i+1;j<n;j++){
//             if(arr[i]==arr[j]){
//                 count++;
//             } 
//          }
//          if(count>(n/3)&& !ans.contains(arr[i])){
//             ans.add(arr[i]);
//          }
//        }
//        return ans;
//    }

     // Better approach 


// public static List<Integer>MajorityElement(int arr[],int n){
//     List<Integer>ans=new ArrayList<>();
//     HashMap<Integer,Integer>map=new HashMap<>();
//     for(int i=0;i<n;i++){
//         if(map.containsKey(arr[i])){
//               map.put(arr[i],map.get(arr[i])+1);
//         }
//         else{
//             map.put(arr[i],1);
//         }
//         if(map.get(arr[i])>(n/3) && !ans.contains(arr[i])){
//             ans.add(arr[i]);
//         }
//     }
//     return ans;

// }


//optimized Approach

public static List<Integer> MajorityElement(int arr[],int n){
   int count1=0;
   int count2=0;
   int maj1=0;
   int maj2=0;
   
   for(int i=0;i<n;i++){
      if(arr[i]==maj1){
        count1++;
      }
      else if(arr[i]==maj2){
        count2++;
      }
      else if(count1==0){
        maj1=arr[i];
        count1=1;
      }
      else if(count2 ==0){
        maj2=arr[i];
        count2=1;
      }
      else{
        count1--;
        count2--;
      }
   }

count1=0;
count2=0;
for(int i=0;i<n;i++){
    if(arr[i]==maj1){
        count1++;
    }
    else if(arr[i]==maj2){
        count2++;
    }
   
     
}

List<Integer> ans = new ArrayList<>();
       
        if (count1 > n / 3) ans.add(maj1);
        if (count2 > n / 3) ans.add(maj2);

        return ans;


}




    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,3,2,2};
        int n=arr.length;
         List<Integer>res=MajorityElement(arr,n);
         for(int x:res){
            System.out.println(x+" ");
         }


    }
}
