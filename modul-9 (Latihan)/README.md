
**Array 2D (Larik Dua Dimensi)**

1. **Operasi Matriks:**
   - Buatlah program yang dapat menjumlahkan, mengurangkan, dan mengalikan dua matriks. Pastikan dimensi matriks sesuai untuk operasi tersebut.
   - Tampilkan matriks hasil operasi dengan format yang rapi.

2. **Pencarian Elemen:**
   - Buatlah program yang mencari sebuah elemen dalam larik dua dimensi. Jika ditemukan, tampilkan indeks baris dan kolomnya.
   - Jika tidak ditemukan, tampilkan pesan "Elemen tidak ditemukan".

3. **Transpose Matriks:**
   - Buatlah program yang dapat mentranspose sebuah matriks (membalik baris menjadi kolom dan sebaliknya).

Baik, berikut adalah soal-soal lain untuk OOP, Exception Handling, dan Rekursif:

**Object Oriented Programming (OOP)**

1. **Abstraksi:**
   - Buatlah kelas abstrak `BangunDatar` dengan method abstrak `hitungLuas()` dan `hitungKeliling()`.
   - Buatlah kelas turunan seperti `Persegi`, `Lingkaran`, dan `Segitiga` yang mengimplementasikan method-method tersebut.
   - Buatlah objek dari masing-masing kelas turunan dan hitung luas serta kelilingnya.

2. **Komposisi (Aggregation):**
   - Buatlah kelas `Mobil` dengan atribut `Mesin`, `Roda`, dan `Body`.
   - Kelas `Mesin`, `Roda`, dan `Body` adalah kelas-kelas terpisah yang memiliki atribut dan method sendiri.
   - Buatlah objek `Mobil` dan atur atribut-atributnya dengan objek dari kelas `Mesin`, `Roda`, dan `Body`.

**Exception Handling (Penanganan Eksepsi)**

1. **FileNotFoundException:**
   - Buatlah program yang membaca data dari sebuah file.
   - Tangani eksepsi `FileNotFoundException` jika file tidak ditemukan. Tampilkan pesan kesalahan yang sesuai.

2. **InputMismatchException:**
   - Buatlah program yang meminta pengguna memasukkan angka.
   - Gunakan `Scanner` untuk membaca input.
   - Tangani eksepsi `InputMismatchException` jika input bukan angka. Minta pengguna memasukkan ulang input yang valid.

3. **Custom Exception:**
   - Buatlah kelas eksepsi sendiri, misalnya `SaldoTidakCukupException`.
   - Gunakan eksepsi ini dalam program yang berhubungan dengan transaksi keuangan (misalnya, penarikan uang dari ATM).
   - Tangani eksepsi ini dan tampilkan pesan kesalahan yang sesuai.

**Rekursif**

1. **Menara Hanoi:**
   - Buatlah fungsi rekursif untuk menyelesaikan masalah Menara Hanoi dengan n cakram.
   - Fungsi ini harus menampilkan langkah-langkah pemindahan cakram dari satu tiang ke tiang lain.

2. **Palindrom:**
   - Buatlah fungsi rekursif untuk memeriksa apakah sebuah string merupakan palindrom (dibaca sama dari depan dan belakang).

3. **Permutasi:**
   - Buatlah fungsi rekursif untuk menghasilkan semua permutasi dari sebuah string.

<!-- 

Baik, berikut adalah jawaban dari soal-soal OOP, Exception Handling, dan Rekursif yang telah diberikan sebelumnya, beserta penjelasannya:

**Object Oriented Programming (OOP)**

1. **Abstraksi:**

```java
// Kelas abstrak BangunDatar
abstract class BangunDatar {
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}

// Kelas turunan Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Kelas turunan Lingkaran
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas turunan Segitiga
class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

// Contoh penggunaan
public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(3);
        Segitiga segitiga = new Segitiga(4, 3);

        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}
```

**Penjelasan:**
- Kelas `BangunDatar` adalah kelas abstrak yang mendefinisikan blueprint untuk kelas-kelas bangun datar lainnya.
- Kelas `Persegi`, `Lingkaran`, dan `Segitiga` adalah kelas turunan yang mengimplementasikan method `hitungLuas()` dan `hitungKeliling()` sesuai dengan rumus masing-masing bangun datar.

2. **Komposisi (Aggregation):**

