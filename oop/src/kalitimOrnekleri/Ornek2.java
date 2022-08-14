package kalitimOrnekleri;

public class Ornek2 {
    public static void main(String[] args) {
        Personel mudur = new Personel("Ayşe", 21, 12345, "müdür");
        System.out.println(mudur);
        System.out.println();

        Ogrenci ayse = new Ogrenci("Ayşegül", 10, 1235432, 5678);
        System.out.println(ayse);

        MezunOgrenci mezun = new MezunOgrenci("fatma", 34, 1234765, 7654, "Ankara");
        System.out.println(mezun);

    }
}

class Kisi {

    private String isim;
    private int yas;
    private long tckimlik;

    public Kisi() {
        isim = "henüz atanmadı";
        yas = 18;
        tckimlik = 0;
    }

    public Kisi(String isim, int yas, long tckimlik) {
        this.isim = isim;
        this.yas = yas;
        this.tckimlik = tckimlik;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18)
            this.yas = yas;
        else yas =18;

    }

    public long getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(long tckimlik) {
        this.tckimlik = tckimlik;
    }

    @Override
    public String toString() {
        return "isim='" + isim + ", yas=" + yas + ", tckimlik=" + tckimlik;
    }
}

class Personel extends Kisi {

    private String pozisyon;

    public Personel(String isim, int yas, long tckimlik, String pozisyon) {
//        setIsim(isim);
//        setYas(yas);
//        setTckimlik(tckimlik);
        super(isim, yas, tckimlik);
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel adı: " + getIsim() + " \ntckimlik: " + getTckimlik() + " \nyaşı: " + getYas() + " \npozisyonu: " + pozisyon;
    }
}

class Ogrenci extends Kisi {
    private int ogrenciNo;

    public Ogrenci(String isim, int yas, long tckimlik, int ogrenciNo) {
//      setIsim(isim);
//      setYas(yas);
//      setTckimlik(tckimlik);
        super(isim, yas, tckimlik);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "Öğrenci adı: " + getIsim() + " \ntckimlik: " + getTckimlik() + " \nyaşı: " + getYas() + " \nokul nosu: " + ogrenciNo;
    }
}

class MezunOgrenci extends Ogrenci {

    private String calismaYeri;

    public MezunOgrenci(String isim, int yas, long tckimlik, int ogrenciNo, String calismaYeri) {
        super(isim, yas, tckimlik, ogrenciNo);
        this.calismaYeri = calismaYeri;
    }

    public String toString() {
        return "çalışma yeri: " + calismaYeri;
    }

    


}









