import java.util.Scanner;

public class üslüsayı {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Üs olacak sayı: ");
        int k=scanner.nextInt();
        System.out.println("Üssü alınacak sayı: ");//taban
        int n= scanner.nextInt();
        int total=1;
        for(int i=1;i<=k;i++ ){
            total*=n;

        }
        System.out.println(total);
    }
}
