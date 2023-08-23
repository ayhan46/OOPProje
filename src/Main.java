public class Main {
    public static void main(String[] args) {

        Sedan sedanCoupe = new Sedan(" Opel ", 10000, 500000, 5);
        System.out.println(" Aracimin modeli " + sedanCoupe.getModel() + " kullanim km " + sedanCoupe.getKullanimKm() + " fiyati " + sedanCoupe.getFiyat() + " kapi sayisi " + sedanCoupe.getKapi());

        sedanCoupe.arabayiSur(5000);
        sedanCoupe.satisFiyati(495000);

        System.out.println(" Aracimin modeli " + sedanCoupe.getModel() + " kullanim km " + sedanCoupe.getKullanimKm() + " fiyati " + sedanCoupe.getFiyat() + " kapi sayisi " + sedanCoupe.getKapi());


    }
}