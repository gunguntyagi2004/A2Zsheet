package SetMatrixZero;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {

//Brute Force


// public static void setmatrix(int[][]matrix){
//         int m=matrix.length;
//         int n=matrix[0].length;

//         int [][]temp=new int [m][n];
//         for (int i = 0; i < m ; i++) {
//            temp[i] = matrix[i].clone();  
// }

        

//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                    if(matrix[i][j]==0){
                       
//                     for(int c=0;c<n;c++){
//                         temp[i][c]=0;
//                     }
//                     for(int r=0;r<m;r++){
//                         temp[r][j]=0;
//                     }

//                    }
//             }
//         }
//          for (int i = 0; i < m ; i++) {
//          matrix[i]=  temp[i] .clone();  
// }
// }

    
// Better Approach

// public static void setmatrix(int [][]matrix){
//     int m=matrix.length;
//     int n=matrix[0].length;
//      boolean[] row=new boolean[m];
//      boolean[] col=new boolean[n];
    
//      for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(matrix[i][j]==0){
//                row[i]=true;
//                col[j]=true;
//             }
           
//         }
//      }

//      for(int i=0;i<m;i++){
//         for(int j=0;j<n;j++){
//             if(row[i]||col[j]){
//                 matrix[i][j]=0;
//             }
//         }
//      }
// }












public static void setmatrix(int [][]matrix){

 int m = matrix.length;
        int n = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Step 1: check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 2: check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Step 3: use first row and col as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 4: update cells based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: update first row if needed
        if (firstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 6: update first column if needed
        if (firstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }










    public static void main(String[] args) {

       int[][]matrix={{1,1,1},{1,0,1},{1,1,1}};
       setmatrix(matrix);
       System.out.println("result  is ");
       for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}



