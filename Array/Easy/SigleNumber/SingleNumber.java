package SigleNumber;

public class SingleNumber {



    // public static int singleNumber(int [] arr){
         
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[j]!=arr[i]){
    //                 return arr[i];
    //             }
    //         }
    //     }
    //     return -1;
    // }

public static int singleNumber(int[] arr){
         int ans=0;
       for(int i=0;i<arr.length;i++){
         ans=ans^arr[i];
   }
   return ans;
}


    public static void main(String[] args) {
        int arr[]={4,1,2,2,1};
        System.out.println("single number is:-"+singleNumber(arr));

    }
}
