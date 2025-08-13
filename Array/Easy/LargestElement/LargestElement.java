public class LargestElement{

public static int findLargest(int[] arr) {
        int largest = Integer.MIN_VALUE; 
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[]args){

 int[] arr = {10, 45, 2, 99, 67};
        System.out.println("Largest element: " + findLargest(arr));
        

    
}




    }
