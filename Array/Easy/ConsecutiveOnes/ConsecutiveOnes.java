package ConsecutiveOnes;

public class ConsecutiveOnes {

    public static int consecutiveOnes(int [] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max=Integer.max(count, max);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,0,1,1,1};
        System.out.println("No of consecutive ones are:-"+consecutiveOnes(arr));
    }
}
