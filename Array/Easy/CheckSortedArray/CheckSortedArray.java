public class CheckSortedArray {
    
    public static boolean check(int []arr){
       boolean result= true;
       for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            result=false;
            break;
        }

       }
       return result;

    }
    public static void main(String[] args) {
        int arr[]={8,9,10,13,14};
        System.err.println("array is sorted?:"+check(arr));
    }
}
