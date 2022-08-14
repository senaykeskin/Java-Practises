public class Soru4 {
    public static void main(String[] args) {
       /* BankaHesabi senay = new BankaHesabi(123,500);
        BankaHesabi nejdet = new BankaHesabi(124,1500);

        senay.yatirma(400);
        nejdet.cekme(300);

        System.out.println("Şenay'ın hesabındaki para: " + senay.getHesaptakiPara());
        System.out.println("Nejdet'in hesabındaki para: " + nejdet.getHesaptakiPara());
        BankaHesabi.bilgileriGoster();

        senay.kiyaslama(nejdet);
        nejdet.kiyaslama(senay);

        */

        B b = new B(10);


    }
}

class BankaHesabi {


    private int hesapNo, hesaptakiPara;
    private static int yatirmaSayisi = 0;
    private static int cekmeSayisi = 0;
    private static int tumBankaBakiyesi = 0;
    private static int tumHesapSayisi =0;

    public BankaHesabi(int hesapNo, int hesaptakiPara) {
        setHesapNo(hesapNo);
        setHesaptakiPara(hesaptakiPara);
        //this.hesapNo = hesapNo;
        //this.hesaptakiPara = hesaptakiPara;
        tumBankaBakiyesi += getHesaptakiPara();
        tumHesapSayisi++;
    }

    public int getHesaptakiPara() {
        return hesaptakiPara;
    }

    public void setHesaptakiPara(int hesaptakiPara) {
        this.hesaptakiPara = hesaptakiPara;
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public void yatirma(int yatanPara) {
        this.hesaptakiPara += yatanPara;
        tumBankaBakiyesi += yatanPara;
        yatirmaSayisi++;
    }

    public void cekme(int cekilenPara) {
        if (this.hesaptakiPara >= cekilenPara) {
            this.hesaptakiPara -= cekilenPara;
            tumBankaBakiyesi -= cekilenPara;
            cekmeSayisi++;
        } else {
            System.out.println("bakiye yetersiz");
        }

    }

    public static void bilgileriGoster() {
        System.out.println("Bankadaki toplam para: " + tumBankaBakiyesi );
        System.out.println("Bankadaki hesap sayısı : " + tumHesapSayisi);
        System.out.println("Bankada yapılan para yatırma sayısı : " + yatirmaSayisi);
        System.out.println("Bankada yapılan para çekme sayısı : " + cekmeSayisi);
    }

    public void kiyaslama(BankaHesabi kiyaslanacakHesap) {
        System.out.println();
        System.out.println(this.hesapNo + " nolu hesap bakiyesi: " + this.hesaptakiPara);
        System.out.println(kiyaslanacakHesap.hesapNo + " nolu hesap bakiyesi: " + kiyaslanacakHesap.hesaptakiPara);
        if (this.getHesapNo() < kiyaslanacakHesap.getHesapNo()) {
            System.out.println(this.hesapNo + " nolu hesaptaki para " + kiyaslanacakHesap.getHesapNo() + " nolu hesaptaki paradan azdır");
        }else if (this.getHesapNo() > kiyaslanacakHesap.getHesapNo()) {
            System.out.println(this.hesapNo + " nolu hesaptaki para " + kiyaslanacakHesap.getHesapNo() + " nolu hesaptaki paradan çoktur");
        } else {
            System.out.println(this.hesapNo + " nolu hesaptaki para " + kiyaslanacakHesap.getHesapNo() + " nolu hesaptaki paraya eşittir");
        }
    }


}

class A {
    int i;

    public A(int i) {
        this.i = i--;
    }
}

class B extends A {
    public B(int i) {
        super(++i);
        System.out.println(i);
    }
}