```java
// Kelas Mesin
class Mesin {
    private String jenisMesin;

    public Mesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }
}

// Kelas Roda
class Roda {
    private int jumlahRoda;

    public Roda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }
}

// Kelas Body
class Body {
    private String jenisBody;

    public Body(String jenisBody) {
        this.jenisBody = jenisBody;
    }

    public String getJenisBody() {
        return jenisBody;
    }
}

// Kelas Mobil
class Mobil {
    private Mesin mesin;
    private Roda roda;
    private Body body;

    public Mobil(Mesin mesin, Roda roda, Body body) {
        this.mesin = mesin;
        this.roda = roda;
        this.body = body;
    }

    public void infoMobil() {
        System.out.println("Jenis Mesin: " + mesin.getJenisMesin());
        System.out.println("Jumlah Roda: " + roda.getJumlahRoda());
        System.out.println("Jenis Body: " + body.getJenisBody());
    }
}

// Contoh penggunaan
public class Main {
    public static void main(String[] args) {
        Mesin mesin = new Mesin("Bensin");
        Roda roda = new Roda(4);
        Body body = new Body("Sedan");
        Mobil mobil = new Mobil(mesin, roda, body);
        mobil.infoMobil();
    }
}
```
**Penjelasan:**
- Kelas `Mobil` memiliki atribut `mesin`, `roda`, dan `body` yang merupakan objek dari kelas `Mesin`, `Roda`, dan `Body` masing-masing.
- Ini menunjukkan hubungan komposisi, di mana objek `Mobil` terdiri dari objek-objek lain.


**Exception Handling (Penanganan Eksepsi)**

1. **FileNotFoundException:**

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
```
**Penjelasan:**
- Kode ini mencoba membaca data dari file "data.txt".
- Jika file tidak ditemukan, eksepsi `FileNotFoundException` akan ditangkap dan pesan kesalahan yang sesuai akan ditampilkan.

2. **InputMismatchException:**

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = 0;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Masukkan angka: ");
                angka = scanner.nextInt();
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.next(); // Membersihkan buffer input
            }
        }

        System.out.println("Angka yang dimasukkan: " + angka);
    }
}
```
**Penjelasan:**
- Kode ini meminta pengguna memasukkan angka.
- Jika input bukan angka, eksepsi `InputMismatchException` akan ditangkap, pesan kesalahan ditampilkan, dan pengguna diminta memasukkan ulang input.

3. **Custom Exception:**
```java
// Custom Exception
class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String message) {
        super(message);
    }
}

// Contoh penggunaan
public class Main {
    public static void main(String[] args) {
        double saldo = 50000;
        double jumlahPenarikan = 60000;

        try {
            if (jumlahPenarikan > saldo) {
                throw new SaldoTidakCukupException("Saldo tidak mencukupi.");
            }
            saldo -= jumlahPenarikan;
            System.out.println("Penarikan berhasil. Saldo sekarang: " + saldo);
        } catch (SaldoTidakCukupException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
**Penjelasan:**
- Kelas `SaldoTidakCukupException` dibuat sebagai custom exception.
- Dalam contoh penggunaan, eksepsi ini dilemparkan jika jumlah penarikan melebihi saldo.

**Rekursif**

1. **Menara Hanoi:**

```java
public class Main {
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Pindahkan cakram 1 dari tiang " +  from_rod + " ke tiang " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Pindahkan cakram " + n + " dari tiang
        Baik, berikut adalah jawaban dari soal-soal OOP, Exception Handling, dan Rekursif yang telah diberikan sebelumnya, beserta penjelasannya:

**Object Oriented Programming (OOP)**

1. **Abstraksi:**

```java
// Kelas abstrak BangunDatar
abstract class BangunDatar {
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}

// Kelas turunan Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Kelas turunan Lingkaran
class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas turunan Segitiga
class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}

// Contoh penggunaan
public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(3);
        Segitiga segitiga = new Segitiga(4, 3);

        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}
```

**Penjelasan:**
- Kelas `BangunDatar` adalah kelas abstrak yang mendefinisikan blueprint untuk kelas-kelas bangun datar lainnya.
- Kelas `Persegi`, `Lingkaran`, dan `Segitiga` adalah kelas turunan yang mengimplementasikan method `hitungLuas()` dan `hitungKeliling()` sesuai dengan rumus masing-masing bangun datar.

2. **Komposisi (Aggregation):**

```java
// Kelas Mesin
class Mesin {
    private String jenisMesin;

    public Mesin(String jenisMesin) {
        this.jenisMesin = jenisMesin;
    }

    public String getJenisMesin() {
        return jenisMesin;
    }
}

// Kelas Roda
class Roda {
    private int jumlahRoda;

    public Roda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }
}

// Kelas Body
class Body {
    private String jenisBody;

    public Body(String jenisBody) {
        this.jenisBody = jenisBody;
    }

    public String getJenisBody() {
        return jenisBody;
    }
}

// Kelas Mobil
class Mobil {
    private Mesin mesin;
    private Roda roda;
    private Body body;

    public Mobil(Mesin mesin, Roda roda, Body body) {
        this.mesin = mesin;
        this.roda = roda;
        this.body = body;
    }

    public void infoMobil() {
        System.out.println("Jenis Mesin: " + mesin.getJenisMesin());
        System.out.println("Jumlah Roda: " + roda.getJumlahRoda());
        System.out.println("Jenis Body: " + body.getJenisBody());
    }
}

// Contoh penggunaan
public class Main {
    public static void main(String[] args) {
        Mesin mesin = new Mesin("Bensin");
        Roda roda = new Roda(4);
        Body body = new Body("Sedan");
        Mobil mobil = new Mobil(mesin, roda, body);
        mobil.infoMobil();
    }
}
```
**Penjelasan:**
- Kelas `Mobil` memiliki atribut `mesin`, `roda`, dan `body` yang merupakan objek dari kelas `Mesin`, `Roda`, dan `Body` masing-masing.
- Ini menunjukkan hubungan komposisi, di mana objek `Mobil` terdiri dari objek-objek lain.


**Exception Handling (Penanganan Eksepsi)**

1. **FileNotFoundException:**

```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
```
**Penjelasan:**
- Kode ini mencoba membaca data dari file "data.txt".
- Jika file tidak ditemukan, eksepsi `FileNotFoundException` akan ditangkap dan pesan kesalahan yang sesuai akan ditampilkan.

2. **InputMismatchException:**

```java
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = 0;
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.print("Masukkan angka: ");
                angka = scanner.nextInt();
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.next(); // Membersihkan buffer input
            }
        }

        System.out.println("Angka yang dimasukkan: " + angka);
    }
}
```
**Penjelasan:**
- Kode ini meminta pengguna memasukkan angka.
- Jika input bukan angka, eksepsi `InputMismatchException` akan ditangkap, pesan kesalahan ditampilkan, dan pengguna diminta memasukkan ulang input.

3. **Custom Exception:**
```java
// Custom Exception
class SaldoTidakCukupException extends Exception {
    public SaldoTidakCukupException(String message) {
        super(message);
    }
}

// Contoh penggunaan
public class Main {
    public static void main(String[] args) {
        double saldo = 50000;
        double jumlahPenarikan = 60000;

        try {
            if (jumlahPenarikan > saldo) {
                throw new SaldoTidakCukupException("Saldo tidak mencukupi.");
            }
            saldo -= jumlahPenarikan;
            System.out.println("Penarikan berhasil. Saldo sekarang: " + saldo);
        } catch (SaldoTidakCukupException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
**Penjelasan:**
- Kelas `SaldoTidakCukupException` dibuat sebagai custom exception.
- Dalam contoh penggunaan, eksepsi ini dilemparkan jika jumlah penarikan melebihi saldo. -->

<!-- **Rekursif**

1. **Menara Hanoi:**

```java
public class Main {
    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Pindahkan cakram 1 dari tiang " +  from_rod + " ke tiang " + to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Pindahkan cakram " + n + " dari tiang
        " +  from_rod + " ke tiang " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

