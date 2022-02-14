import java.util.Scanner;

public class basamakTop {
    public static void main(String[] args) {
        int sayi;
        Scanner s=new Scanner(System.in);
        System.out.print("Sayi girin: ");
        sayi=s.nextInt();
        int sayac=0,sonuc=0,value,copy_sayi=sayi;

        //basamak sayısı bulma
        while(copy_sayi!=0){
            copy_sayi /=10;
            sayac+=1;
        }

        copy_sayi=sayi;

        for(int i=0;i<sayac;i++){
            value=copy_sayi%10;
            sonuc+=value;
            copy_sayi /=10;

        }
        System.out.println(sayi+"'nın basamakları toplamı: "+sonuc);
    }
}


