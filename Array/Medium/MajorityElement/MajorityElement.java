package MajorityElement;

public class MajorityElement {

    //Brute force

// public static int majority(int arr[]){
//      int n=arr.length;
//     for(int i=0;i<n;i++){
//         int count=0;
//         for(int j=i+1;j<n;j++){
//             if (arr[i]==arr[j]){
//                 count++;
//             }
//         }
//         if(count >=(n/2)){
//             return arr[i];
//         }
//     }
//  return -1;

// }





public static int majority(int arr[]){
    int freq=1;
    int ans=arr[0];
    int n=arr.length;
    for(int i=1;i<n;i++){
         if(arr[i]==arr[i-1]){
            freq++;
         }
         else{
            ans=arr[i];
            freq=1;
         }
         if(freq>=(n/2)){
            return ans;
         }
    }
    return -1;
}


    public static void main(String[] args) {
        int arr[]={1,2,2,2,1,1,2};
        System.out.println("mojority element is:-"+majority(arr));
    }
}
