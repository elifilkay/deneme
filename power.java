import java.util.Scanner;

public class power {
    static int power(int a,int b){
        if(b==0)
            return 1;

        else
            return a*power(a,b-1);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("taban sayıyı girin:");
        int a = scanner.nextInt();
        System.out.println("üssü girin:");
        int b= scanner.nextInt();
        System.out.println(power(a,b));
    }
}
