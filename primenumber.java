import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int n= scan.nextInt();
        System.out.println(isPrime(n,2)?"Asal Sayıdır":"Asal Sayı Değildir");
    }
    static boolean isPrime(int number,int i){
        if(i>=number){
            return true;
        }
        if(number%i==0){
            return false;
        }
        else return isPrime(number,i+1);
    }
}


