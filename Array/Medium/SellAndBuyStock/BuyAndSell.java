package SellAndBuyStock;

public class BuyAndSell {


    public static int buyAndSell(int [] arr){
        int max_profit=0;
        int bestbuy=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>bestbuy){
                max_profit=Math.max(max_profit,arr[i]-bestbuy);
            }
            else{
                bestbuy=Math.min(bestbuy,arr[i]);
            }
        }
        return bestbuy;
    }
    public static void main(String[] args) {
        int arr[]={7,1,6,5,4,8};
        System.out.println("best buy at:-"+buyAndSell(arr));
    }
}
