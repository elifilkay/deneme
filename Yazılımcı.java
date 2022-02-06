public class Yazılımcı extends Calısan {
    private String diller;
    public Yazılımcı(String ad, String soyad, int id, String diller){
        super(ad, soyad, id);
        this.diller=diller;
    }
    public void formatAt(String işletim_sistemi){
        System.out.println(getAd()+ " "+ işletim_sistemi+ " ni yüklüyor");
    }

    @Override
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Yazılımcının bildiği diller: "+diller);
    }
}
