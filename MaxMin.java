import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " .eleman :");
            int s = in.nextInt();
            if (i == 1) {
                min= s;
                max= s;
            } else {
                if (s > max) {
                    max = s;
                }
                if (s < min) {
                    min = s;

                }
            }
        }
        System.out.println("En büyük sayı: "+ max+" "+" En küçük sayı: "+min);
    }
}


