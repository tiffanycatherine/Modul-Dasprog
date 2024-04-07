package Meet3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int daya = 0;
        Scanner sc = new Scanner(System.in);
        daya = 4;

        // if dan else
        if (daya < 10) //jika daya listrik kurang dari 10 kWh
        {
            // Apa yang perlu dilakukan ketika kondisi terpenuhi?
            System.out.print("Alarm peringatan menyala!\n");
        } else {
            System.out.println("Daya Listrik Aman");
        }

        // penggunaan else if
        int angka = 5;
        if(angka > 0){
            System.out.println("Angka Positif");
        } else if(angka < 0 ){
            System.out.println("Angka Negatif");
        } else {
            System.out.println("Angka Nol");
        }

        // if bersarang
        int angka1 = 8;
        if(angka1 > 0){
            System.out.println("Angka Positif");
            if(angka1 % 2 == 0){
                System.out.println("Angka Genap");
            } else {
                System.out.println("Angka Ganjil");
            }
        }

        int angka2 = 4;
        if(angka2 > 2){
            angka2 += 5;
            if(angka2 < 0){
                angka2 -= 4;
            } else {
                angka2 += 9;
            }
        } else {
            angka2 += 8;
        }
        System.out.println("Angka2 sekarang adalah = "+angka2);


        // switch case
        char platNomor = 'B';
        switch(platNomor) {
            case 'L':
                System.out.println("Surabaya");
                break;
            case 'B':
                System.out.println("Jakarta");
                break;
            case 'D':
                System.out.println("Bandung");
                break;
            case 'N':
                System.out.println("Malang/Lumajang");
                break;


            default:
                System.out.println("Karakter plat nomor tidak diketahui");
        }

        // Ternary operation
        int nilai = sc.nextInt();
        System.out.println((nilai > 50)? ( (nilai > 90)? "Nilai Memuaskan": "Nilai Cukup" ): "Tidak Lulus");

    }
}
