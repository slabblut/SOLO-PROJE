import java.util.Calendar;

public class Car2 {

    private String marka;
    private String model;
    private int yil;

    public Car2(String Marka, String Model, int Yil) {
        this.marka = Marka;
        this.model = Model;
        this.yil = Yil;
    }
    public String getMarka(){
        return marka;
    }
    public String getModel(){
        return model;
    }
    public int getYil() {
        return yil;
    }
    public static void main(String[] args) {
        Car2 arabam = new Car2("Tofaş", "Şahin", 1995);

        System.out.println("Marka" + arabam.getMarka());
        System.out.println("Model" + arabam.getModel());
        System.out.println("Yıl" + arabam.getYil());

        System.out.println("Araç Bilgi Paketi: " + arabam.getMarka() + " " + arabam.getModel() + ", " + arabam.getYil() + " model");
    }
}
