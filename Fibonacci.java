import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number= scanner.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<number;i++){ //0 1 1 2 3 5 8 ...
                                  //a b c
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");

        }
    }
}
