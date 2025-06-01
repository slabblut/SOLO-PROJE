
public class Person {
    String kimlikAdi;
    int dogumYili;

    public Person(String kimlikAdi, int dogumYili) {
        this.kimlikAdi = kimlikAdi;
        this.dogumYili = dogumYili;
    }

    public void tanit() {
        System.out.println("Kişi: " + kimlikAdi + ", Doğum Yılı: " + dogumYili);
    }
}
class Student extends Person {

    String okulSeviyesi;

    public Student( String kimlikAdi, int dogumYili, String okulSeviyesi) {

        super(kimlikAdi, dogumYili);
        this.okulSeviyesi= okulSeviyesi;
    }

    public void bilgileriYazdir() {

        super.tanit();
        System.out.println("öğrenci seviyesi" + " " + this.okulSeviyesi);

    }
    public static void main(String[] args) {
        Student ogrenci = new Student("Sıla BULUT", 2003, "Üniversite");
        ogrenci.bilgileriYazdir();
    }
}


