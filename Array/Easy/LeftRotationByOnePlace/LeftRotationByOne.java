public class LeftRotationByOne {

    public static int[] rotate(int[] arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr;
    }


    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        rotate(arr);
        System.err.println("rotated array is:");
        for(int x:arr){
            System.err.print(x+" ");
        }

    }
}
