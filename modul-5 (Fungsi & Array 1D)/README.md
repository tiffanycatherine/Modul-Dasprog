## Daftar Isi
- [Fungsi](#fungsi)
    + [Pengenalan dan Konstruksi Fungsi](#pengenalan-dan-konstruksi-fungsi)
    + [Access Modifier](#access-modifier)
    + [Return Type](#return-type)
    + [Parameter](#fparameter)
    + [Pemanggilan Fungsi](#pemanggilan-fungsi)
- [Array 1D](#array-1d)
    + [Deklarasi Array](#deklarasi-array)
    + [Inisialisasi Array](#inisialisasi-array)
    + [Mengakses Array](#mengakses-array)
- [Soal Latihan]($=#soal-latihan)
    + [Soal 1](#soal-1)
    + [Soal 2](#soal-2)
    


# Fungsi
## Pengenalan dan Konstruksi Fungsi
Fungsi adalah sebuah kumpulan statement untuk melakukan tugas spesifik, yang bisa membutuhkan input ataupun tidak, untuk menghasilkan output yang sesuai.

Secara umum, fungsi dibedakan menjadi dua, yakni fungsi Standard Library dan fungsi yang dibuat pengguna. Fungsi Standard Library adalah fungsi bawaan yang telah disertakan dalam library standar, misal fungsi next(), nextInt() yang ada di dalam library Scanner. Sedangkan fungsi yang dibuat oleh pengguna (user-defined) adalah fungsi yang sengaja dibuat oleh pengguna untuk memenuhi keperluan pengguna dalam membuat program.

Tujuan dibuatnya fungsi secara umum adalah untuk membuat program menjadi lebih modular. Fungsi digunakan ketika ingin menjalankan serangkaian perintah secara berulang kali, terkadang dengan input yang berbeda, dengan tujuan tidak mengulang penulisan kode berkali-kali, serta apabila nantinya program mengalami bug akan mempermudah proses perbaikan.

Pada modul 5 ini, fungsi yang akan dipelajari merupakan fungsi statis yang dapat dikonstruksikan sebagai berikut

```
<access_modifier> static <return_type> <identifier>(){
    //statement
}
```


## Access Modifier

Access Modifier digunakan untuk menentukan visibilitas dari suatu class atau method. Access Modifier membuat suatu fungsi memiliki ketentuan terkait program apa saja yang boleh mengakses fungsi tersebut. 
![access_modifier_table](https://media.geeksforgeeks.org/wp-content/uploads/20220504160344/ModifiersTypesInJavapng.jpg)

## Return Type
Jika kita menginginkan fungsi yang kita jalankan menghasilkan sebuah nilai atau sederhananya menghasilkan sebuah output, kita bisa menambahkan *keyword* `return` dan mendefinisikan *return type* dari fungsi tersebut. Fungsi yang memiliki *return type* bukan `void` pasti memiliki *return value*. Nilai yang dikembalikan oleh fungsi tersebut memiliki tipe data yang bersesuaian dengan *return type*-nya.

Saat menemui *statement* `return` pada fungsi, maka fungsi tersebut akan berhenti dari titik dimana `return` tersebut terdapat, kemudian kembali ke bagian kode yang memanggil fungsi tersebut.

Misal kita ingin mendapatkan hasil dari penjumlahan dua bilangan menggunakan fungsi bernama `jumlah()`.

```java
public static void jumlah(int a, int b)
{
    int hasil = a + b;
    return hasil;
}
```



## Parameter

**Parameter** pada fungsi bersifat layaknya input yang diberikan kepada sebuah fungsi. Jumlah parameter pada sebuah fungsi bisa dibuat sebanyak-banyaknya sesuai kebutuhan.

Penulisan parameter fungsi sama dengan pendefinisian variabel dan tiap parameter dipisahkan oleh operator (,).

```
<tipe_data> <nama_parameter_1> , <tipe_data> <nama_parameter_2>, ...
```

Contoh:
```java
public static void cetak(String greetings)
{
    System.out.println(greetings);
}
 
public static void tambah(int a, int b)
{
    int hasil = a + b;
    System.out.println(hasil);
}
```


## Pemanggilan Fungsi
Untuk memanggil fungsi, dilakukan dengan menulis nama fungsinya diikuti dengan tanda `()`. Apabila fungsi tersebut memiliki parameter maka di dalam tanda `()` dituliskan nilai/variabel/objek untuk dijadikan yang kita sebut dengan argumen dan dipisahkan tiap argumen dengan operator `,`. Argumen-argumen yang dimasukkan harus sesuai dengan tipe data parameter fungsinya.

Contoh pemanggilan fungsi:

```java
public static void main(String[] args)
{
    tambah(2,5);
    cetak("Halo, dunia");
}
```


# Array 1d

## Deklarasi Array

Array juga sama seperti variabel, perlu dideklarasikan terlebih dahulu sebelum bisa digunakan. Deklarasi array sama seperti variabel, hanya saja saat pendeklarasiannya perlu dituliskan ukurannya.

```
tipe_data[] identifier_array = new tipe_data[size];
```

## Inisialisasi Array

Kita juga bisa menginisialisasi elemen-elemen pada array setelah dideklarasikan. Sintaksnya adalah seperti berikut.

```
tipe_data[] identifier_array = {elem1, elem2, elem3, ....};
```

## Mengakses Array

Seperti yang telah dijelaskan sebelumnya, array disimpan secara sekuensial (pada blok memori secara berurutan). Lalu bagaimana kita mengakses tiap elemennya? Pengaksesan elemen pada array dilakukan dengan menuliskan _identifier_ array-nya lalu digabung dengan menggunakan operator subscript `[]` dengan menyertakan indeks didalamnya.

![akses_array](https://github.com/AlproITS/DP_modul-2/blob/master/img/Array_access.png)

Indeks pada array menggunakan _zero-based index_, yang artinya elemen pertama pada array ditunjukkan oleh indeks ke 0 (bukan ke 1) dan elemen terakhir ditunjukkan oleh indeks ke N-1 (misal N adalah panjang array).
Elemen-elemen pada array dapat diperlakukan sama seperti halnya variabel. Kita dapat melakukan assignment, operasi aritmatika, dan lain-lain.

Contoh:

```java
public static void main(String[] args)
{

  int[] a = new int[10]; //Deklarasi Array
  
  int[] b = {1, 2, 3, 4, 5}; //Inisialisasi Array
  
  a[0] = 50;
  a[1] = 20;
  
  System.out.println(a[0]+" "+a[1]); // hasil : 50 20
  
}
```

Mengapa kita perlu array? Andaikan kita membutuhkan 1000 inputan data, kita tidak perlu membuat deklarasi variabel berjumlah 1000, misalkan variabel a1 hinga a1000. Namun, kita cukup menuliskan 1 identifier array berkapasitas 1000.

Contoh program tanpa array:
```java
import java.util.Scanner

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b, c, d, e; //Deklarasi 5 variabel integer
          
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
    e = sc.nextInt();
          
    System.out.println("Bilangan pertama adalah"+ a);
    System.out.println("Bilangan kedua adalah"+ b);
    System.out.println("Bilangan ketiga adalah "+ c);
    System.out.println("Bilangan keempat adalah "+ d);
    System.out.println("Bilangan kelima adalah "+ e);

}
```

Bayangkan kita tidak hanya memasukkan 5 data, melainkan 1000 data, bagaimana kita mendeklarasikan semuanya dalam variabel dan kemudian mencetaknya? Maka dari itulah array digunakan.

Contoh program menggunakan array:
```java
import java.util.Scanner

public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
	int[] a = new int[5];
	for(int i = 0; i < 5; i++) {
		a[i] = sc.nextInt(); //Input array
	}

	for(int i = 0; i < 5; i++) {
		System.out.println("Bilangan ke-" + i +" adalah "+ a[i]); // Output array
	}

}
```java
public static void main(String[] args)
{
    int[] a = {1, 2, 3, 4, 5};
    System.out.println(a.length); // hasil : 5
  
}
```


Kita juga dapat mengakses nilai dari panjang suatu array menggunakan fungsi `.length`

# Soal Latihan

## Soal 1

Buat program untuk mencetak asterisk, `*`, untuk bilangan genap, dan bilangan aslinya untuk bilangan ganjil, dari n buah bilangan mulai 1 s.d n.

**Sample Input**

```
6
```

**Sample Output**

```
1 * 3 * 5 *
```

## Soal 2

Buatlah program untuk mencetak N buah angka yang diinput secara terbalik. Input baris pertama adalah N yang merupakan banyaknya angka yang akan diinput. Baris berikutnya terdapat N buah angka (dipisahkan spasi).

**Sample Input**

```
5
1 4 3 2 9
```

**Sample Output**

```
9
2
3
4
1
```

