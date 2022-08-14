public class Soru3 {
    public static void main(String[] args) {

        System.out.println("Toplam: " + HesapMakinesi.sum(1,2,3,4));
        System.out.println("Çıkarma: " + HesapMakinesi.subtract(98,65,7));
        System.out.println("Çarpma: " + HesapMakinesi.multiply(98,65));
        if (HesapMakinesi.divide(35,2,4) != -1) {
            System.out.println("Bölme: " + HesapMakinesi.divide(32,2,4));
        } else {
            System.out.println("bölme başarısız");
        }


    }


}

class HesapMakinesi {

    public static int sum(int... parametreler) {
        int toplam = 0;
        for (int parametre : parametreler) {
            toplam += parametre;
        }
        return toplam;
    }

    public static int subtract(int... parametreler) {
        int fark = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            fark = fark - parametreler[i];
        }
        return fark;
    }

    public static int multiply(int... parametreler) {
        int multiply = 1;

        for (int parametre : parametreler) {
            multiply += parametre;
        }
        return multiply;
    }

    public static double divide(int... parametreler) {
        double bolum = parametreler[0];
        for (int i = 1; i < parametreler.length; i++) {
            if (parametreler[i] == 0) {
                return -1;
            } else {
                bolum = bolum / parametreler[i];
            }
        }
        return bolum;


    }

}
