package Meet5;

public class Main {
    public static void main(String[] args) {
        int angka1 = 3;
        int hasilInteger = kuadrat(angka1);
        System.out.println(hasilInteger);

        double angka = 2.5;
        double hasilKuadrat = kuadratDesimal(angka);
        System.out.println(hasilKuadrat);

        cetak("Hello World");

        sayHello();
    }

    // contoh fungsi non-void dengan tipe data integer
    public static int kuadrat(int a){
        int hasil = a * a;
        return hasil;
    }

    // contoh fungsi non-void dengan tipe data double
    public static double kuadratDesimal(double a){
        double hasil = a * a;
        return hasil;
    }

    // contoh fungsi void
    public static void cetak(String kalimat){
        System.out.println(kalimat);
    }

    public static void sayHello(){
        System.out.println("Heloo");
    }

}
