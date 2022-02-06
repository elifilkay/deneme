import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Çalışanlar Programına hoşgeldiniz...");
        String işlemler="İşlemler..\n"+
               " 1.Yazılımcı İşlemleri\n"+
               " 2.Yönetici İşlemleri\n"+
                " 3.Çıkış";
        System.out.println("************************");
        System.out.println(işlemler);
        System.out.println("*************************");
        while (true){
            System.out.print("İşlem seçiniz:");
            String işlem=scanner.next();
            if(işlem.equals("3")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if (işlem.equals("1")){
                Yazılımcı yazılımcı=new Yazılımcı("ELİF İLKAY","ÖZKAN",567,"Java,Phyton,C#");
                String yazılımcı_işlemleri="1.Format at \n"+
                        "2.Bilgileri göster\n"+
                        "3.Çıkış";
                System.out.println(yazılımcı_işlemleri);
                while (true){
                    System.out.println("İşlem seçiniz: ");
                    String a= scanner.next();
                    if(a.equals("3")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor..");
                        break;
                    }
                    else if (a.equals("1")){
                        System.out.println("İşletim sitemi:");
                        String işletim_sistemi=scanner.next();
                        yazılımcı.formatAt(işletim_sistemi);
                    }
                    else if(a.equals("2")){
                        yazılımcı.bilgileriGöster();
                    }
                    else{
                        System.out.println("Geçersiz işlem");
                    }

                }

            }
            else if(işlem.equals("2")){
                System.out.println("Yöneetici işlemlerine hoşgeldiniz");
                Yönetici yönetici=new Yönetici("Arda","Sönmez",789,5);
                String yönetici_işlemleri="1.Bilgileri Göster\n"+
                        "2.Zam Yap\n"+
                        "3.Çıkış";
                System.out.println(yönetici_işlemleri);
                while (true){
                    System.out.print("İşlem seçiniz:");
                    String b=scanner.next();
                    if(b.equals("1")){
                        yönetici.bilgileriGöster();
                    }
                    else if (b.equals("2")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zam= scanner.nextInt();
                        yönetici.zamYap(zam);
                    }
                    else if (b.equals("3")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else{
                        System.out.println("Geçersiz işlem");
                    }
                }

            }
            else{
                System.out.println("Geçersiz işlem..");
            }



        }

    }
}
