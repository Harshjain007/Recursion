import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Factorial:");
        int num = sc.nextInt();
        System.out.print(fact(num));
        sc.close();
    }
}

//O(n)
