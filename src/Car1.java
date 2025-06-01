public class Car1 {

    // Alanları (özellikleri) tanımla
    String marka;
    String model;
    int yil;

    // Constructor (yapıcı metot)
    public Car1(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    // main metodu
    public static void main(String[] args) {
        Car1 araba = new Car1("Toyota", "Corolla", 2020);
        System.out.println("Marka: " + araba.marka);
    }
}


