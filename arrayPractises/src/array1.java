import java.util.ArrayList;

public class array1 {

    public static void main(String[] args) {

        // 3x3'lük bir arrayde 1den 9a kadar olan sayılar random bir şekilde dizilecek


        int[][] array = new int[3][3];

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int sayi2= 9;

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {

                int sayi = (int)(Math.random()*sayi2-1);
                array[i][j] = arr.get(sayi);

                System.out.print(" " +array[i][j]);
                arr.remove(sayi);
                sayi2--;

            }
            System.out.println("\n");
        }


    }

}
