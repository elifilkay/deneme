import java.util.Scanner;

public class mükemmelSayı {
    public static void main(String[] args) {
        int total=0;
        Scanner scanner=new Scanner(System.in);
        while (true){
        System.out.print("Bir sayı giriniz:");
        int number=scanner.nextInt();

        for(int i=1;i<number;i++) {
            if(number%i==0) {
                total+=i;
            }
        }
        if(total==number) {
            System.out.println(number+" Mükemmel sayıdır.");
        }else {
            System.out.println(number+" Mükemmel sayı değildir.");
        }

    }
}
    }

