## Daftar Isi

- [IDE (Integrated Development Environment)](#ide)

- [Pengenalan Bahasa Java](#pengenalan-bahasa-java)

  - [Statement](#statement)
  - [Program "Hello world."](#program-hello-world)
  - [Struktur Program](#struktur-program)
  - [Komentar](#komentar)

- [Identifier](#identifier)

  - [Identifier](#identifier)
  - [Keyword](#keyword)

- [Variabel](#variabel)

  - [Pengenalan Variabel](#pengenalan-variabel)
  - [Deklarasi dan Definisi Variabel](#deklarasi-dan-definisi-variabel)
  - [Pengisian Nilai Variabel](#pengisian-nilai-variabel)
  - [Inisialisasi Variabel](#inisialisasi-variabel)

- [Tipe Data Dasar](#tipe-data-dasar)

  - [Tipe Bilangan Bulat (integer)](#tipe-bilangan-bulat-integer)
  - [Tipe Bilangan Real (floating)](#tipe-bilangan-real-floating)
  - [Tipe Data Boolean](#tipe-data-boolean)
  - [Tipe Data String](#tipe-data-string)
  - [Tipe Data Char](#tipe-data-char)

- [Operator Aritmatika](#operator-Aritmatika)

  - [Operator Assignment](#operator-assignment)
  - [Operator Aritmatika](#operator-aritmatika)
  - [Operator Increment dan Decrement](#operator-increment-dan-decrement)

- [Operator Logika](#operator-Logika)

  - [Operator Perbandingan](#operator-perbandingan)
  - [Operator Logika](#operator-logika)

* [Operator Lain](#operator-lain)
  - [Operator Gabungan](#operator-gabungan)

- [Soal Latihan](#latihan)
  - [Latihan 1](#latihan-1)
  - [Latihan 2](#latihan-2)

# IDE

## (Integrated Development Environment)

Sebelum memulai menulis kode (atau _ngoding_), kita membutuhkan IDE untuk menyederhanakan proses pengkodean. Apa itu IDE? Sederhananya, IDE atau Intregated Development Environment adalah aplikasi editor kode yang menyertakan compiler. Berikut ini adalah aplikasi IDE bahasa Java yang dapat digunakan.

- [Intellij](https://www.jetbrains.com/idea/)

# Pengenalan Bahasa Java

## Statement

Dalam suatu program, sebuah **statement** atau pernyataan adalah intruksi/perintah yang mempunyai makna tertentu sehingga menyebabkan program tersebut dapat melakukan suatu tindakan.

Analoginya, untuk berbicara kepada seseorang, kita menggunakan bahasa tertentu yang dapat dimengerti, sehingga kita dapat menyampaikan apa yang ingin disampaikan. Nah, seperti itulah statement. Apa yang kita sampaikan kepada orang lain layaknya statement pada program yang kita sampaikan kepada komputer.

## Program "Hello World"

---

Mari kita mulai dengan membuat program sederhana, yakni program untuk menampilkan kalimat **“Hello, world!”** pada layar (konsol). Berikut adalah kode program tersebut.

```java
class Main{
    public static void main(String[]args){
        System.out.println("Hello World");
    }
}
```

Salinlah kode di atas pada IDE, kemudian compile dan jalankan. Jika proses compilation berhasil, maka code akan menghasilkan output sebagai berikut.

```
Hello World!
```

## Struktur Program

---

```java
class <name> {
    public static void main(String[] <usually named args>) {
        <statement(s)>;
    }
}
```

Struktur dalam program java:

- **name**: nama dari file class yang dibikin (Biasanya menggunakan huruf besar pada awal nama).
- **statement**: perintah-perintah program yang akan dijalankan.

## Fungsi `main()`

```java
class Main{
    public static void main(String[]args){

        System.out.println("Hello World");

    }
}
```

Dalam bahasa java, fungsi `main()` adalah fungsi utama yang harus ada. Hal ini dikarenakan kode akan dimulai dari awal fungsi `main()`.

- Baris 1 menunjukkan nama kelas dari sebuah program.
- Baris 3 s.d 5 merupakan tubuh dari fungsi `main()`.

## Whitespace

Dapat diperhatikan pada kode bahwa baris 3 dan 5 kosong (tidak terdapat karakter apapun). Ini disebut dengan whitespace. Whitespace adalah area kosong pada kode, dan biasanya dtujukan agar kode mudah dibaca.

Terdapat tiga jenis whitespace, yakni space, tab, dan new line. Baris 3 dan 5 adalah contoh dari new line.

## Statement

Di dalam fungsi `main()`, terdapat dua statement yang ditunjukkan pada baris 3. Seluruh statement yang ditulis pada bahasa java harus diakhiri oleh tanda titik-koma (`;`).

## Komentar

**Komentar** (_comment_) adalah bagian dari program yang tidak akan dieksekusi. Komentar sangat berguna untuk mendeskripsikan program yang dibuat, misalnya saja untuk menjelaskan bagian dari kode agar mudah dipahami oleh programmer lainnya. Terdapat dua jenis komentar dalam bahasa Java, yaitu komentar _single-line_ dan _multi-line_.

### Komentar Single-Line

Seperti namanya, komentar _single-line_ hanya bekerja pada satu baris. Komentar _single-line_ diawali dengan simbol `//` . Semua karakter (pada satu baris) dibelakang simbol `//` akan diabaikan.

```java
// Ini adalah komentar single-line
// Fungsi untuk mencetak ke layar
System.out.println("Hello");
```

### Komentar Multi-Line

Sedangkan komentar multi-line dapat bekerja pada lebih dari satu baris. Pasangan simbol `/*` dan `*/` digunakan untuk membuat komentar _multi-line_. Semua karakter yang berada di antara dua simbol tersebut akan diabaikan.

```java
/*
Ini adalah komentar multi-line
Semua yang berada di sini akan
diabaikan
*/
```

[< Kembali ke Daftar Isi](#daftar-isi)

# Identifier dan Keyword

## Identifier

**Identifier** merujuk kepada penamaan sebuah entitas, seperti pada [variabel](#variabel), fungsi, structures dan lain-lain. Karena identifier menamai sebuah entitas, maka nama dari identifier harus unik (dua entitas tidak boleh mempunyai nama identifier yang sama).

Aturan penamaan identifier:

- Identifier bukan merupakan [keyword](#keyword).
- Identifier hanya boleh terdiri dari huruf lowercase, huruf uppercase, digit, dan simbol underscore ( \_ ).
- Identifier tidak boleh mengandung whitespace.
- Identifier harus dimulai dengan huruf atau simbol underscore. Tidak boleh dimulai dengan digit/angka.
- Bersifat case-sensitive, artinya identifier `variable` berbeda dengan `vAriaBle`.

## Keyword

**Keyword** merupakan kata khusus yang telah dipesan (reserved) pada bahasa pemograman. Kata-kata khusus tersebut mempunyai makna tersendiri bagi compiler, dan kata-kata tersebut merupakan bagian dari sintaks dan tidak dapat digunakan sebagai identifier.
Berikut adalah daftar keyword pada bahasa [Java](https://www.wildantechnoart.net/2017/11/jenis-jenis-keyword-pada-java-dan-fungsinya.html).

[< Kembali ke Daftar Isi](#daftar-isi)

# Variabel

## Pengenalan Variabel

**Variabel** adalah suatu tempat yang digunakan untuk menampung data atau nilai pada memori yang mempunyai nilai yang dapat berubah–ubah selama proses penulisan program. Dalam bahasa Java, variabel menyimpan data/nilai dengan tipe data tertentu, seperti menyimpan suatu angka yang termasuk bilangan bulat (integer) atau menyimpan suatu kata yang termasuk string.

Variabel dapat dianalogikan sebagai sebuah gelas. Gelas dalam hal ini disebut sebagai **variabel**. Pada umumnya, gelas digunakan untuk menampung cairan. Dalam hal ini cairan adalah **tipe datanya**. Kemudian, contoh dari cairan adalah air, yakni dalam hal ini **data** yang akan disimpan oleh gelas.

Pada dasarnya program bekerja dengan mengolah data-data. Data-data inilah yang kemudian disimpan pada variabel.

## Deklarasi Variabel

Pada bahasa Java, variabel harus dideklarasikan terlebih dahulu sebelum bisa digunakan. Seperti halnya gelas tadi, gelas tersebut harus ada terlebih dahulu sebelum bisa digunakan.

Untuk mendeklarasikan sebuah variabel, sintaksnya adalah sebagai berikut.

```
<tipe_data> <identifier>
```

Misalkan, potongan kode berikut mendeklarasikan variabel `x` yang bertipe `int`.

```java
int x
```

Jika ingin mendeklarasikan lebih dari satu variabel dengan tipe yang sama, bisa menggunakan operator koma (`,`).

```
<tipe_data> <variabel1>, <variabel2>, ... dst;
```

```java
int x, y;
```

## Definisi Variabel (pengisian nilai pada variabel)

Setelah dideklarasikan, variabel dapat didefinisikan (diisi oleh sebuah nilai). Untuk melakukannya, gunakan operator assignment (simbol `=`).

```
identifier_variabel = <nilai yang bersesuaian>
```

Contoh:

```java
int x, y;
x = 10;
y = -2;
```

Dalam hal ini, variabel `x` dan `y` akan mempunyai nilai masing-masing `10` dan `-2`.

## Inisialisasi Variabel

Deklarasi dan definisi variabel dapat dilakukan dalam satu instruksi sekaligus. Hal ini disebut dengan **inisialisasi**. Dengan melakukan inisialisasi variabel, berarti kita memberikan nilai awal pada variabel tersebut.

```
tipe_data identifier_variabel = <nilai yang bersesuaian>;
```

Contoh:

```java
int x = 10;
```

[< Kembali ke Daftar Isi](#daftar-isi)

# Tipe Data Dasar

Secara sederhana **tipe data** adalah jenis data dan ukuran data yang akan ditampung dan oleh **variabel** (atau objek secara umum). Tipe data menentukan tipe dan jenis data seperti apa yang akan dimiliki oleh suatu variabel.

Dalam bahasa Java terdapat beberapa jenis tipe data. Di antaranya adalah tipe data dasar, tipe data turunan, dan void. Untuk kali ini kita akan berfokus pada tipe data dasar.

## Tipe Bilangan Bulat (integer)

Bilangan Bulat adalah bilangan yang tidak mempunyai nilai pecahan (real). Tipe data bilangan bulat pada bahasa Java diantaranya sebagai berikut.
![cek tabel tipe bilangan bulat](https://github.com/JagoTeknikCourse/Modul-Dasprog/blob/main/img/tipe-data-bulat.md)

Seperti namanya, tipe-tipe data di atas adalah tipe data yang digunakan untuk merepresentasikan bilangan bulat (positif dan negatif) dan bilangan 0. Misalnya, 0, -5, 12, -1, 200 dsb. **Perlu ditekankan** bahwa tipe-tipe data di atas tidak dapat digunakan untuk merepresentasikan bilangan floating-point (bilangan real).

Jika diperhatikan, terdapat dua jenis tipe data antara lain **signed** dan **unsigned**. Lalu apa perbedaan dari kedua jenis tersebut? Perbedaannya adalah terletak pada kemampuan untuk menampung bilangan negatif. **signed** dapat menampung bilangan negatif, sedangkan **unsigned** tidak.

Contoh:
```java
int nilai = 2;
```

## Tipe Bilangan Real (floating)

Bilangan Real atau floating-point adalah bilangan yang mempunyai nilai pecahan (real). Tipe data bilangan real pada bahasa Java di antaranya adalah sebagai berikut.
![cek tabel tipe bilangan real (floating)](https://github.com/JagoTeknikCourse/Modul-Dasprog/blob/main/img/tipe-data-real.md)

Tipe data di atas digunakan untuk menyimpan data berupa bilangan real (floating-point)/bilangan berkoma. Misalnya, `2.35, -12.246, 0.005` dsb.

Contoh:
```java
float nilai1 = 2.47;
double nilai2 = 2.22;
```

## Tipe Data Boolean

Tipe Data Boolean
Tipe data boolean digunakan untuk menyimpan nilai kebenaran, yaitu `true` atau `false`. Tipe data ini sering digunakan dalam struktur pengkondisian dan pengulangan.

Contoh:
```java
boolean benar = true;
boolean salah = false;
```

## Tipe Data String
Tipe data string digunakan untuk menyimpan urutan karakter. Dalam Java, string didefinisikan sebagai kelas, namun ada juga cara mudah untuk membuat string tanpa harus menggunakan operator `new`.

Contoh:
```java
String kata1 = "Halo, ";
String kata2 = "Java!";
```

## Tipe Data Char
Tipe data char digunakan untuk menyimpan satu karakter. Dalam Java, karakter diapit oleh tanda kutip tunggal (`'`).

Contoh:
```java
char karakter = 'A';
```
[< Kembali ke Daftar Isi](#daftar-isi)
# Operator Aritmatika

## Operator Assignment

**Operator Assignment** digunakan untuk mengisikan (assign) sebuah nilai ke variabel. Simbol yang biasa digunakan adalah tanda sama dengan `=`. Contohnya:

```java
int x, y;
x = 4;
y = 3;
x = x + y; // x = 7
y = x + x; // y = 14
```

## Operator Aritmatika

Seperti namanya, **operator aritmatika** melakukan operasi layaknya pada matematika seperti penjumlahan, pengurangan, pembagian dsb. Beberapa operator menggunakan simbol yang sama pada matematika (penjumlahan dengan simbol `‘+’`, pengurangan dengan `‘-‘`, dst.). Operator-operator aritmatika pada bahasa Java adalah sebagai berikut.

| Simbol | Operasi                                               | Contoh  |
| :----: | ----------------------------------------------------- | :-----: |
|   +    | Penjumlahan pada dua operan                           | `a + b` |
|   -    | Pengurangan pada dua operan                           | `a - b` |
|   \*   | Perkalian pada dua operan                             | `a * b` |
|   /    | Pembagian pada dua operan                             | `a / b` |
|   %    | Menghitung sisa pembagian dua operan (operasi modulo) | `a % b` |

## Operator Increment dan Decrement

Operator `++` disebut dengan operator **increment**, sedangkan operator `--` merupakan operator **decrement**. Kedua operator ini digunakan untuk menambah (increment)/mengurangi (decrement) nilai dari suatu variabel sebanyak satu.

Terdapat dua cara untuk menggunakan operator ini.

- **Prefix** - yakni dengan meletakkan operator increment/decrement didepan nama variabel.

  ```java
  int a, b;
  a = 5;
  ++a; // Nilai a sekarang adalah 6
  --a; // Nilai a sekarang adalah 5
  ```

  Cara kerja dari operator increment/decrement prefix adalah dengan menambahkan/mengurangi nilai variabel sebanyak satu terlebih dahulu, sebelum operan tersebut digunakan pada operasi lainnya pada sekuens intstruksi yang sama. Untuk lebih jelasnya, perhatikan potongan kode berikut

  ```java
  int a, b;
  a = 5;
  b = ++a; // Nilai b sekarang adalah 6
  a = --b; // Nilai a sekarang adalah 5
  ```

  Di sini, saat instruksi `b = ++a;` dieksekusi, yang terjadi pertama kali adalah nilai dari `a` ditambahkan satu terlebih dahulu, kemudian baru di-assign nilainya ke variabel `b`.

- **Postfix** - yakni dengan meletakkan operator increment/decrement di belakang nama variabel. Cara kerja dari operator increment/decrement postfix berbeda dari prefix. Pada postfix, nilai variabel akan ditambah satu setelah operan digunakan pada operasi lainnya pada sekuens instruksi yang sama. Perhatikan potongan kode berikut.

  ```java
  int a, b;
  a = 5;
  b = a++; // Nilai b sekarang adalah 5
  a = b--; // Nilai a sekarang adalah 5
  ```

  Di sini, saat instruksi `b = a++;` dieksekusi, yang terjadi pertama kali adalah nilai dari `a` akan di-assign terlebih dahulu ke variabel `b`, kemudian baru ditambahkan satu. Karena itulah variabel `b` mendapat nilai dari `a` sebelum terjadi penambahan.
  [< Kembali ke Daftar Isi](#daftar-isi)

# Operator Logika

## Operator Perbandingan

**Operator Perbandingan** digunakan untuk memeriksa relasi dan membandingkan nilai dari dua operan. Jika benar akan menghasilkan nilai **TRUE** (direpresentasikan angka 1), jika salah maka akan menghasilkan nilai **FALSE** (direpresentasikan angka 0).

Berikut adalah operator relasional dalam bahasa C.

| Operator                | Simbol | Keterangan                                                                                            | Contoh                                           |
| ----------------------- | :----: | ----------------------------------------------------------------------------------------------------- | ------------------------------------------------ |
| Sama dengan             |   ==   | Digunakan untuk memeriksa apakah kedua operan memiliki nilai yang sama.                               | 5 == 2 (FALSE)<br>5 == 5 (TRUE)                  |
| Tidak Sama dengan       |   !=   | Digunakan untuk memeriksa apakah kedua operan memiliki nilai yang tidak sama.                         | 5 != 2 (TRUE)<br>5 != 5 (FALSE)                  |
| Lebih besar             |   >    | Digunakan untuk membandingkan apakah operan pertama lebih besar nilainya dari operan kedua.           | 5 > 2 (TRUE)<br>5 > 5 (FALSE)<br>2 > 4 (FALSE)   |
| Lebih kecil             |   <    | Digunakan untuk membandingkan apakah operan pertama lebih kecil nilainya dari operan kedua.           | 5 < 2 (FALSE)<br>5 < 5 (FALSE)<br>2 < 4 (TRUE)   |
| Lebih besar sama dengan |   >=   | Digunakan untuk membandingkan apakah operan pertama lebih besar atau sama nilainya dari operan kedua. | 5 >= 2 (TRUE)<br>5 >= 5 (TRUE)<br>2 >= 4 (FALSE) |
| Lebih kecil sama dengan |   <=   | Digunakan untuk membandingkan apakah operan pertama lebih kecil atau sama nilainya dari operan kedua. | 5 <= 2 (FALSE)<br>5 <= 5 (TRUE)<br>2 <= 4 (TRUE) |

## Operator Logika

**Operator Logika** digunakan untuk melakukan tes pada kondisi/ekspresi, apakah kondisi tersebut benar atau salah. Operator logika hanya akan menghasilkan nilai **TRUE** (jika benar) atau **FALSE** (jika salah). TRUE direpresentasikan oleh angka 1, sedangkan FALSE oleh angka 0.

Operator-operator logika dalam bahasa C adalah sebagai berikut.

| Operator    | Simbol | Keterangan                                                                                   | Nilai Kebenaran                                                      |
| ----------- | :----: | -------------------------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| Logical NOT |   !    | Operator NOT digunakan untuk membalikkan kondisi, TRUE menjadi FALSE dan FALSE menjadi TRUE. | `!1 = 0`<br>`!0 = 1`                                                 |
| Logical AND |   &&   | Operator AND akan menghasilkan nilai TRUE jika kedua operan mempunyai nilai TRUE.            | `1 && 1 = 1`<br>`0 && 1 = 0`<br>`1 && 0 = 0`<br>`0 && 0 = 0`         |
| Logical OR  |  \|\|  | Operator OR akan menghasilkan nilai TRUE jika salah satu operan mempunyai nilai TRUE.        | `1 \|\| 1 = 1`<br>`0 \|\| 1 = 1`<br>`1 \|\| 0 = 1`<br>`0 \|\| 0 = 0` |

> Operator Logika **NOT** merupakan operator unary yang artinya hanya pada bekerja pada satu operan

Operator logika pada umumnya digunakan bersamaan dengan operator relasional untuk melakukan tes pada ekspresi yang berhubungan dengan kebenaran suatu kondisi. Penggunaan paling umum adalah untuk melakukan percabangan (akan dipelajari di bagian selanjutnya).

Contoh:

```java
int a, b, c, d;
a = 11;
b = 24;
c = 11;
d = ((a == c) && (b > a));               // 1 (TRUE)
d = ((a >= b) || (a < c));               // 0 (FALSE)
d = ((b != b) || (b > c)) && (c == a);   // 1 (TRUE)
```

[< Kembali ke Daftar Isi](#daftar-isi)

# Operator Lain

## Operator Gabungan

**Operator Gabungan** adalah operator yang terdiri dari gabungan dua operator. Tujuan dari operator gabungan adalah untuk mempersingkat penulisan kode. Berikut adalah operator gabungan dalam bahasa Java.

| Operator |  Contoh  | Ekuivalen Dengan |
| :------: | :------: | :--------------: |
|    +=    | `a += b` |   `a = a + b`    |
|    -=    | `a -= b` |   `a = a - b`    |
|   \*=    | `a *= b` |   `a = a * b`    |
|    /=    | `a /= b` |   `a = a / b`    |
|    %=    | `a %= b` |   `a = a % b`    |

[< Kembali ke Daftar Isi](#daftar-isi)

# Latihan

## Latihan 1

Buatlah sebuah program dengan output sebagai berikut :

```
Hello World!
"Hello World!"
\(*o*)\ /(*o*)/
'Programming is Ez'
```

## Latihan 2

Buatlah sebuah program yang dapat menghitung luas lingkaran (π = 3.14), dengan jari-jari sebagai 8.

Output :

```
200.96
```
