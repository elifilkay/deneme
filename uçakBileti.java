import java.util.Scanner;

public class uçakBileti {
    public static void main(String[] args) {
        double km=0.1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz: ");
        double mesafe=scanner.nextDouble();
        if(mesafe<=0){
            System.out.println("Hatalı veriw girdiniz");
        }
        System.out.println("Yolculuk tipini giriniz:(1=>tek yön, 2=>gidiş dönüş ");
        int tip= scanner.nextInt();
        System.out.println("Yaşınızı giriniz: ");
        int yaş=scanner.nextInt();
        if(yaş<0){
            System.out.println("Hatalı veri girdiniz");

        }
        double tutar=km*mesafe;
        if(yaş<12)
            tutar/=2;
        if(yaş>=12 && yaş <24)
            tutar-=tutar*0.1;
        if(yaş>65)
            tutar-=tutar*0.3;

        if(tip==2) {
            tutar *= 2;
            tutar -= tutar * 0.2;
        }

        System.out.println("Toplam Tutar : "+tutar);

    }
}
