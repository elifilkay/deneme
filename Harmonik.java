import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {

        double total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Sayiyi Giriniz: ");
       int number = input.nextInt();

        for (double i = 1; i <= number; i++){
            total += 1/i;
        }

        System.out.println("Harmonik Seri Degeri : " + total);

    }
}

