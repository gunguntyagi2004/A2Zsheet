package RotateMatrixBy90Degree;

import java.util.Arrays;

public class RotateMatrix {

// public static int[][] rotateMatrix(int [][]arr){
//     int m = arr.length;
//     int n = arr[0].length;
//     int [][]ans=new int[n][m];
//     for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             ans[j][m-1-i]=arr[i][j];
//         }
//     }
//     return ans;
// }    





public static void  rotateMatrix(int [][]arr){
    int m=arr.length;
    int n=arr[0].length;

  for (int i = 0; i < m; i++) {
    for (int j = i + 1; j < n; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
}

// Reverse each row
for (int i = 0; i < m; i++) {
    for (int j = 0; j < n / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][n - 1 - j];
        arr[i][n - 1 - j] = temp;
    }
    }
    
}





    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("before");
        for (int[] row :arr){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("after:-");
    // //    int res[][]= rotateMatrix(arr);
    //    for (int[] row :res){
    //         System.out.println(Arrays.toString(row));
    //     }
    // }
rotateMatrix(arr);
     for (int[] row :arr){
            System.out.println(Arrays.toString(row));
    
}
}
}