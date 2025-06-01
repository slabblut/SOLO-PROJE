class Tasit {
    int hiz;
}
class Araba extends Tasit {
    String marka;
    String model;

    public Araba(String marka, String model, int hiz) {
        this.marka = marka;
        this.model = model;
        this.hiz = hiz;
    }
    public void bilgileriGoster() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Hız: " + hiz + " km/saat");
    }
}

public class Main {
    public static void main(String[] args) {
        Araba arabam = new Araba("Toyota", "Corolla", 120);
        arabam.bilgileriGoster();
    }
}


