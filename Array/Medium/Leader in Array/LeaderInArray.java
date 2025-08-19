import java .util.ArrayList;

public class LeaderInArray {


// public static ArrayList<Integer>leaderInArray(int arr[]){
//      ArrayList<Integer>ans=new ArrayList<>();
//       for(int i=0;i<arr.length;i++){
//         boolean leader=true;
//         for(int j=i+1;j<arr.length;j++){
//             if(arr[i]<arr[j]){
//                 leader=false;
//                 break;
//             }
//         }
//         if(leader){
//             ans.add(arr[i]);
//         }
//       }
//       return ans;
// }



public static ArrayList<Integer>leaderInArray(int arr[]){
    ArrayList<Integer>ans=new ArrayList<>();
    int n=arr.length;
    int max_element=arr[n-1];
    ans.add(max_element);
    for (int i=n-2;i>=0;i--){
        if(arr[i]>max_element){
            max_element=arr[i];
            ans.add(max_element);
        }
    }
    return ans;

}





    public static void main(String[] args) {
        int arr[]={15,18,5,3,6,2};
        System.out.println("leaders are:-"+leaderInArray(arr));
    }
}
