import java.util.Arrays;



public class Main {

    public static void main(String[] args) {

        //ÖRNEK 1
        System.out.println("ÖRNEK 1:\n ");
        int[] dizi1 = {1, 2, 3, 4, 5};
        int[] dizi2 = new int[dizi1.length];

        // System.arraycopy(dizi1,0,dizi2,0,5);


        for (int i = 0, j = dizi1.length - 1; i < dizi1.length; i++, j--) {
            dizi2[j] = dizi1[i];
        }

        for (int sayi : dizi2) {
            System.out.print(sayi + " ");
        }

        System.out.println("\n****************************\n");

        //ÖRNEK 2
        System.out.println("ÖRNEK 2: ");
        int[][] sayilar = {{0, 100, 200}, {350, 0, 250}, {150, 500, 0}};
        String[] isimler = {"Emre", "Hasan", "Ali"};
        //String [] isimler2 = {"Emre" , "Hasan" , "Ali"};
        for (int satir = 0; satir < sayilar.length; satir++) {
            for (int sutun = 0; sutun < sayilar[satir].length; sutun++) {
                if (satir != sutun) {

                    int alacak = sayilar[satir][sutun] - sayilar[sutun][satir];
                    if (alacak < 0) {
                        System.out.println(isimler[satir] + " kişisinin " + isimler[sutun] + " kişisinden alacağı tutar: " + (-alacak));
                    }

                }
            }
        }

        System.out.println("\n****************************\n");


        //ÖRNEK 3
        System.out.println("ÖRNEK 3: ");
        int[] karisikSayilar = {9, 5, 56, 34, 4, 3, 76, 6};
        int[] karisikSayilar2 = {9, 5, 56, 34, 4, 3, 76, 6};
        int[] siraliDizi = new int[karisikSayilar.length];
        System.out.print("sıralı dizi: ");
        System.arraycopy(karisikSayilar, 0, siraliDizi, 0, karisikSayilar.length);

        Arrays.sort(siraliDizi);
        diziYazdir(siraliDizi);

        System.out.print("\nkarışık sayılar: ");
        diziYazdir(karisikSayilar);


        if (Arrays.equals(karisikSayilar, karisikSayilar2)) {
            System.out.println("\ndiziler eşit");
        } else {
            System.out.println("\ndiziler eşit değil");
        }


        System.out.println("\n***************************\n");

        // ÖRNEK 4
        System.out.println("ÖRNEK 4");

        int[] sayilar2 = {1, 2, 3, 4, 5, 6, 7};


        diziYerDegistir(sayilar2);
        System.out.println("dizi yer değiştirdikten sonra: ");
        diziYazdir(sayilar2);
        selectionSortSiralama(sayilar2);
        System.out.println("dizi sıralandıktan sonra: ");
        diziYazdir(sayilar2);

        System.out.println("\n***************************\n");

        //ÖRNEK 5
        System.out.println("ÖRNEK 5");

        int [] ornek = {11,3,5,7,2,66,34,65};
        int [] ornek2 = {11,3,5,7,2,66,34,65};


        Arrays.sort(ornek);
        Arrays.sort(ornek2);

        System.out.print("iki dizi eşit mi: ");

        if (Arrays.equals(ornek,ornek2)) {
            System.out.println("evet");
        } else {
            System.out.println("hayır");
        }

        System.out.println("\n***************************\n");

        //ÖRNEK 6
        System.out.println("ÖRNEK 6");

        int [] arr = new int[100];
        double toplam=0;
        for (int i = 0; i< arr.length; i++) {
            arr[i] = (int)(Math.random()* 100);
            toplam += arr[i];
        }
        double ort = toplam / arr.length;

        int kisi=0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] < ort) {
                kisi += 1;
            }
        }
        System.out.println("ortalama: " + ort + " ortalama altında kalan sayısı: " + kisi);

        System.out.println("\n***************************\n");

        //ÖRNEK 7
        System.out.println("ÖRNEK 7");

        int [][] array = new int[3][2];
        int enKucuk=700, enBuyuk=0;

        for (int satir = 0; satir < sayilar.length; satir++) {
            for (int sutun = 0; sutun < 2; sutun++) {
                int rastgele = (int)(Math.random()* 100);
                array[satir][sutun] = rastgele;
                System.out.println((satir+1) + ". satırdaki " + (sutun+1) + ". sütundaki değer: " + array[satir][sutun]);
                if (enKucuk > rastgele) {
                    enKucuk = rastgele;
                }
                if (enBuyuk < rastgele) {
                    enBuyuk = rastgele;
                }

            }
        }
        System.out.println("en küçük değer: " + enKucuk + " en büyük değer: " + enBuyuk);


        //ORNEK 8
        System.out.println("\n******************************\n");

        String [] kartTurleri = {"Kupa", "Maça", "Karo", "Sinek"};
        String [] kartNumaralari = {"As" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "J", "Q" ,"K"};
        int [] deste = new int[52];

        desteyiGoster(deste, kartTurleri, kartNumaralari);



        }

    private static void desteyiGoster(int[] deste, String[] kartTurleri, String[] kartNolari) {
        String [] kartTuru = kartTurleri;
        String [] kartNo = kartNolari;
    }
















    private static void selectionSortSiralama(int [] dizi) {
        for (int i=0 ; i<dizi.length -1; i++) {
            // en küçük elemanın indexinin bulunması

            int oankiEnKucukSayi = dizi[i];
            int oankiEnKucukElemaninIndexi = i;

            for (int j = i+1; j < dizi.length; j++) {
                if (oankiEnKucukSayi > dizi[j]) {
                    oankiEnKucukSayi = dizi[j];
                    oankiEnKucukElemaninIndexi = j;
                }
            }
            if (oankiEnKucukSayi != i) {
                dizi[oankiEnKucukElemaninIndexi] = dizi[i];
                dizi[i] = oankiEnKucukSayi;
            }
        }



    }

    private static void diziYerDegistir(int [] dizi) {
        for (int i= dizi.length - 1; i>0; i--) {
            int rastgeleSayi= (int)(Math.random() * (i+1));

            int gecici = dizi[i];
            dizi[i] = dizi[rastgeleSayi];
            dizi[rastgeleSayi] = gecici;
        }
    }

    private static void diziYazdir(int [] yazilacakDizi) {
        for (int sayi: yazilacakDizi) {
            System.out.print(sayi + "\t");
        }
    }
    
    
}
