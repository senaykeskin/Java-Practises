import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //ÖRNEK 1
        System.out.println("ÖRNEK 1:\n ");
        int [] dizi1 = {1,2,3,4,5};
        int [] dizi2 = new int[dizi1.length];

       // System.arraycopy(dizi1,0,dizi2,0,5);


        for (int i=0, j=dizi1.length -1; i< dizi1.length; i++, j--) {
            dizi2[j] = dizi1[i];
        }

         for (int sayi: dizi2) {
             System.out.print(sayi + " ");
         }

        System.out.println("\n****************************\n");

         //ÖRNEK 2
        System.out.println("ÖRNEK 2: ");
        int [][] sayilar = {{0,100, 200} , {350,0,250} , {150,500,0}};
        String [] isimler = {"Emre" , "Hasan" , "Ali"};
        //String [] isimler2 = {"Emre" , "Hasan" , "Ali"};
        for (int satir = 0; satir< sayilar.length; satir++) {
            for (int sutun = 0; sutun <sayilar[satir].length; sutun++) {
                if (satir!=sutun) {

                    int alacak = sayilar[satir][sutun] - sayilar[sutun][satir];
                    if (alacak < 0)  {
                        System.out.println(isimler[satir] + " kişisinin " + isimler[sutun] + " kişisinden alacağı tutar: " + (-alacak));
                    }

                }
            }
        }

        System.out.println("\n****************************\n");



        //ÖRNEK 3
        System.out.println("ÖRNEK 3: ");
        int [] karisikSayilar = {9,5,56,34,4,3,76,6};
        int [] karisikSayilar2 = {9,5,56,34,4,3,76,6};
        int []  siraliDizi = new int[karisikSayilar.length];
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
        


        

    }

    private static void diziYazdir(int [] yazilacakDizi) {
        for (int sayi: yazilacakDizi) {
            System.out.print(sayi + "\t");
        }
    }
    
    
}
