class Arac {
    public void start() {
        System.out.println("Araç çalışıyor");
    }
}

class Araba extends Arac {
    @Override
    public void start() {
        System.out.println("Araba kontağı çevirince çalıştı");
    }
}

public class Main {
    public static void main(String[] args) {
        Arac arac = new Arac();
        arac.start();

        Araba araba = new Araba();
        araba.start();
    }
}

