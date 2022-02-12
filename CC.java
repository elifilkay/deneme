import java.util.Scanner;

public class CC {
    public static void main(String[] args) {
        int toplam=0;int count=0;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int k=scanner.nextInt();
        for(int i=0;i<=k;i++){
            if (i%12==0){
                System.out.println(i);
                count++;
                toplam+=i;
            }

        }

        int ort=(toplam/count);
        System.out.println("Ortalama: "+ort);
        System.out.println("Toplam: "+toplam);

        }
    }

