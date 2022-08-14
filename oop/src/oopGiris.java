public class oopGiris {
    public static void main(String[] args) {
        Memur m1 = new Memur();
        m1.setIsim("Ayşe");
        m1.setMaas(4500);

        System.out.println();

        Memur m2 = new Memur();
        m2.setIsim("Fatma");
        m2.setMaas(4000);

        m1.bilgileriGoster();




        

    }
}



class Memur{

    private String isim;
    private int maas;
    public static int memurNesnesi;


    public Memur() {
            memurNesnesi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;

    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas < 0) {
            maas =0;
        }
        this.maas = maas;

    }

    public void bilgileriGoster() {
        System.out.println("nesne sayısı: " + memurNesnesi);
    }



}










