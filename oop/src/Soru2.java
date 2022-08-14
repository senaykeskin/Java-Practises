public class Soru2 {
    public static void main(String[] args) {
        Ogrenci tumOgrenciler[] = new Ogrenci[100];

        for (int i=0; i<100; i++) {
            int rastgeleID = (int)(Math.random()*5000);
            int rastgeleNot = (int)(Math.random()*100);

            Ogrenci yeni = new Ogrenci(rastgeleID, rastgeleNot);
            tumOgrenciler[i] = yeni;
        }

        notlaraGoreSirala(tumOgrenciler);

        for (int i=0; i<100; i++) {
            tumOgrenciler[i].ogrenciBilgileriniYazir();
        }




    }

    private static void notlaraGoreSirala(Ogrenci[] tumOgrenciler) {

        for (int i=0; i< tumOgrenciler.length -1; i++) {
            int oankiEnBuyukSayi = tumOgrenciler[i].getNot();
            int oankiEnBuyukSayiIndex =i;

            for (int j=i+1; j< tumOgrenciler.length; j++) {
                if (oankiEnBuyukSayi < tumOgrenciler[j].getNot()) {
                    oankiEnBuyukSayi = tumOgrenciler[j].getNot();
                    oankiEnBuyukSayiIndex =j;
                }
                if (oankiEnBuyukSayiIndex != i) {
                    tumOgrenciler[oankiEnBuyukSayiIndex] = tumOgrenciler[i];
                    tumOgrenciler[i].setNot(oankiEnBuyukSayi);
                }
            }


        }




    }


}
class Ogrenci {
    private int id;
    private int not;

    public Ogrenci(int id, int not) {
        this.id = id;
        this.not = not;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }

    public void ogrenciBilgileriniYazir() {
        System.out.println("id: " + id + " not: " + not);
    }
}
