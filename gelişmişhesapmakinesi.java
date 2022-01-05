import java.util.Scanner;

public class gelişmişhesapmakinesi {
    static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        return result;
    }

    static int multiple(int a, int b) {
        int result = a * b;
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0)
            System.out.println(" Sonuç tanımsızdır.");
        int y = a / b;
        return y;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        if(b==0)
            System.out.println("işlemin sonucu tanımsız");
        int result = a % b;
        return result;
    }

    static void calculate(int a, int b) {
        System.out.println("çevre: " + 2 * (a + b));
        System.out.println("alan: " + a * b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = "1-Toplama işlemi" +
                " 2-Çıkarma işlemi " +
                "3-Çarpma işlemi" +
                "4-Bölme işlemi" +
                " 5-Üslü sayı hesabı" +
                " 6-Mod alma" +
                " 7-Dikdörtgen alan ve çevre hesabı";


        while (true) {
            System.out.println(menu);
            System.out.println("Bir menü seçiniz:");
            int selection = scanner.nextInt();
            System.out.println("birinci sayıyı girin:");
            int a = scanner.nextInt();
            System.out.println("İkinci sayıyı girin:");
            int b = scanner.nextInt();
            switch (selection) {
                case 1:
                    sum(a, b);
                    System.out.println(sum(a,b));
                    break;
                case 2:
                    minus(a, b);
                    System.out.println(minus(a,b));
                    break;
                case 3:
                    multiple(a, b);
                    System.out.println(multiple(a,b));
                    break;
                case 4:
                    divided(a, b);
                    System.out.println(divided(a,b));
                    break;
                case 5:
                    power(a, b);
                    System.out.println(power(a,b));
                    break;
                case 6:
                    mod(a, b);
                    System.out.println(mod(a,b));
                    if(b==0)
                        System.out.println("işlem tanımsız");
                    break;
                case 7:
                    calculate(a, b);
                    break;
                default:
                        System.out.println("Geçersiz işlem");


            }


        }
    }
}
