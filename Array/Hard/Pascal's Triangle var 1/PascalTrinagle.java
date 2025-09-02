public class PascalTrinagle{

// public static int fact(int n){
//     if (n==0 ||n==1){
//         return 1;
//     }
//     else{
//         return n*fact(n-1);
//     }
        
// }


//     public static int pascalVariantOne(int n,int r){
//         int factn=fact(n);
//         int factr=fact(r);
//         int factnr=fact(n-r);
//         return factn/(factr*factnr);
//     }

    public static int pascalVariantOne(int n,int r){
        int res=1;
       for (int i=0;i<r;i++){
         res=res*(n-i);
         res=res/(i+1);
       }
       return res;
    }
    public static void main(String[]args){
        int n=3;
        int r=1;
        System.out.println("element at (n,r)is:-"+pascalVariantOne(n,r));
    }
}