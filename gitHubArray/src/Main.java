import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayilar[] = {1,2,3};
        System.out.println("dizi değerleri artmadan önce:");
        diziGoster(sayilar);
        System.out.println("dizi değerleri arttıktan sonra:");
        diziArtti(sayilar);

    }

    private static void diziArtti(int[] sayilar) {

        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
        for (int b: sayilar) {
            System.out.println("eleman: " + b);
        }
    }

    private static void diziGoster(int[] dizi) {
        for (int a : dizi) {
            System.out.println("eleman: " + a);
        }
    }










}
