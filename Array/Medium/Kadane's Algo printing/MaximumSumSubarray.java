

public class MaximumSumSubarray {

    //brute force

// public static int maximumSubarraySum(int [] arr){
  
//     int ms=0;
//     int st=0;
//     int end=0;
//     for(int i=0;i<arr.length;i++){
//         int cs=0;
//         for(int j=i;j<arr.length;j++){
//             cs+=arr[j];
//             if(cs>ms){
//                 ms=cs;
//                 st=i;
//                 end=j;
//             }

//         }
    

//     } 
//     for(int i=st;i<end+1;i++){   
//        System.out.print(arr[i]+" ");
//     }
//      return ms;



// }





public static int maximumSubarraySum(int [] arr){
     int ms= Integer.MIN_VALUE;
    int cs=0;
    int st=0;
    int ansst=0;
    int ansend=0;
    for(int i=0;i<arr.length;i++){
        cs+=arr[i];
        if(cs>ms){
            ms=cs;
            ansst=st;
            ansend=i;
        }
        if (cs<0){
            cs=0;
            st=i+1;
        }
        }
    for(int i=ansst;i<ansend+1;i++){
        System.out.print(arr[i]+" ");
    }    
        return ms;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println("maximum subaarray sum is"+maximumSubarraySum(arr));
    }
}
