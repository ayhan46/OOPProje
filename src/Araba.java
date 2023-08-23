public class Araba {

    private String kasaTipi;
    private String model;
    private int fiyat;
    private int kapi;
    private int kullanimKm;

    public Araba(String kasaTipi, String model, int kullanimKm, int fiyat, int kapi){
        this.kasaTipi = kasaTipi;
        this.model = model;
        this.kullanimKm = kullanimKm;
        this.fiyat = fiyat;
        this.kapi = kapi;
    }

    public String getKasaTipi() {
        return kasaTipi;
    }

    public String getModel() {
        return model;
    }

    public int getFiyat() {
        return fiyat;
    }

    public int getKapi() {
        return kapi;
    }

    public int getKullanimKm() {
        return kullanimKm;
    }


    public void arabayiSur(int surulenKm){
        this.kullanimKm += surulenKm;
        System.out.println(" Arabanin yeni kilometresi " + this.kullanimKm);
    }

    public int satisFiyati(int yeniSatisFiyati){
        return this.fiyat = yeniSatisFiyati;
    }


}



