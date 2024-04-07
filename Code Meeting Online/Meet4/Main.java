package Meet4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //perulangan while
        int a = 10;
        while (a < 10) {
            System.out.println("Hello World! ke-"+a);
            a++;
        }
        System.out.println("\n================================\n");
        a = 10;

        //perulangan do while
        do {
            System.out.println("Hello World! ke-"+a);
            a++;
        } while(a<10);

        Scanner s = new Scanner(System.in);
        int num = 0;

        do
        {
            System.out.println("Num sekarang adalah "+num);
            System.out.println("Masukkan bilangan integer positif (-1 untuk keluar ): ");
            num = s.nextInt();
        } while (num != -1);


        // perulangan for
        // format dari perulangan for
          // init; condition; perubahan init
        for (int i = 0; i < 10  ; i++) {
            System.out.println("Hello World! ke-" + i);
        }
        System.out.println("\n================================\n");

        // dapat deklarasi init di luar
        int b;
        for( b = 0; b < 10; b++ ){
            System.out.println("Hello world! ke-" + b);
        }
        System.out.println("\n================================\n");

        // perubahan init bisa di luar, selama masih di dalam {}
        for( b = 0; b < 10;){
            b++;
            System.out.println("Hello world! ke-" + b);
        }
        System.out.println("\n================================\n");

        // init dan perubahan bisa sama-sama di luar
        b = 0;
        for( ; b < 10;){
            System.out.println("Hello world! ke-" + b);
            b++;
        }


        // perulangan bersarang
        for (int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                for(int k = 0; k < 5; k++){
                    System.out.println("Nilai i j k sekarang : " + i +" "+ j+" "+k);
                }
            }
            System.out.print("\n");
        }

        // control break
        for (int i = 0 ; i < 10; i++){
            //   Jika i adalah 4, maka keluar dari perulangan
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n================================\n");

        //control continue
        for (int i = 0 ; i < 10; i++){
            //   Jika i adalah 4, maka keluar dari perulangan
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n================================\n");
        for (int i = 0 ; i < 10; i++){
            //   Jika i adalah 4, maka keluar dari perulangan
            if (i > 5 && i < 9) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n================================\n");
        for (int i = 0 ; i < 10; i += 2){
            System.out.println(i);
        }

        // infinite looping
//        for (int i = 0 ; i > 10; i--){
//            System.out.println("Nilai i sekarang : "+i);
//        }
    }
}
