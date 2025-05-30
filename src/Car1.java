public class Car1 {


    static class Car {
        private String marka;
        private String model;
        private int yil;

        public Car(String marka, String model, int yil) {
            this.marka = marka;
            this.model = model;
            this.yil = yil;
        }

        public void displayInfo() {
            System.out.println("Araba bilgisi: " + marka + " " + model + " " + yil);
        }
    }


    public static void main(String[] args) {
        Car araba1 = new Car("Toyota", "Corolla", 2020);
        Car araba2 = new Car("Honda", "Civic", 2021);
        Car araba3 = new Car("Tofaş", "Şahin", 1998);

        araba1.displayInfo();
        araba2.displayInfo();
        araba3.displayInfo();
    }
}

