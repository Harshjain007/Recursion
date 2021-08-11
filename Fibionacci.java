import java.util.Scanner;

public class Fibionacci {

    public static int fibionacciSeries(int n){
        if(n == 0 || n == 1){
            
            return n;
        }
        n = fibionacciSeries(n-1)+fibionacciSeries(n-2);
        
        return n;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the number of the Series:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibionacciSeries(n));
        sc.close();
    }
}
//O(n)