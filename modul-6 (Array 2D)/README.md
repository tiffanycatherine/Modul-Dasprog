## Daftar Isi

- [Pengenalan Array 2D](#pengenalan-array-2d)
    - [Pengertian Array 2D](#pengertian-array-2d)
    - [Deklarasi Array 2D](#deklarasi-array-2d)
    - [Memberikan Nilai Pada Array](#memberikan-nilai-pada-array)
    - [Inisiasi Elemen Array 2D](#inisiasi-elemen-array-2d)
    - [Mengakses Elemen Array 2D](#mengakses-elemen-array-2d)
    - [Contoh Penggunaan Array 2D](#contoh-penggunaan-array-2D)
    

- [Menampilkan Array 2D Lanjutan](#menampilkan-array-2d-lanjutan)

  - [Menggunakan Loop `for` Bersarang](#menggunakan-loop-for-bersarang)
  - [Menggunakan Method `Arrays.toString()`](#menggunakan-method-arrays.tostring())
  - [Menggunakan Loop `foreach`](#menggunakan-loop-foreach)

- [Soal Latihan](#latihan)
  - [Latihan 1](#latihan-1)
  - [Latihan 2](#latihan-2)

## Pengenalan Array 2D

### Pengertian Array 2D

Array 2D atau array dua dimensi adalah struktur data yang digunakan untuk menyimpan kumpulan data dalam bentuk tabel. Berbeda dengan array 1 dimensi yang hanya memiliki satu baris, array 2 dimensi memiliki baris dan kolom. Hal ini memungkinkan kita untuk menyimpan data yang lebih kompleks dan terstruktur.

### Deklarasi Array 2D

Untuk mendeklarasikan array 2 dimensi di Java, kita dapat menggunakan sintaks berikut:

```java
tipe_data[][] nama_array = new tipe_data[baris][kolom];
```

Dimana:

- `tipe_data` adalah tipe data yang akan disimpan dalam array.
- `nama_array` adalah nama yang diberikan untuk array.
- `baris` adalah jumlah baris dalam array.
- `kolom` adalah jumlah kolom dalam array.

Contoh:

```java
int[][] nilai = new int[3][4];
```

Pernyataan di atas mendeklarasikan array 2 dimensi bernama `nilai` yang dapat menyimpan nilai integer. Array ini memiliki 3 baris dan 4 kolom.

### Memberikan Nilai Pada Array

Setelah mendeklarasikan array, kita dapat memberikan kepada elemen-elemennya dengan nilai-nilai tertentu. Hal ini dapat dilakukan dengan menggunakan sintaks berikut:

```java
nama_array[baris][kolom] = nilai;
```

Dimana:

- `nama_array` adalah nama array.
- `baris` adalah indeks baris elemen yang ingin diinisialisasi.
- `kolom` adalah indeks kolom elemen yang ingin diinisialisasi.
- `nilai` adalah nilai yang ingin disimpan dalam elemen.

Contoh:

```java
nilai[0][0] = 10;
nilai[0][1] = 20;
nilai[0][2] = 30;
nilai[0][3] = 40;

nilai[1][0] = 50;
nilai[1][1] = 60;
nilai[1][2] = 70;
nilai[1][3] = 80;

nilai[2][0] = 90;
nilai[2][1] = 100;
nilai[2][2] = 110;
nilai[2][3] = 120;
```

Pernyataan di atas menginisiasi elemen-elemen array `nilai` dengan nilai-nilai integer.

### Inisiasi Elemen Array 2D

Selain mendeklarasikan array, kita juga dapat mendeklarasi variabel array sekaligus memberikan nilai. Hal ini dapat dilakukan dengan menggunakan sintaks berikut:


```java
tipe_data[][] nama_array = {{value}, {value}};
```

Contoh:
```java
int[][] number = {{1,2,3}, {4,5,6}, {7,8,9}};
```
### Mengakses Elemen Array 2D

Untuk mengakses elemen array 2 dimensi, kita dapat menggunakan sintaks berikut:

```java
nilai = nama_array[baris][kolom];
```

Dimana:

- `nilai` adalah variabel yang akan menampung nilai elemen yang diakses.
- `nama_array` adalah nama array.
- `baris` adalah indeks baris elemen yang ingin diakses.
- `kolom` adalah indeks kolom elemen yang ingin diakses.

Contoh:

```java
int nilaiElemen = nilai[1][2];
```

Pernyataan di atas mengakses elemen pada baris ke-2 dan kolom ke-3 dari array `nilai` dan menyimpan nilainya dalam variabel `nilaiElemen`.

### Contoh Penggunaan Array 2D

Berikut adalah contoh penggunaan array 2 dimensi untuk menyimpan nilai-nilai suhu di beberapa kota selama 3 hari:

```java
public class SuhuKota {

    public static void main(String[] args) {
        int[][] suhu = new int[3][4];

        suhu[0][0] = 28;
        suhu[0][1] = 27;
        suhu[0][2] = 26;
        suhu[0][3] = 25;

        suhu[1][0] = 30;
        suhu[1][1] = 29;
        suhu[1][2] = 28;
        suhu[1][3] = 27;

        suhu[2][0] = 25;
        suhu[2][1] = 24;
        suhu[2][2] = 23;
        suhu[2][3] = 22;

        // Menampilkan nilai suhu
        for (int i = 0; i < suhu.length; i++) {
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print(suhu[i][j] + " ");
            }
        }
    }
}
```

## Menampilkan Array 2D Lanjutan

Berikut adalah beberapa cara untuk menampilkan isi array 2 dimensi:

### Menggunakan Loop `for` Bersarang

```java
for (int i = 0; i < suhu.length; i++) {
    for (int j = 0; j < suhu[i].length; j++) {
        System.out.print(suhu[i][j] + " ");
    }
    System.out.println();
}
```

Kode di atas akan menampilkan isi array `suhu` dalam bentuk tabel.

### Menggunakan Method `Arrays.toString()`

```java
System.out.println(Arrays.toString(suhu));
```

Kode di atas akan menampilkan isi array `suhu` dalam bentuk string.

### Menggunakan Loop `foreach`

```java
for (int[] baris : suhu) {
    for (int nilai : baris) {
        System.out.print(nilai + " ");
    }
    System.out.println();
}
```

Kode di atas akan menampilkan isi array `suhu` dalam bentuk tabel.

## Latihan

### Latihan 1
Buatlah sebuah program Java yang meminta pengguna untuk memasukkan nilai-nilai matriks 2x2, lalu mencetak nilai rata-rata dari semua elemen dalam matriks tersebut.
**Sample Input 1**

```
2 3 
4 5
```

**Sample Output 1**

```
3.5
```

**Sample Input 2**

```
6 7 
6 7
```

**Sample Output 2**

```
6.5
```

### Latihan 2
Herry sebagai programmer ditugaskan untuk membuat predifine map dari sebuah kolam. Kolam memiliki ukuran NxM dan terdapat 3 jenis bentuk, yaitu Robot( * ) dan Space kosong ( . ). Herry harus bisa mengatur pergerakan robot dengan menerima input, yaitu W (Maju), A (Kiri), S (Bawah), dan D (Kanan). Bantu Herry untuk menyelesaikan program tersebut.

**Sample Input 1**

```
4 4
....
....
....
*...
w
```

**Sample Output 1**

```
....
....
*...
....
```

**Sample Input 2**

```
6 6
......
......
......
*.....
......
......
ddw
```

**Sample Output 2**

```
......
......
..*...
......
......
......
```