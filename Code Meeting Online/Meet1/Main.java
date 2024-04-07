package Meet1;

public class Main {

    public static void main(String[] args){
        // Deklarasi Variabel integer
        int x = 2;
        int y = 3;

        System.out.println(x+" "+y);
        System.out.println("Hasil Penjumlahan : "+ (x+y) );
        System.out.println("Hasil Pengurangan : "+ (x-y));
        System.out.println("Hasil Perkalian : "+ (x*y));
        System.out.println("Hasil Pembagian : "+ (x/y));
        System.out.println("Sisa Pembagian : "+ (x%y));

        System.out.println();

        // Deklarasi variabel boolean dan prosesnya
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b1+" "+b2);

        boolean b3 = x > y;// 2>3
        System.out.println(b3);

        boolean b4 = !b2;
        System.out.println(b4);

        System.out.println();


        // Inkremental
        int c = 4;
        int d = 5;
        c += d; // c =+ d -> tidak menimbulkan operasi gabungan, kayak dianggap c = +d
        System.out.println(c+" "+d);

    }

}
