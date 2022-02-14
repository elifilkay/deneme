import java.util.Scanner;

public class odv {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n= scanner.nextInt();
        int i=1;
        System.out.println("4'ün kuvvetleri");
        while(true){
            if(i<=n){
                System.out.println(i);
            }
            else{
                break;

            }
            i*=4;


        }
        System.out.println();
        i = 1;

        System.out.println("5'in kuvvetleri ");
        while(true){
            if((i)<=n){
                System.out.println(i);
            }
            else{
                break;
            }
            i*=5;
        }
    }
}
