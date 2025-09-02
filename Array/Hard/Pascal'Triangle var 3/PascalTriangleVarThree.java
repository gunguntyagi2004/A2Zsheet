import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class PascalTriangleVarThree{




    public static ArrayList<ArrayList<Integer>> pascalTriangle(int n){
        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        ArrayList<Integer>firstRow=new ArrayList<>();
        firstRow.add(1);
        res.add(firstRow);


        for(int i=0;i<n;i++){
            ArrayList<Integer>prevRow=res.get(i-1);
            
            
        }
        
    
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<ArrayList<Integer>>res= pascalTriangle(n);

    }
}