public class Yönetici extends Calısan {
    private int sorumluKişi_sayısı;
    public Yönetici(String ad, String soyad, int id, int sorumluKişi_sayısı) {
        super(ad, soyad, id);
        this.sorumluKişi_sayısı = sorumluKişi_sayısı;
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı "+sorumluKişi_sayısı);
    }
    public void zamYap(int zam_miktarı){
        System.out.println( getAd()+ " çalışanlara "+ zam_miktarı+ " Tl kadar zam yapıyor...");
    }
}

