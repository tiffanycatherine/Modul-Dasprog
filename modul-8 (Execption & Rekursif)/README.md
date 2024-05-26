## Daftar Isi

- [Exception Handling](#exception-handling)
  - [Blok Try-Catch](#blok-try-catch)
  - [Blok Finally](#blok-finally)
  - [Throws dan Throw](#throws-dan-throw)
- [Teori Rekursif dalam Pemrograman](#teori-rekursif-dalam-pemrograman)
  - [Base Case](#base-case)
  - [Recursive Case](#recursive-case)
  - [Struktur Umum Fungsi Rekursif](#struktur-umum-fungsi-rekursif)
  - [Contoh Rekursif: Faktorial](#contoh-rekursif-faktorial)
    - [Ilustrasi Faktorial](#ilustrasi-faktorial)
    - [Implementasi Rekursif](#implementasi-rekursif)
    - [Diagram Rekursif untuk Faktorial 3](#diagram-rekursif-untuk-faktorial-3)
  - [Contoh Rekursif: Fibonacci](#contoh-rekursif-fibonacci)
    - [Ilustrasi Fibonacci](#ilustrasi-fibonacci)
    - [Implementasi Rekursif](#implementasi-rekursif)
    - [Diagram Rekursif untuk Fibonacci 3](#diagram-rekursif-untuk-fibonacci-3)
- [Soal Latihan Exception Handling](#soal-latihan-exception-handling)
  - [Latihan 1: Pembagian dengan Exception Handling](#latihan-1-pembagian-dengan-exception-handling)
  - [Latihan 2: Array Index Out of Bounds](#latihan-2-array-index-out-of-bounds)
- [Soal Latihan Rekursif](#soal-latihan-rekursif)
  - [Latihan 1: Menghitung Pangkat Rekursif](#latihan-1-menghitung-pangkat-rekursif)
  - [Latihan 2: Menghitung Jumlah Angka Rekursif](#latihan-2-menghitung-jumlah-angka-rekursif)

## Exception Handling

Exception handling dalam Java adalah mekanisme untuk menangani error runtime sehingga program tidak berhenti secara tiba-tiba. Dengan menggunakan exception handling, kita bisa menangani error dengan cara yang lebih terkontrol.

### Blok Try-Catch

Blok `try` digunakan untuk menampung kode yang mungkin menghasilkan exception. Blok `catch` digunakan untuk menangkap dan menangani exception tersebut.

```java
public class Main {
	public static void main(String[] args) {
		try {
			int divideByZero = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Terjadi kesalahan: " + e.getMessage());
		}
	}
}
```

### Blok Finally

Blok `finally` digunakan untuk mengeksekusi kode yang selalu dijalankan, baik terjadi exception maupun tidak.

```java
public class Main {
	public static void main(String[] args) {
		try {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index tidak valid: " + e.getMessage());
		} finally {
			System.out.println("Eksekusi selesai.");
		}
	}
}
```

### Throws dan Throw

- `throws` digunakan di signature method untuk menyatakan bahwa method tersebut dapat melempar exception tertentu.
- `throw` digunakan untuk melempar exception secara eksplisit.

```java
public class Main {
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Umur harus di atas 18 tahun");
		} else {
			System.out.println("Akses diizinkan.");
		}
	}
}
```

## Teori Rekursif dalam Pemrograman

Rekursif adalah teknik pemrograman di mana sebuah fungsi memanggil dirinya sendiri untuk menyelesaikan masalah. Rekursif dapat memecah masalah kompleks menjadi sub-masalah yang lebih kecil dan serupa. Ada dua komponen utama dalam rekursif: base case dan recursive case.

### Base Case

Base case adalah kondisi yang menghentikan rekursi. Tanpa base case, fungsi rekursif akan memanggil dirinya sendiri tanpa henti, yang dapat menyebabkan stack overflow (memori penuh). Base case adalah kondisi sederhana yang bisa langsung diselesaikan tanpa memanggil fungsi rekursif lagi.

### Recursive Case

Recursive case adalah bagian di mana fungsi memanggil dirinya sendiri dengan parameter yang diubah sehingga mendekati base case. Ini adalah inti dari rekursif, di mana masalah besar dipecah menjadi sub-masalah yang lebih kecil.

### Struktur Umum Fungsi Rekursif

```java
public int recursiveFunction(int n) {
	// Base case
	if (n == baseCondition) {
		return simpleSolution;
	} else {
		// Recursive case
		return recursiveFunction(modifiedParameter);
	}
}
```

#### Contoh Rekursif: Faktorial

Mari kita lihat contoh faktorial untuk lebih memahami konsep ini.

###### Ilustrasi Faktorial

Faktorial dari sebuah bilangan `n` (ditulis `n!`) adalah hasil perkalian semua bilangan dari 1 hingga `n`. Misalnya:

- Faktorial 3 (`3!`): `3 * 2 * 1 = 6`
- Faktorial 5 (`5!`): `5 * 4 * 3 * 2 * 1 = 120`

###### Implementasi Rekursif

```java
public class Main {
	public static void main(String[] args) {
		int number = 5;
		int result = factorial(number);
		System.out.println("Faktorial dari " + number + " adalah " + result);
	}

	static int factorial(int n) {
		// Base case
		if (n == 0) {
			return 1;
		} else {
			// Recursive case
			return n * factorial(n - 1);
		}
	}
}
```

###### Diagram Rekursif untuk Faktorial 3

```
factorial(3)
	3 * factorial(2)
		2 * factorial(1)
			1 * factorial(0)
				1
```

Hasil akhirnya adalah `3 * 2 * 1 * 1 = 6`.

#### Contoh Rekursif: Fibonacci

Deret Fibonacci adalah deret angka di mana setiap angka adalah jumlah dari dua angka sebelumnya. Deret dimulai dari 0 dan 1.

###### Ilustrasi Fibonacci

- Fibonacci(0): 0
- Fibonacci(1): 1
- Fibonacci(2): 0 + 1 = 1
- Fibonacci(3): 1 + 1 = 2

###### Implementasi Rekursif

```java
public class Main {
	public static void main(String[] args) {
		int n = 7;
		System.out.println("Fibonacci ke-" + n + " adalah " + fibonacci(n));
	}

	static int fibonacci(int n) {
		// Base case
		if (n <= 1) {
			return n;
		} else {
			// Recursive case
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
}
```

###### Diagram Rekursif untuk Fibonacci 3

```
fibonacci(3)
	fibonacci(2) + fibonacci(1)
		(fibonacci(1) + fibonacci(0)) + 1
			1 + 0 + 1
```

Hasil akhirnya adalah `2`.

### Soal Latihan Exception Handling

#### Latihan 1: Pembagian dengan Exception Handling

Buat sebuah program yang meminta pengguna untuk memasukkan dua angka, kemudian lakukan pembagian dari angka pertama dengan angka kedua. Gunakan exception handling untuk menangani kasus di mana angka kedua adalah nol.

<!-- ```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan angka pertama: ");
		int num1 = scanner.nextInt();
		System.out.print("Masukkan angka kedua: ");
		int num2 = scanner.nextInt();

		try {
			int result = num1 / num2;
			System.out.println("Hasil pembagian: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Tidak bisa membagi dengan nol.");
		}
	}
}
``` -->

#### Latihan 2: Array Index Out of Bounds

Buat sebuah program yang meminta pengguna untuk memasukkan indeks sebuah array. Tangani exception yang terjadi jika indeks yang dimasukkan melebihi panjang array.

<!-- ```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan indeks array: ");
		int index = scanner.nextInt();

		try {
			System.out.println("Nilai pada indeks " + index + " adalah " + numbers[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Indeks yang dimasukkan tidak valid.");
		}
	}
}
``` -->

### Soal Latihan Rekursif

#### Latihan 1: Menghitung Pangkat Rekursif

Buat sebuah fungsi rekursif untuk menghitung hasil pangkat dari dua angka yang dimasukkan oleh pengguna.

<!-- ```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan angka basis: ");
		int base = scanner.nextInt();
		System.out.print("Masukkan angka pangkat: ");
		int exponent = scanner.nextInt();

		int result = power(base, exponent);
		System.out.println(base + " pangkat " + exponent + " adalah " + result);
	}

	static int power(int base, int exponent) {
		if (exponent == 0) {
			return 1; // Base case
		} else {
			return base * power(base, exponent - 1); // Recursive call
		}
	}
}
``` -->

#### Latihan 2: Menghitung Jumlah Angka Rekursif

Buat sebuah fungsi rekursif untuk menghitung jumlah dari semua angka dari 1 hingga n yang dimasukkan oleh pengguna.

<!--
```java
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan angka n: ");
		int n = scanner.nextInt();

		int result = sumUpTo(n);
		System.out.println("Jumlah dari 1 hingga " + n + " adalah " + result);
	}

	static int sumUpTo(int n) {
		if (n == 1) {
			return 1; // Base case
		} else {
			return n + sumUpTo(n - 1); // Recursive call
		}
	}
}
``` -->
