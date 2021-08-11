public class DigitsInWord {

    static void Digits(int n, String st[]){
        
        
       

        if(n == 0){
            return;
        }
        
        Digits(n/10,st);
        System.out.print(st[n%10]+" ");
    } 
    public static void main(String[] args) {
        String st[] = {"zero","One", "Two","Three","Four","Five","Six","Seven","Eight", "Nine"};
        int n = 987;
        Digits(n,st);
    }
}
//O(n)