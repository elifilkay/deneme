import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armutFyt=2.14, elmaFyt=3.67, domatFyt=1.11, muzFyt=0.95, patFyt=5;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç kilo elma alacaksınız: ");
        int k1=scanner.nextInt();
        System.out.println("Kaç kilo armut alacaksınız: ");
        int k2=scanner.nextInt();
        System.out.println("Kaç kilo domates alacaksınız: ");
        int k3=scanner.nextInt();
        System.out.println("Kaç kilo muz alacaksınız: ");
        int k4=scanner.nextInt();
        System.out.println("Kaç kilo patlican alacaksınız: ");
        int k5=scanner.nextInt();
        double tutar=(k1*elmaFyt+k2*armutFyt+k3*domatFyt+k4*muzFyt+k5*patFyt);
        System.out.println("Toplam tutar: "+tutar );


    }



}
