import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

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
























    }
}
