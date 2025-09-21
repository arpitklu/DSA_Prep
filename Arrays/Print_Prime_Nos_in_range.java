import java.util.*;
public class Main{

    public static Boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is Not a Prime Number");
        }
    }
}