package UnionArray;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {


    public static ArrayList<Integer> union(int [] arr1,int[] arr2,int n,int m){
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
         for(int x:arr1){
            set.add(x);
         }
         for(int x:arr2){
            set.add(x);
         }

         for(int x:set){
            ans.add(x);
         }
         return ans;
    }
    public static void main(String[] args) {
         int n=5;
    int m=5;
    int arr1[]={1,2,3,4,5};
    int arr2[]={2,2,3,4,5};

    System.err.println("after union"+union(arr1,arr2,n,m));

    }
   
}
