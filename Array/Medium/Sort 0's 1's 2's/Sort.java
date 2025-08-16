// import java.util.Arrays;

public class Sort {




      //Brute Force

    // public static void sort(int [] arr){
    //     Arrays.sort(arr);
    // }






    // Better Approach

    // public static void sort(int [] arr){
    //     int count0=0;
    //     int count1=0;
    //     int count2=0;
    //     for(int i=0;i<arr.length;i++){
    //         if (arr[i]==0){
    //             count0++;
    //         }
    //         else if(arr[i]==1){
    //             count1++;
    //         }
    //         else{
    //             count2++;
    //         }

    //     }
    //     int i=0;
    //     for(int j=0;j<count0;j++){
    //           arr[i]=0;
    //           i++;
    //     }
    //     for(int j=0;j<count1;j++){
    //           arr[i]=1;
    //           i++;
    //     }
    //     for(int j=0;j<count2;j++){
    //           arr[i]=2;
    //           i++;
    //     }

    // }


    // optimized approach

    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void sort(int [] arr){
        int mid=0;
        int low=0;
        int high=arr.length-1;
        while(mid<=high){
             if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
             }
             else if(arr[mid]==1){
                mid++;
             }
             else{
                swap(arr,mid,high);
                high--;
             }
        }
    }


    public static void main(String[] args) {
        int arr []={1,0,2,1,0};
        sort(arr);
        System.out.println("after sort");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
