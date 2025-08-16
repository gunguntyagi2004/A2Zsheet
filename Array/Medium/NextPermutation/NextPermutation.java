public class NextPermutation {

public static void reverse(int arr[],int i,int j){
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
}




public static void nextPermutation(int [] arr){
       int pivot=-1;
       int n=arr.length;
       for (int i=n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            pivot=i;
            break;
        }
       }


       if(pivot==-1){
        reverse(arr,0,n-1);
        return;
       }

       for(int i=n-1;i>pivot;i--){
        if(arr[i]>arr[pivot]){
            int temp=arr[i];
            arr[i]=arr[pivot];
            arr[pivot]=temp;
            break;
        }
       }

       reverse(arr,pivot+1,n-1);
}


    public static void main(String[] args) {
        int arr[]={1,2,3,6,5,4};
        System.out.println("next permutation");
        nextPermutation(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
