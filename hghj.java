import java.util.Scanner;

public class hghj{


        public static void main(String[] args) {
            Scanner girdi = new Scanner(System.in);

            int heat;

            System.out.println("Sıcaklığı giriniz...");
            heat= girdi.nextInt();

            if (heat<5){
                System.out.println("Kayak yapabilirsiniz...");
            }else if(heat>=5 && heat<= 15){
                System.out.println("Sinemaya gidebilirsiniz...");
            }else if(heat>=15 && heat<= 25){
                System.out.println("Pikniğe gidebilirsiniz....");
            }else if(heat>25){
                System.out.println("Yüzmeye git");
            }
        }
}
