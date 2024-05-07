## Daftar Isi

- [Input](#input)
  - [Pengenalan Scanner](#pengenalan-scanner)
  - [Input Melalui Console](#input-melalui-console)
  - [Input Melalui File](#input-melalui-file)
- [String](#string)
- [Soal Latihan](#soal-latihan)
  - [Latihan 1](#soal-1)
  - [Latihan 2](#soal-2)
  - [Latihan 3](#soal-3)

# Input

## Pengenalan Scanner

**Scanner** adalah kelas dalam paket `java.util` yang menyediakan metode untuk membaca input dari berbagai sumber, seperti keyboard atau file. Untuk menggunakan Scanner, kita perlu mengimpor paket tersebut.

```java
import java.util.Scanner;
```

Berikut adalah beberapa metode yang sering digunakan dalam kelas `Scanner` pada Java untuk membaca input:

### 1. `next()`

Metode `next()` digunakan untuk membaca dan mengembalikan token berikutnya (hingga spasi) sebagai string. Metode ini berguna untuk membaca kata atau string yang tidak mengandung spasi.

Contoh:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan kata: ");
String kata = scanner.next();
System.out.println("Kata yang dimasukkan: " + kata);
```

### 2. `nextInt()`, `nextLong()`, `nextShort()`

Metode-metode ini digunakan untuk membaca dan mengembalikan nilai bertipe int, long, atau short dari input.

Contoh:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan angka: ");
int angka = scanner.nextInt();
System.out.println("Angka yang dimasukkan: " + angka);
```

### 3. `nextDouble()`, `nextFloat()`

Metode-metode ini digunakan untuk membaca dan mengembalikan nilai bertipe double atau float dari input.

Contoh:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nilai desimal: ");
double nilai = scanner.nextDouble();
System.out.println("Nilai desimal yang dimasukkan: " + nilai);
```

### 4. `nextBoolean()`

Metode `nextBoolean()` membaca dan mengembalikan nilai boolean dari input. Ini berguna untuk membaca input berupa `true` atau `false`.

Contoh:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nilai boolean (true/false): ");
boolean status = scanner.nextBoolean();
System.out.println("Status yang dimasukkan: " + status);
```

### 5. `nextLine()`

Metode `nextLine()` digunakan untuk membaca seluruh baris input, termasuk spasi, dan mengembalikan string. Digunakan ketika perlu membaca teks yang mungkin mengandung spasi.

Contoh:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan kalimat: ");
String kalimat = scanner.nextLine();
System.out.println("Kalimat yang dimasukkan: " + kalimat);
```

### 6. `hasNext()`, `hasNextInt()`, `hasNextDouble()`, dll.

Metode-metode ini digunakan untuk memeriksa apakah ada token berikutnya dalam input atau tidak. Misalnya, `hasNext()`akan mengembalikan true jika masih ada token berikutnya.

Contoh:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan angka: ");
if (scanner.hasNextInt()) {
    int angka = scanner.nextInt();
    System.out.println("Angka yang dimasukkan: " + angka);
} else {
    System.out.println("Input bukan angka.");
}
```

## Input Melalui Console

Untuk membaca sebuah inputan melalui console, scanner perlu diinisialisasi.

```java
Scanner scanner = new Scanner(System.in);
```

Contoh:

```java
import java.util.Scanner;

public class InputConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        System.out.println("Angka yang dimasukkan: " + angka);

        System.out.print("Masukkan sebuah teks: ");
        String teks = scanner.next();
        System.out.println("Teks yang dimasukkan: " + teks);

        scanner.close();
    }
}
```

## Input Melalui File

Untuk membaca input dari file, kita harus menginisialisasi scanner sebagai berikut.

```java
Scanner scanner = new Scanner({nama_class}.class.getResourceAsStream({input_path}))
```

Contoh:

```java
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(Main.class.getResourceAsStream("input.txt"));
    String input = scanner.nextLine();
    System.out.println(input);
  }
}
```
[< Kembali ke Daftar Isi](#daftar-isi)

# String

Berikut adalah penjelasan singkat mengenai beberapa method yang umum digunakan pada kelas `String` di Java:

### 1. `charAt(int index)`

Metode ini mengembalikan karakter pada posisi tertentu dalam string.

```java
String kata = "Hello";
char karakter = kata.charAt(2); // karakter = 'l'
```

### 2. `contains(CharSequence s)`

Metode ini mengembalikan nilai boolean yang menunjukkan apakah string mengandung urutan karakter tertentu atau tidak.

```java
String kalimat = "Java is fun";
boolean hasil = kalimat.contains("fun"); // hasil = true
```

### 3. `equals(Object anObject)`

Metode ini membandingkan dua string untuk kesamaan.

```java
String str1 = "Hello";
String str2 = "World";
boolean hasil = str1.equals(str2); // hasil = false
```

### 4. `equalsIgnoreCase(String anotherString)`

Metode ini membandingkan dua string secara kesamaan tanpa memperhatikan perbedaan huruf besar atau kecil.

```java
String str1 = "hello";
String str2 = "HELLO";
boolean hasil = str1.equalsIgnoreCase(str2); // hasil = true
```

### 5. `indexOf(int ch)`

Metode ini mengembalikan indeks dari karakter pertama yang ditemukan dalam string.

```java
String kata = "Hello";
int indeks = kata.indexOf('e'); // indeks = 1
```

### 6. `indexOf(String str)`

Metode ini mengembalikan indeks dari substring pertama yang ditemukan dalam string.

```java
String kalimat = "Java programming";
int indeks = kalimat.indexOf("gram"); // indeks = 9
```

### 7. `length()`

Metode ini mengembalikan panjang (jumlah karakter) dari string.

```java
String kata = "Hello";
int panjang = kata.length(); // panjang = 5
```

### 8. `replace(String string1, String string2)`

Metode ini menggantikan semua kemunculan suatu karakter atau substring dengan karakter atau substring lainnya dalam string.

```java
String kalimat = "Java is fun";
String hasil = kalimat.replace("fun", "awesome"); // hasil = "Java is awesome"
```

### 9. `split`

Metode ini memecah string menjadi array substring berdasarkan suatu delimiter.

```java
String kalimat = "Java programming is fun";
String[] kata = kalimat.split(" "); // kata = ["Java", "programming", "is", "fun"]
```

### 10. `startsWith(String prefix)`

Metode ini mengembalikan nilai boolean yang menunjukkan apakah string dimulai dengan substring tertentu.

```java
String kata = "Hello";
boolean hasil = kata.startsWith("He"); // hasil = true
```

### 11. `toLowerCase()`

Metode ini mengembalikan string dengan semua karakter diubah menjadi huruf kecil.

```java
String kata = "Hello";
String hasil = kata.toLowerCase(); // hasil = "hello"
```

### 12. `toUpperCase()`

Metode ini mengembalikan string dengan semua karakter diubah menjadi huruf besar.

```java
String kata = "Hello";
String hasil = kata.toUpperCase(); // hasil = "HELLO"
```

### 13. `trim()`

Metode ini menghapus spasi di awal dan akhir string.

```java
String kalimat = "   Hello   ";
String hasil = kalimat.trim(); // hasil = "Hello"
```

### 14. `substring(int start, int end)`

Metode ini mengembalikan substring dari string berdasarkan indeks awal dan akhir.

```java
String kata = "Hello";
String hasil = kata.substring(1, 4); // hasil = "ell"
```

Ini adalah beberapa method umum yang sering digunakan pada kelas `String` dalam Java. Setiap metode memiliki fungsionalitasnya sendiri dan dapat membantu dalam memanipulasi atau memeriksa string.

[< Kembali ke Daftar Isi](#daftar-isi)

# Soal Latihan

## Soal 1

Buat program yang menerima input nama lengkap dari pengguna dan memisahkan nama depan dan belakang. Tampilkan kedua nama tersebut.

**Sample Input 1**

```
Bryan Kurniawan
```

**Sample Output 1**

```
Nama Depan: Bryan
Nama Belakan : Kurniawan
```

## Soal 2

Buat program yang menerima input sebuah kata dari pengguna dan menghitung jumlah karakter dalam kata tersebut. Tampilkan jumlah karakter.

**Sample Input 2**

```
Hallo
```

**Sample Output 2**

```
5
```
