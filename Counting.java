import java.util.Scanner;

public class Counting {

    public static void print(int n){
        if(n <= 0){
            return;
        }
        else{
            print(n-1);
            System.out.print(n+" ");
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int in = sc.nextInt();
        print(in);
        sc.close();

    }    
}
//O(n)