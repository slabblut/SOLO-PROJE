public class Kisi {
    String isim;
    int yas;

    public Kisi() {
        this.isim = "BELİRLENMEDİ";
        this.yas = 0;
    }

    public void setBilgiler(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }
}

class Ogrenci extends Kisi {
    String okulAdi;

    public Ogrenci() {
    }

    public void setVeriler(String isim, int yas, String okulAdi) {
        super.setBilgiler(isim, yas);
        this.okulAdi = okulAdi;
    }

    public void verileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);
        System.out.println("Okul: " + okulAdi);
    }
}

class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setVeriler("SILA", 23, "Üniversite");
        ogrenci.verileriGoster();
    }
}
