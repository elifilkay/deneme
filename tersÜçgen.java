import java.util.Scanner;

public class tersÜçgen {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = input.nextInt();

        for (int i=0; i<num; i++) {
            for (int j=0; j<=i + 1; j++) {
                System.out.print(" ");
            }

            for (int k=0; k<2*(num - i) - 1; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

