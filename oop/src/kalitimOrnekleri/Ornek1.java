package kalitimOrnekleri;
import java.time.LocalDate;
import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ad: ");
        String ad = scan.nextLine();
        System.out.print("soyad: ");
        String soyad = scan.nextLine();
        String yeni = ad.concat(" " + soyad);

        System.out.println(yeni);

        Dikdortgen d1 = new Dikdortgen(5, 20);
        Kare k1 = new Kare(10);
        GeometrikSekil g1 = new GeometrikSekil(5, 8);
        GeometrikSekil gs1 = new Kare(7);
        System.out.println("zaman gösteriliyor");
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        alanGoster(k1);
        alanGoster(d1);
        alanGoster(g1);
    }
    public static void alanGoster(GeometrikSekil g) {
        // POLİMORFİZM OLMASAYDI!
    /*  if (g instanceof Kare) {
            System.out.println("kare çalıştı");
        } else if (g instanceof Dikdortgen) {
            System.out.println("dikdörtgen çalıştı");
        } else {
            System.out.println("geo çalıştı");
        }
         */

        g.alanHesapla();

    }

}

class GeometrikSekil {

    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
        //System.out.println("Geometrik şekil oluştruldu.");
    }

    public GeometrikSekil(int en) {
        this.en = en;
    }

    public int getEn() {
        return en;
    }

    public int getBoy() {
        return boy;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public void cevreHesapla() {
        System.out.println("Çevre: " + (en + boy) *2);
    }

    public void alanHesapla() {
        System.out.println("Geometrilşekil içinde hesaplanıyor.");
        System.out.println("Alan: " + en*boy);
    }

}

class Dikdortgen extends GeometrikSekil {

    public Dikdortgen(int en, int boy) {
        super(en, boy);
    }

    public Dikdortgen(int en) {
        super(en);
    }

    public void ozellikYazdir() {
        System.out.println("Dikdörtgenin eni: " + getEn() + " boyu: " + getBoy());
        alanHesapla();
        cevreHesapla();
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dikdörtgen içinde hesaplanıyor.");
        System.out.println("Alan: " + getEn()* getBoy());
    }

    @Override
    public String toString() {
        return "Dikdörtgenin eni: " + getEn() + " boyu: " + getBoy();
    }
}

class Kare extends Dikdortgen {
    public Kare(int en) {
        super(en);
        setBoy(en);

       // System.out.println("Kare oluşturuldu.");
    }

    @Override
    public String toString() {
        return "Karenin çevresi: " + getEn() * 4;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Kare içinde hesaplanıyor.");
        System.out.println("Alan: " + getEn()*getEn());
    }
}
