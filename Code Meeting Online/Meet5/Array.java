package Meet5;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        // inisialisasi array dengan langsung membuat nilai-nilainya
        int[] arrayAngka = {1,2,3,4,5,6,7,8};

        // inisialisasi array dengan mendefinisikan ukurannya terlebih dahulu
        int[] arrayAngkaSize = new int[5];

        // print array secara langsung hanya mengeluarkan alamat dari array tersebut
        System.out.println(arrayAngka);

        // print array menggunakan looping
        for (int i = 0; i < arrayAngka.length ; i++)
        {
            System.out.println("index ke "+i+" dari arrayAngka = "+arrayAngka[i]);
        }

        System.out.println();

        //memodifikasi nilai array berdasarkan indexnya
        arrayAngkaSize[0] = 3;
        arrayAngkaSize[1] = 8;
        arrayAngkaSize[2] = arrayAngkaSize[1] + arrayAngkaSize[0];
        for (int i = 0 ; i < 5; i++){
            System.out.println("index ke "+i+" dari arrayAngkaSize = "+arrayAngkaSize[i]);
        }
        System.out.println("\n==================================\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan ukuran dari array");
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i = 0; i < a.length; i++) {
            System.out.println("Masukkan nilai ke-"+(i+1));
            a[i] = sc.nextInt(); //Input array
        }

        for(int i = 0; i < a.length; i++) {
            System.out.println("Array Index ke-" + i +" adalah "+ a[i]); // Output array
        }

        System.out.println("\nLatihan Soal 1\n");
        int inputSize = sc.nextInt();
        int[] urutan = new int[inputSize];
        for (int i = 0; i < urutan.length;i++){
            urutan[i] = i+1;
        }
        for (int i = 0; i < urutan.length; i++){
            if( urutan[i] % 2 == 0){
                System.out.print("* ");
            } else {
                System.out.print(urutan[i]+" ");
            }
        }


    }
}
