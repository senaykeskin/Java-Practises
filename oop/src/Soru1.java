import java.util.Locale;
import java.util.Scanner;

public class Soru1 {

    public static void main(String[] args) {

        CemberDaire c1 = new CemberDaire();

        //System.out.printf("yarıçapı " + c1.yaricapAl() + " olan darirenin çevresi : %.2f \n", c1.cevreBul());
        //System.out.printf("yarıçapı " + c1.yaricapAl() + " olan darirenin alanı: %.2f ", c1.alanBul());

        String myStr1 = "HELLOo";
        String myStr2 = "hello";
        String txt = myStr2.toUpperCase();
        System.out.println(myStr1.compareTo(txt));
        System.out.println(myStr1.compareToIgnoreCase(myStr2));
        System.out.println(myStr1.hashCode());



    }

}


class CemberDaire {
    Scanner scan = new Scanner(System.in);

    private int yaricap;
    public static final double PI = 3.14;


    public int yaricapAl() {
        System.out.print("yarıçap giriniz: ");
        this.yaricap = scan.nextInt();
        return yaricap;
    }

    public double cevreBul() {
        return (2*PI*yaricap);
    }

    public double alanBul() {
        return PI*yaricap*yaricap;
    }


}
