public class Car {

    String marka;
    String model;
    int yil;

    public Car(String marka, String model, int yil) {

        this.marka = marka;
        this.model = model;
        this.yil = yil;
        // this bir keyword parametre isimleri ile değişken isimleri çakıştığında kullanılır.

    }
    public void Cikti() {

        System.out.println("Marka " + marka);
        System.out.println("Model " + model);
        System.out.println(" Yil " + yil);

    }
    public static void main (String[] args) {

        Car araba = new Car("Nissan", "X-Trail", 2023);

        araba.Cikti();

    }



}

