import java.util.Scanner;

public class Patika {
    public static void main(String[] args) {
        String burç=" ";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Doğum yılını giriniz: ");
        int yıl=scanner.nextInt();
        if(yıl%12==0){
            burç="Maymun";
        }
        if (yıl%12==1){
            burç="Horoz";
        }
        if (yıl%12==2){
            burç="Köpek";
        }
        if (yıl%12==3){
            burç="Domuz";
        }
        if (yıl%12==4){
            burç="Fare";
        }
        if (yıl%12==5){
            burç="Öküz";
        }
        if (yıl%12==6){
            burç="Kaplan";
        }
        if (yıl%12==7){
            burç="Tavşan";
        }
        if (yıl%12==8){
            burç="Ejderha";
        }

        System.out.println("Çin zodyağı burcunuz: "+burç);




    }
}
