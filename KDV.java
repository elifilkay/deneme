import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Tutar giriniz: ");
            double tutar = scanner.nextDouble();
            if (0 < tutar && tutar <= 1000) {
                double kdvOran = 0.18;
                double Kdv = tutar * kdvOran;
                double kdvli = tutar + (tutar * kdvOran);
                System.out.println("Kdv: " + Kdv);
                System.out.println("Kdv'li fiyat: " + kdvli);

            } else {
                double kdvOran = 0.08;
                double Kdv = tutar * kdvOran;
                double kdvli = tutar + (tutar * kdvOran);
                System.out.println("Kdv: " + Kdv);
                System.out.println("Kdv'li fiyat: " + kdvli);


            }


        }

    }
}





