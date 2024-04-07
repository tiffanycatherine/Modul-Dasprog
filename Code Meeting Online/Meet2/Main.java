package Meet2;

//untuk melakukan input, harus melakukan import library Scanner terlebih dahulu
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //Deklarasi scanner untuk input melalui console
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan nilai str");
        String str = s.next();
        System.out.println("Nilai str = "+str);

        System.out.println("=============================");

        //Deklarasi scanner untuk input melalui file
        Scanner sc = new Scanner(Main.class.getResourceAsStream("input"));
        String str1 = sc.nextLine();
        System.out.println(str1);

        System.out.println("=============================");

        //String manipulation charAt
        String str2 = "Hello";
        char c1 = str2.charAt(4);
        System.out.println(""+str2.charAt(0)+str2.charAt(1)+str2.charAt(2)+str2.charAt(3)+str2.charAt(4));

        System.out.println("=============================");

        //String manipulation contains
        String str3 = "Haloo";
        boolean b1 = str3.contains("Loo");
        System.out.println(b1);

        System.out.println("=============================");

        //String manipulation equals
        String str4 = "Laptop";
        String str5 = "Laptop";
        boolean eqStr = str4.equals(str5); // melihat kesamaan str4 dan str5, huruf kapital diperhitungkan
        boolean eqStrIC = str4.equalsIgnoreCase(str5); // melihat kesamaan str4 dan str5, huruf kapital tidak diperhitungkan

        System.out.println(eqStr);
        System.out.println(eqStrIC);

        System.out.println("=============================");

        //String manipulation indexOf
        String str6 = "Mouse saya rusak";
        int indexChar = str6.indexOf("s");
        System.out.println(indexChar);

        indexChar = str6.indexOf("saya");
        System.out.println(indexChar);
        indexChar = str6.indexOf("laptop");
        System.out.println(indexChar);

        //String manipulation length
        int lengthStr = str6.length();
        System.out.println(lengthStr);

        System.out.println("=============================");

        //String manipulation replace
        String str7 = str6.replace("rusak","bagus");
        System.out.println(str7);
        str7 = str7.replace("kamu","kita");
        System.out.println(str7);
        str7 = str7.replace("sa","l");
        System.out.println(str7);

        System.out.println("=============================");

        //String manipulation toLowerCase dan toUpperCase
        String str8 = "Hello";
        String str9 = str8.toLowerCase(); // hasil = "hello"
        System.out.println(str9);
        str9 = str8.toUpperCase(); // hasil = "hello"
        System.out.println(str9);

        System.out.println("=============================");

        //String manipulation substring
        str8 = "Mouse saya kurang bagus";
        str8 = str8.substring(2,4);
        System.out.println(str8);
        str8 = "Mouse saya kurang bagus";
        str8 = str8.substring(2);
        System.out.println(str8);

        System.out.println("=============================");
        System.out.println("SOAL 1");
        String input = s.nextLine();
        String[] inputSplit = input.split(" ");
        System.out.println("Nama Depan: "+inputSplit[0]);
        System.out.println("Nama Belakang: "+inputSplit[inputSplit.length - 1]);
    }

}
