public class Calculator {

    public int add (int a, int b) {
        return a + b;
    }
    public int add  (int a, int b, int c) {

        return a + b +c ;
    }

    public static void main (String[] args){
        Calculator hesapMakinesi = new Calculator();

        int sonuc = hesapMakinesi.add(9,18);
        int sonuc1 = hesapMakinesi.add(6,2,8);

        System.out.println("2 sayının toplamı" + sonuc);
        System.out.println("3 sayının toplamı" + sonuc1);

    }

}
