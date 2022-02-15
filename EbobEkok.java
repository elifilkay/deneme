
import java.util.Scanner;
public class EbobEkok {

        public static void main(String[] args) {

            //EBOB İşlemi
            int ebob =1;
            Scanner scanner = new Scanner(System.in);

            System.out.print("1.sayıyı giriniz: ");
            int n1= scanner.nextInt();
            System.out.print("2.sayıyı giriniz: ");
            int n2= scanner.nextInt();


            if (n1<n2) {
                int i=1;
                while (i<=n1) {
                    if (n1%i==0 && n2%i==0) {
                        ebob=i;
                    }
                    i++;
                }
                System.out.println("Ebob: "+ebob);
            }
            else
            {
                int i=1;
                while (i<=n2) {
                    if (n1%i==0 && n2%i==0) {
                        ebob=i;
                    }
                    i++;
                }
                System.out.println("Ebob: "+ebob);
            }

            System.out.println("**************************************");

            //EKOK İşlemi

            int i=1;
            while (i<=(n1*n2)) {
                if (i%n1==0 && i%n2==0) {
                    System.out.println("Ekok: "+i);
                    break;
                }
                i++;
            }

            System.out.println(n1*n2 / ebob);
        }
    }

