## Daftar Isi

- [Pengenalan Object Oriented Programming](#pengenalan-object-oriented-programming)
  - [Konsep-Konsep OOP](#konsep-konsep-oop)
  - [Prinsip Utama OOP](#prinsip-utama-oop)
  - [Struktur Dasar Program Java](#struktur-dasar-program-java)
  - [Hak Akses](#hak-akses)
- [Inisialisasi dan Penggunaan OOP](#inisialisasi-dan-penggunaan-oop)
    - [Membuat Kelas dan Objek](#membuat-kelas-dan-objek)
    - [Contoh Implementasi Enkapsulasi](#contoh-implementasi-enkapsulasi)
    - [Pewarisan](#pewarisan)
    - [Polimorfisme](#polimorfisme)
- [Latihan](#latihan)
  - [Latihan 1: Kelas dan Objek](#latihan-1-kelas-dan-objek)
  - [Latihan 2: Enkapsulasi](#latihan-2-enkapsulasi)
  - [Latihan 3: Pewarisan](#latihan-3-pewarisan)
  - [Latihan 4: Polimorfisme](#latihan-4-polimorfisme)

---

## Pengenalan Object Orientend Programming
### Konsep-Konsep OOP
Pemrograman Berbasis Objek (Object-Oriented Programming, OOP) adalah paradigma pemrograman yang menggunakan "objek" untuk merepresentasikan data dan metode. Java adalah bahasa pemrograman yang sangat mendukung OOP, dan memahami konsep OOP sangat penting untuk menjadi seorang programmer Java yang efektif. 
- **OOP**: Paradigma pemrograman yang berpusat pada data, terinspirasi dari organisasi data di dunia nyata.
- **Modularitas**: Kode yang ditulis menjadi modular, memudahkan organisasi dan penggunaan kembali.

### Prinsip Utama OOP

- **Enkapsulasi**: Proteksi data objek dari perubahan langsung.
- **Pewarisan (Inheritance)**: Membuat kelas turunan dari kelas yang ada.
- **Polimorfisme**: Operasi yang sama diterapkan pada objek tipe berbeda dengan manifestasi yang berbeda.

### Struktur Dasar Program Java

- **Kelas dan Objek**: Kelas sebagai cetak biru pembentukan objek; objek sebagai instansiasi kelas.
- **Field/Variable**: Variabel yang menyimpan data.
- **Method/Function**: Organisasi statement untuk operasi tertentu.

### Hak Akses

- **Top Level**: `public`, `default`.
- **Member Level**: `public`, `private`, `protected`, `default`.

Berikut adalah tabel hak akses (access modifiers) dalam OOP menggunakan Java:

| Access Modifier | Class | Package | Subclass (different package) | Subclass (same package) | World |
|-----------------|-------|---------|-----------------------------|-------------------------|-------|
| `public`        | Yes   | Yes     | Yes                         | Yes                     | Yes   |
| `protected`     | Yes   | Yes     | Yes                         | Yes                     | No    |
| `default` (no modifier) | Yes   | Yes     | No                          | Yes                     | No    |
| `private`       | Yes   | No      | No                          | No                      | No    |

#### Penjelasan:

- **public**: Anggota (fields, methods, classes) yang ditandai dengan `public` dapat diakses dari mana saja, baik dalam kelas yang sama, dalam paket yang sama, dari subclass, atau dari kelas di paket yang berbeda.

- **protected**: Anggota yang ditandai dengan `protected` hanya dapat diakses dalam kelas yang sama, dalam paket yang sama, dan dari subclass (baik dalam paket yang sama maupun paket yang berbeda).

- **default**: Jika tidak ada modifier yang ditentukan (juga disebut package-private), akses hanya diizinkan dalam kelas yang sama dan dalam paket yang sama. Anggota ini tidak dapat diakses dari luar paket, termasuk oleh subclass di luar paket.

- **private**: Anggota yang ditandai dengan `private` hanya dapat diakses dalam kelas yang sama. Anggota ini tidak dapat diakses dari kelas lain, bahkan subclass.

#### Contoh Penggunaan Hak Akses:

```java
// Dalam satu file
public class Akses {
    public int publicField;
    protected int protectedField;
    int defaultField;  // default (package-private)
    private int privateField;

    public void publicMethod() { }
    protected void protectedMethod() { }
    void defaultMethod() { }
    private void privateMethod() { }
}

// Dalam file yang berbeda tetapi paket yang sama
public class TestAkses {
    public static void main(String[] args) {
        Akses akses = new Akses();
        
        // Dapat mengakses semua kecuali private
        akses.publicField = 1;
        akses.protectedField = 2;
        akses.defaultField = 3;
        // akses.privateField = 4;  // Tidak bisa

        akses.publicMethod();
        akses.protectedMethod();
        akses.defaultMethod();
        // akses.privateMethod();  // Tidak bisa
    }
}

// Dalam paket yang berbeda
package paketLain;

public class TestAksesLain {
    public static void main(String[] args) {
        Akses akses = new Akses();
        
        // Hanya bisa mengakses public
        akses.publicField = 1;
        // akses.protectedField = 2;  // Tidak bisa
        // akses.defaultField = 3;    // Tidak bisa
        // akses.privateField = 4;    // Tidak bisa

        akses.publicMethod();
        // akses.protectedMethod();   // Tidak bisa
        // akses.defaultMethod();     // Tidak bisa
        // akses.privateMethod();     // Tidak bisa
    }
}
```

## Inisialisasi dan Penggunaan OOP

### Membuat Kelas dan Objek

Untuk membuat objek dari kelas `Pelanggan`, kamu harus menginisiasi objek dengan menggunakan keyword `new` dan memanggil konstruktor kelas.

#### Inisialisasi Objek

```java
public class Main {
  public static void main(String[] args) {
    // Membuat objek Pelanggan
    Pelanggan pelanggan1 = new Pelanggan("John", "Mr.");
    Pelanggan pelanggan2 = new Pelanggan("Jane", "Ms.");

    // Memanggil metode sapa
    pelanggan1.sapa();
    pelanggan2.sapa();
  }
}
```

### Contoh Implementasi Enkapsulasi

#### Menambahkan Hak Akses

```java
class Pelanggan {
  private String nama;
  private String sapaan;
  private int[] pembelian = new int[6];

  Pelanggan(String nama, String sapaan) {
    this.nama = nama;
    this.sapaan = sapaan;
  }

  // Getter dan Setter untuk enkapsulasi
  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getSapaan() {
    return sapaan;
  }

  public void setSapaan(String sapaan) {
    this.sapaan = sapaan;
  }

  public void sapa() {
    System.out.printf("Selamat datang, %s %s!\n", sapaan, nama);
  }
}
```

### Pewarisan

#### Membuat Kelas Turunan

```java
class PelangganVIP extends Pelanggan {
  private double diskon;

  PelangganVIP(String nama, String sapaan, double diskon) {
    super(nama, sapaan);
    this.diskon = diskon;
  }

  public double getDiskon() {
    return diskon;
  }

  public void setDiskon(double diskon) {
    this.diskon = diskon;
  }

  @Override
  public void sapa() {
    super.sapa();
    System.out.printf("Anda mendapatkan diskon sebesar %.2f%%\n", diskon);
  }
}
```

#### Menggunakan Kelas Turunan

```java
public class Main {
  public static void main(String[] args) {
    // Membuat objek Pelanggan
    Pelanggan pelanggan1 = new Pelanggan("John", "Mr.");
    PelangganVIP pelangganVIP = new PelangganVIP("Jane", "Ms.", 15.0);

    // Memanggil metode sapa
    pelanggan1.sapa();
    pelangganVIP.sapa();
  }
}
```

### Polimorfisme

#### Menggunakan Polimorfisme dengan Pewarisan

Dalam contoh ini, kita akan membuat sebuah kelas `Hewan` dan dua kelas turunan `Kuda` dan `Kodok`. Masing-masing kelas akan memiliki metode `bersuara`, tetapi implementasi metode ini akan berbeda di setiap kelas turunan.

#### Membuat Kelas Hewan dan Turunan

```java
// Kelas induk
class Hewan {
  public void bersuara() {
    System.out.println("Hewan bersuara");
  }
}

// Kelas turunan Kuda
class Kuda extends Hewan {
  @Override
  public void bersuara() {
    System.out.println("Kuda meringkik");
  }
}

// Kelas turunan Kodok
class Kodok extends Hewan {
  @Override
  public void bersuara() {
    System.out.println("Kodok menguak");
  }
}
```

#### Menggunakan Polimorfisme

```java
public class Main {
  public static void main(String[] args) {
    // Membuat objek Hewan, Kuda, dan Kodok
    Hewan hewanUmum = new Hewan();
    Hewan kuda = new Kuda();
    Hewan kodok = new Kodok();

    // Memasukkan objek ke dalam array Hewan
    Hewan[] daftarHewan = {hewanUmum, kuda, kodok};

    // Menggunakan polimorfisme untuk memanggil metode bersuara
    for (Hewan hewan : daftarHewan) {
      hewan.bersuara();  // Memanggil metode yang sesuai berdasarkan tipe objek
    }
  }
}
```

#### Hasil Eksekusi:

```plaintext
Hewan bersuara
Kuda meringkik
Kodok menguak
```

Dengan menggunakan polimorfisme, kita dapat memanggil metode `bersuara` pada setiap objek dalam array `daftarHewan`, dan metode yang dipanggil akan sesuai dengan tipe objek sebenarnya (baik `Hewan`, `Kuda`, atau `Kodok`).

### Contoh Kelas

```java
class Pelanggan {
  String nama;
  String sapaan;
  int[] pembelian = new int[6];

  Pelanggan(String nama, String sapaan) {
    this.nama = nama;
    this.sapaan = sapaan;
  }

  void sapa() {
    System.out.printf("Selamat datang, %s %s!\n", sapaan, nama);
  }
}
```

Berikut ini adalah beberapa latihan soal yang menggunakan konsep OOP dalam Java. Setiap soal mencakup berbagai prinsip OOP seperti enkapsulasi, pewarisan, dan polimorfisme. 

### Latihan 1: Kelas dan Objek

**Soal:**
Buatlah kelas `Mahasiswa` yang memiliki atribut `nama`, `nim`, dan `jurusan`. Buatlah konstruktor untuk menginisialisasi semua atribut dan metode `tampilkanInfo` untuk menampilkan informasi mahasiswa.

**Instruksi:**
1. Buat kelas `Mahasiswa`.
2. Tambahkan atribut `nama`, `nim`, dan `jurusan`.
3. Buat konstruktor untuk menginisialisasi atribut-atribut tersebut.
4. Buat metode `tampilkanInfo` yang menampilkan informasi mahasiswa.

<!-- **Jawaban:**
```java
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Budi", "123456", "Informatika");
        mahasiswa1.tampilkanInfo();
    }
}
``` -->

### Latihan 2: Enkapsulasi

**Soal:**
Buat kelas `BankAccount` yang memiliki atribut `accountNumber` dan `balance`. Implementasikan enkapsulasi dengan membuat getter dan setter untuk `balance` saja. Buat metode `deposit` dan `withdraw` untuk menambah dan mengurangi saldo.

**Instruksi:**
1. Buat kelas `BankAccount`.
2. Tambahkan atribut `accountNumber` dan `balance`.
3. Implementasikan getter dan setter untuk `balance`.
4. Buat metode `deposit` dan `withdraw`.

<!-- **Jawaban:**
```java
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Saldo saat ini: " + account.getBalance());
    }
}
``` -->

### Latihan 3: Pewarisan

**Soal:**
Buat kelas `Pegawai` dengan atribut `nama`, `gaji`, dan metode `tampilkanInfo`. Buat kelas `Manager` yang merupakan turunan dari kelas `Pegawai` dengan tambahan atribut `tunjangan` dan override metode `tampilkanInfo` untuk menampilkan semua informasi termasuk `tunjangan`.

**Instruksi:**
1. Buat kelas `Pegawai`.
2. Tambahkan atribut `nama` dan `gaji`.
3. Buat metode `tampilkanInfo`.
4. Buat kelas `Manager` yang merupakan turunan dari `Pegawai`.
5. Tambahkan atribut `tunjangan`.
6. Override metode `tampilkanInfo`.

<!-- **Jawaban:**
```java
class Pegawai {
    protected String nama;
    protected double gaji;

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}

class Manager extends Pegawai {
    private double tunjangan;

    public Manager(String nama, double gaji, double tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Ani", 5000000);
        Manager manager = new Manager("Budi", 7000000, 2000000);

        pegawai.tampilkanInfo();
        System.out.println();
        manager.tampilkanInfo();
    }
}
``` -->

### Latihan 4: Polimorfisme

**Soal:**
Buat kelas `Hewan` dengan metode `suara`. Buat kelas `Kucing` dan `Anjing` yang merupakan turunan dari `Hewan` dan override metode `suara` untuk mencetak suara yang berbeda. Gunakan polimorfisme untuk memanggil metode `suara` pada objek `Kucing` dan `Anjing` yang disimpan dalam array tipe `Hewan`.

**Instruksi:**
1. Buat kelas `Hewan` dengan metode `suara`.
2. Buat kelas `Kucing` dan `Anjing` yang merupakan turunan dari `Hewan`.
3. Override metode `suara` di masing-masing kelas.
4. Buat array tipe `Hewan` yang berisi objek `Kucing` dan `Anjing`.
5. Gunakan loop untuk memanggil metode `suara` pada setiap elemen array.

<!-- **Jawaban:**
```java
class Hewan {
    public void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing: Meong");
    }
}

class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing: Guk guk");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan[] hewan = { new Kucing(), new Anjing() };

        for (Hewan h : hewan) {
            h.suara();
        }
    }
}
``` -->

Dengan menyelesaikan latihan-latihan di atas, kamu dapat memperdalam pemahaman dan kemampuan dalam menggunakan konsep-konsep OOP di Java. Selamat belajar dan berlatih!