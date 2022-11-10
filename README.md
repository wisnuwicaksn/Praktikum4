# Praktikum4
tugas Pemrograman dan Orientasi Obyek 4

Polimorfisme dalam OOP adalah sebuah prinsip di mana class dapat memiliki banyak “bentuk” method yang berbeda-beda meskipun namanya sama.

“Bentuk” di sini dapat kita artikan: isinya berbeda, parameternya berbeda, dan tipe datanya berbeda

Contoh :
![image](https://user-images.githubusercontent.com/92707545/201054868-cbbf4054-f683-45dd-bd60-8b0f1c454e92.png)

Pada diagram tersebut, terdapat class BanungDatar yang memiliki tiga subclass, yaitu: Persegi, Lingkaran, dan Segitiga.
Setiap class memiliki method yang sama yaitu luas() dan keliling(). Akan tetapi method-method ini memiliki isi rumus yang berbeda.

1. Membuat class BangunDatar, Persegi, Segitiga, Lingkaran yang berisi rumus luas dan keliling :
![image](https://user-images.githubusercontent.com/92707545/201055532-23a0c6e3-2192-4696-8f3a-d0db7e32a82b.png)

2. Membuat class main Utama untuk menjalankan program :
![image](https://user-images.githubusercontent.com/92707545/201055827-7ce8b0ca-a459-4927-838a-3244946fbc01.png)

Sekarang kita sudah punya lima class di dalam package bagnundatar.
Class yang bisa dijalankan hanyalah class Main, karena ia memiliki method main.
Untuk menjalankannya, silahkan klik kanan pada class main.. lalu pilih Run File.
Maka hasilnya:

![image](https://user-images.githubusercontent.com/92707545/201056345-650ff1d1-cc93-4cb7-a71b-886c9039dc94.png)
