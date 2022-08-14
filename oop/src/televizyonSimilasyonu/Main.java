package televizyonSimilasyonu;

import javax.swing.event.ListDataListener;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Televizyon tv;

    public static void main(String[] args) {

        menuGoster();
        boolean cikis = false;
        while (cikis == false) {
            System.out.print("işlem seçiniz: (menu için 8e basınız) ");
            int islem = scan.nextInt();
            switch (islem) {
                case 0:
                    System.out.println("çıkış yapılıyor.");
                    cikis = true;
                    break;
                case 1:
                    System.out.println("televizyon kuruluyor.");
                    televizyonKur();
                    break;
                case 2:
                    tvAc();
                    break;
                case 3:
                    sesAc();
                    break;
                case 4:
                    sesKapat();
                    break;
                case 5:
                    kanalDegistir();
                    break;
                case 7:
                    tvKapat();
                    break;
                case 6:
                    kanalBilgisiniGoster();
                    break;
                case 8:
                    menuGoster();
                    break;
                default:
                    System.out.println("0-8 arası bir seçim yapınız.");
                    break;

            }
        }

    }

    private static void kanalBilgisiniGoster() {
        if (tv != null) {
            tv.kanalBilgisiniGoster();
        } else {
            System.out.println("önce tv oluşturun");
        }
    }

    private static void kanalDegistir() {
        if (tv != null) {
            System.out.print("hangi kanala gitmek istiyorsun: ");
            int kanalNosu = scan.nextInt();
            tv.kanalDegistir(kanalNosu);
        }else {
            System.out.println("önce tv oluşturun");
        }
    }

    private static void sesAc() {
        if (tv != null) {
            tv.sesAc();
        } else {
            System.out.println("önce tv oluşturun.");
        }
    }

    private static void sesKapat() {
        if (tv != null) {
            tv.sesKapat();
        } else {
            System.out.println("önce tv oluşturun.");
        }
    }

    private static void tvKapat() {
        if (tv != null) {
            tv.tvKapat();
        } else {
            System.out.println("önce tv oluşturun");
        }
    }

    private static void tvAc() {
        if (tv != null) {
            tv.tvAc();
        } else {
            System.out.println("önce tv oluşturun");
        }
    }

    private static void televizyonKur() {

        if (tv == null) {
            scan.nextLine();
            System.out.println("televizyonun markasını giriniz: ");
            String marka = scan.nextLine();
            System.out.println("televizyonun boyutunu giriniz:");
            String boyut = scan.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        } else {
            System.out.println(tv);
        }

    }


    private static void menuGoster() {
        System.out.println("--------- MENU ----------");
        System.out.println("0 -- Çıkış\n" +
                "1 -- Televizyonu kur\n" +
                "2 -- Televizyonu aç\n" +
                "3 -- Sesi aç\n" +
                "4 -- Sesi kapat\n" +
                "5 -- Kanal değiştir\n" +
                "6 -- Kanal bilgisini göster\n" +
                "7 -- televizyonu kapat\n" +
                "8 -- Menüyü göster\n");

    }
}
