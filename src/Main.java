class Animal {

    public void sesCikar() {
        System.out.println("Hayvanlar ses çıkarıyor");
    }
}
class Kedi extends Animal {
    @Override
    public void sesCikar () {
        System.out.println("Miyav");
    }
}
class kopek extends Animal {
    @Override
    public void sesCikar() {
        System.out.println("hav");
    }
}
public class Main {
    public static void main(String[] args) {

        Animal hayvan = new Kedi();
        Animal hayvan1 = new kopek();
        hayvan.sesCikar();
        hayvan1.sesCikar();
    }

}
