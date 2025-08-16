

// import java.util.ArrayList;



public class RearrangeArray {

    // public static void rearrangeArray(int [] arr){
    //     ArrayList<Integer>pos=new ArrayList<>();
    //     ArrayList<Integer>neg=new ArrayList<>();
    //     int n=arr.length;
    //     for(int i=0;i<arr.length;i++){
    //            if(arr[i]>=0){
    //             pos.add(arr[i]);
    //            }
    //            else{
    //             neg.add(arr[i]);
    //            }
    //     }
    //     for(int i=0;i<n/2;i++){
    //        arr[2*i]=pos.get(i);
    //        arr[2*i+1]=neg.get(i);
    //     }
    
    // }

    public static int[] rearrangeArray(int [] arr){
        int n=arr.length;
        int pos=0;
        int neg=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                ans[pos]=arr[i];
                pos+=2;
            }
            else{
                ans[neg]=arr[i];
                neg+=2;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int arr[]={1,2,-4,-5};
       int res[]= rearrangeArray(arr);
        System.out.println("after rearrange");
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
