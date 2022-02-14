import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n= scanner.nextInt();
        int total=1;
        for(int i=1;i<=n;i++){
            total*=i;

        }
        System.out.print("Grup sayısı giriniz: ");
        int r=scanner.nextInt();
        int tot=1;
        for(int i=1;i<=r;i++){
            tot*=i;
        }

        int a =n-r;
        int fak=1;
        for(int i=1;i<=a;i++){
            fak*=i;

        }
        int sonuç =total/(tot*fak);
        System.out.print(n+ "'in " + r + "'li kombinasyonu: "+ sonuç);


    }

}
