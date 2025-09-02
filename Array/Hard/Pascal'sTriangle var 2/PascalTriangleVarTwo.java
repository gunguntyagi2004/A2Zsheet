import java.util.Scanner;
public class PascalTriangleVarTwo {
   


    public static int binomialCoeff(int n,int r){
        int res=1;
        for(int i=0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
            
        }
        return res;
    }
    public static void pascalTriangle(int n){
        for (int i=0;i<=n;i++){
            if (n==0){
                System.out.println("1");
                break;
            }
           int ans= binomialCoeff(n,i);
           System.out.print(ans+" ");
        }
    }







    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("all element in pascal Triangle:- ");
        pascalTriangle(n);
    }
}
