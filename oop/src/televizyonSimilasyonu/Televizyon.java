package televizyonSimilasyonu;

import java.util.ArrayList;

public class Televizyon {

    ArrayList<Kanal> kanallar;

    private String  model;
    private String boyut;
    private boolean acik;
    private int ses;
    private int aktifkanal;

    public Televizyon(String model, String boyut) {
        this.model = model;
        this.boyut = boyut;
        this.acik = false;
        kanallar = new ArrayList<>();
        ses = 10;
        aktifkanal = 1;
        kanallariolustur();
    }

    public void kanalDegistir(int istenenKanal) {
        if (acik) {
            if (aktifkanal != istenenKanal) {
                if (istenenKanal >=1 && istenenKanal <=kanallar.size()) {
                    aktifkanal = istenenKanal;
                    System.out.println("Kanal: " + aktifkanal + " Bilgi: " + kanallar.get(istenenKanal-1).toString());
                }
            } else {
                System.out.println("zaten " + istenenKanal + ". kanaldasınız");
            }
        } else {
            System.out.println("önce tvyi açın");
        }
    }

    public void kanalBilgisiniGoster() {
        if (acik) {
            System.out.println(kanallar.get(aktifkanal - 1).toString());
        } else {
            System.out.println("önce tv yi açın");
        }
    }

    public void sesAc() {
        if (ses < 20 && acik == true) {
            ses++;
            System.out.println("ses seviyesi: " + ses);
        } else if (ses ==20){
            System.out.println("ses zaten son seviyede");
        } else {
            System.out.println("önce tvyi açın");
        }
    }

    public void sesKapat() {
        if (ses > 0 && acik == true) {
            ses--;
            System.out.println("ses seviyesi: " + ses);
        } else if (ses == 0){
            System.out.println("ses zaten kapalı");
        } else {
            System.out.println("önce tvyi açın");
        }
    }

    public void tvAc() {
        if (acik == false) {
            System.out.println("Televizyon açıldı");
            acik = true;
        } else {
            System.out.println("Televizyon zaten açık");
        }
    }

    public void tvKapat() {
        if (acik == true) {
            System.out.println("Televizyon kapatıldı.");
            acik = false;
        } else {
            System.out.println("Televizyon zaten kapalı");

        }
    }


    public void kanallariolustur() {
        HaberKanali cnn = new HaberKanali("CNN", 1, "genel haber");
        kanallar.add(cnn);
        MuzikKanali powerTurk = new MuzikKanali("Power Turk", 2, "Yerli");
        kanallar.add(powerTurk);
        MuzikKanali numberOne = new MuzikKanali("Number One", 3, "Yabancı");
        kanallar.add(numberOne);


    }

    @Override
    public String toString() {
        return "model= '" + model + '\'' +
                ", boyut= '" + boyut + '\'' ;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }
}