    public static void main(String args[]) {
        int n = 3; // Jumlah cakram
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B, dan C adalah nama tiang
    }
}
```

**Penjelasan:**
- Fungsi `towerOfHanoi` secara rekursif memindahkan cakram dari tiang awal (`from_rod`) ke tiang tujuan (`to_rod`) menggunakan tiang bantu (`aux_rod`).
- Kasus dasar adalah ketika hanya ada satu cakram, yang langsung dipindahkan.
- Untuk lebih dari satu cakram, fungsi ini akan:
    1. Memindahkan n-1 cakram dari tiang awal ke tiang bantu.
    2. Memindahkan cakram terbesar dari tiang awal ke tiang tujuan.
    3. Memindahkan n-1 cakram dari tiang bantu ke tiang tujuan.

2. **Palindrom:**

```java
public class Main {
    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1)
            return true; 
        if (str.charAt(0) == str.charAt(str.length() - 1))
            return isPalindrome(str.substring(1, str.length() - 1));
        return false;
    }

    public static void main(String[] args) {
        String str = "racecar";
        if (isPalindrome(str))
            System.out.println(str + " adalah palindrom.");
        else
            System.out.println(str + " bukan palindrom.");
    }
}
```

**Penjelasan:**
- Fungsi `isPalindrome` memeriksa apakah string `str` merupakan palindrom.
- Kasus dasar adalah jika string kosong atau hanya memiliki satu karakter, maka dianggap palindrom.
- Jika karakter pertama dan terakhir sama, fungsi akan memeriksa substring yang tersisa secara rekursif.
- Jika karakter pertama dan terakhir tidak sama, maka string bukan palindrom.

3. **Permutasi:**

```java
public class Main {
    public static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i); // Kembalikan ke kondisi semula
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
    }
}
```

**Penjelasan:**
- Fungsi `permute` menghasilkan semua permutasi dari string `str`.
- Parameter `l` dan `r` menandai indeks awal dan akhir substring yang sedang diproses.
- Pada setiap tingkat rekursi, fungsi ini akan:
    1. Mengambil satu karakter pada indeks `l`.
    2. Menukar karakter tersebut dengan setiap karakter dari indeks `l` hingga `r`.
    3. Memanggil dirinya sendiri secara rekursif untuk memproses substring yang tersisa.
    4. Mengembalikan karakter yang ditukar ke posisi semula untuk mencoba permutasi lain.

Semoga penjelasan ini lebih membantu!
 -->
