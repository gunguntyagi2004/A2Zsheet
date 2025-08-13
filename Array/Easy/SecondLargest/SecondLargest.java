public class SecondLargest{


public static int find_secondLargest(int[] arr){
       int largest=Integer.MIN_VALUE;
       int secondlargest=-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>largest ){
        largest=arr[i];
      }
      else if(arr[i]<largest && arr[i]> secondlargest){
        secondlargest=arr[i];
      }
    }
    return secondlargest;
}


    public static void main(String[] args) {
    int arr[]={8,8,7,6,5};
    System.err.println("second largest is:"+find_secondLargest(arr));
}
}
