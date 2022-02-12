import java.util.Scanner;

public class Artıkyıl {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int year=a.nextInt();
        if (year%4==0 )
        {
            System.out.println(year+ " artık yıldır");
        }

        else if (year%100==0 && year%400==0)
        {
            System.out.println(year+ " artık yıldır");
        }

        else
        {
            System.out.println(year+ " artık yıl değildir.");
        }

    }
}
