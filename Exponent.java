public class Exponent {
    static int exponent(int n,int p){
        
        if(p==0){
            return 1;
        }
        int ans =  n * exponent(n,p-1);
        return ans;
    }
    public static void main(String[] args) {
        int n=4;
        int p = 4;
        System.out.print(exponent(n,p));
    }
}

//O(logN)