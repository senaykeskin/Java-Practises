package kalitimOrnekleri;

import java.util.ArrayList;


public class yiginYapisi {
    public static void main(String[] args) {

        MyStack ms = new MyStack();

        Ogrenci ogr1 = new Ogrenci("ayse", 5, 1234, 34);
        Ogrenci ogr2 = new Ogrenci("fatma", 5, 1234, 34);

        ms.push(ogr1);
        ms.push(ogr2);

        System.out.println(ms.bosMu());
        System.out.println(ms.pop());
        System.out.println("kaç eleman var: ");
        System.out.println(ms.kacElemanVar());

        ms.elemanGoster();

    }
}

class MyStack{

    private ArrayList<Object> liste;

    public MyStack(){
        liste = new ArrayList<>();
    }

    public boolean bosMu() {
        if (liste.size() >0) {
            return false;
        } else return true;
    }

    public int kacElemanVar() {
        return liste.size();
    }

    public Object pop() {
        Object gecici = liste.get(kacElemanVar() -1);
        liste.remove(kacElemanVar() - 1);
        return gecici;
    }

    public void push(Object eleman) {
        liste.add(eleman);
    }

    public void elemanGoster() {
        System.out.println("*********************");
        for(int i = 0; i< liste.size(); i++) {
            System.out.println(liste.get(i));
        }
    }






}
