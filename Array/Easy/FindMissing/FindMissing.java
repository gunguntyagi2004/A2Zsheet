package FindMissing;

public class FindMissing {

    // public static int find(int[] arr,int N){
           
    //          for(int i=1;i<N;i++){
    //            int flag=0;
    //          for(int j=0;j<arr.length;j++){
    //             if(arr[j]==i){
    //                 flag=1;
    //                 break;
               
    //             }
             
    //          }
    //           if(flag==0){
    //             return i;
    //          }

    //        }
    //        return -1;
    // }
    public static int find(int[] arr,int N){
        int sum1=(N*(N+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        return sum1-sum2;
    }



    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int N=5;
        System.out.println("missing at:-"+find(arr,N));
    }
}
