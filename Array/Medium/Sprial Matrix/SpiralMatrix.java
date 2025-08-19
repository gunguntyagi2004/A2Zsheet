  
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralReader(int [][]arr){
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        int sr = 0, sc = 0, er = m-1, ec = n-1;

        while(sr <= er && sc <= ec){

            // top row
            for(int j = sc; j <= ec; j++){
                ans.add(arr[sr][j]);
            }

            // right column
            for(int i = sr+1; i <= er; i++){
                ans.add(arr[i][ec]);
            }

            // bottom row (check if still valid)
            if(sr < er){
                for(int j = ec-1; j >= sc; j--){
                    ans.add(arr[er][j]);
                }
            }

            // left column (check if still valid)
            if(sc < ec){
                for(int i = er-1; i > sr; i--){
                    ans.add(arr[i][sc]);
                }
            }

            // move to inner layer
            sr++; sc++;
            er--; ec--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        System.out.println("output is: " + spiralReader(arr));
    }
}
v