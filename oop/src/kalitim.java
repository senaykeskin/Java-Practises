public class kalitim {
    public static void main(String[] args) {
        //Motor motor = new Motor();
        Araba araba = new Araba();

        araba.hareketeGec();
        araba.durdurmayaBasla();

    }
}

class Motor {
    private String isim;
    private int motorGucu;

    public Motor() {
        isim = "Honda";
        motorGucu = 140;
        System.out.println(isim + " isimli, " + motorGucu + " beygirli araba oluşturuldu.");
    }

    public void calistir() {
        System.out.println("Araba çalıştırıldı.");
    }

    public void durdur() {
        System.out.println("Araba durduruldu.");
    }
}

class Araba {

    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYili;

    public Araba() {
        arabaMotoru = new Motor();
        renk = "Kırmızı";
        marka = "Toyota";
        uretimYili = 2019;
    }

    public void hareketeGec() {
        System.out.println(marka + " markalı, " +renk + " renkli " + uretimYili + " model araç çalıştırıldı.");
    }

    public void durdurmayaBasla() {
        System.out.println(marka + " markalı, " +renk + " renkli " + uretimYili + " model araç durduruldu.");
    }
}

