# Pseudocode dan Flowchart - Latihan Soal C0 sampai C4 (Java)
# Nama : Stefanus Nico P.P NIM : 265314108
## C0 - Starter dan Syntax Repair
 
File: `C0StarterDanSyntaxRepair.java`
 
Program meminta nama dan umur, lalu menampilkan sapaan.
 
### Pseudocode
 
```text
ALGORITMA SapaPengguna
DEKLARASI
    nama : string
    umur : integer
DESKRIPSI
    tampilkan "Nama: "
    baca nama
    tampilkan "Umur: "
    baca umur
    tampilkan "Halo " + nama + ", umur " + umur
```
 
### Flowchart
 
```mermaid
flowchart TD
    A([Mulai]) --> B["Deklarasi nama, umur"]
    B --> C[/"Tampilkan #quot;Nama: #quot;<br/>Baca nama"/]
    C --> D[/"Tampilkan #quot;Umur: #quot;<br/>Baca umur"/]
    D --> E[/"Tampilkan #quot;Halo nama, umur umur#quot;"/]
    E --> F([Selesai])
```
 
---
 
## C1 - Kalkulator Dua Bilangan
 
File: `C1KalkulatorduaBilangan.java`
 
Program membaca dua bilangan bulat, lalu menampilkan hasil enam operasi. Perhatikan perbedaan pembagian bulat (`a / b`) dan pembagian desimal (`a * 1.0 / b`).
 
### Pseudocode
 
```text
ALGORITMA KalkulatorDuaBilangan
DEKLARASI
    a, b : integer
DESKRIPSI
    tampilkan "Masukkan a: "
    baca a
    tampilkan "Masukkan b: "
    baca b
    tampilkan "a + b       = ", a + b
    tampilkan "a - b       = ", a - b
    tampilkan "a * b       = ", a * b
    tampilkan "a / b       = ", a DIV b      { pembagian bulat }
    tampilkan "a * 1.0 / b = ", a / b        { pembagian desimal }
    tampilkan "a % b       = ", a MOD b      { sisa bagi }
```
 
### Flowchart
 
```mermaid
flowchart TD
    A([Mulai]) --> B[/"Baca a, baca b"/]
    B --> C[/"Tampilkan a+b, a-b, a*b"/]
    C --> D[/"Tampilkan a/b (bagi bulat)<br/>dan a*1.0/b (bagi desimal)"/]
    D --> E[/"Tampilkan a % b (sisa bagi)"/]
    E --> F([Selesai])
```
 
---
 
## C2 - Rata-rata Tiga Nilai
 
File: `C2RataRataTigaNilai.java`
 
Program membaca tiga bilangan desimal, menjumlahkannya, lalu membagi total dengan 3.
 
### Pseudocode
 
```text
ALGORITMA RataRataTigaNilai
DEKLARASI
    a, b, c : real
    total, rata : real
DESKRIPSI
    baca a
    baca b
    baca c
    total <- a + b + c
    rata  <- total / 3.0
    tampilkan "Total = ", total
    tampilkan "Rata-rata = ", rata
```
 
### Flowchart
 
```mermaid
flowchart TD
    A([Mulai]) --> B[/"Baca a, baca b, baca c"/]
    B --> C["total <- a + b + c"]
    C --> D["rata <- total / 3.0"]
    D --> E[/"Tampilkan total dan rata-rata"/]
    E --> F([Selesai])
```
 
---
 
## C3 - Membagi Barang ke dalam Paket
 
File: `C3MembagiBarangKedalamPaket.java`
 
Pembagian bulat menghasilkan jumlah paket penuh, dan operator sisa bagi menghasilkan barang yang tidak cukup untuk satu paket.
 
### Pseudocode
 
```text
ALGORITMA MembagiBarangKePaket
DEKLARASI
    jumlahBarang, kapasitasPaket : integer
    paketPenuh, sisa : integer
DESKRIPSI
    tampilkan "Jumlah barang: "
    baca jumlahBarang
    tampilkan "Kapasitas paket: "
    baca kapasitasPaket
    paketPenuh <- jumlahBarang DIV kapasitasPaket
    sisa       <- jumlahBarang MOD kapasitasPaket
    tampilkan "Jumlah paket penuh = ", paketPenuh
    tampilkan "Sisa barang = ", sisa
```
 
### Flowchart
 
```mermaid
flowchart TD
    A([Mulai]) --> B[/"Baca jumlahBarang,<br/>kapasitasPaket"/]
    B --> C["paketPenuh <- jumlahBarang<br/>DIV kapasitasPaket"]
    C --> D["sisa <- jumlahBarang<br/>MOD kapasitasPaket"]
    D --> E[/"Tampilkan paketPenuh dan sisa"/]
    E --> F([Selesai])
```
 
---
 
## C4 - Identitas Pembeli dan Transaksi Sederhana
 
File: `C4IdentitasPembelidanTransaksiSederhana.java`
 
Program menyimpan nama toko sebagai konstanta, membaca data pembeli dan barang, lalu menghitung subtotal.
 
### Pseudocode
 
```text
ALGORITMA TransaksiSederhana
KONSTANTA
    TOKO <- "Toko Belajar Java"
DEKLARASI
    firstName, lastName, fullName, namaBarang : string
    hargaSatuan, subtotal : real
    jumlah : integer
DESKRIPSI
    tampilkan "Nama depan: "
    baca firstName
    tampilkan "Nama belakang: "
    baca lastName
    tampilkan "Nama barang: "
    baca namaBarang
    tampilkan "Harga satuan: "
    baca hargaSatuan
    tampilkan "Jumlah: "
    baca jumlah
    fullName <- firstName + " " + lastName
    subtotal <- hargaSatuan * jumlah
    tampilkan baris kosong
    tampilkan "Nama toko : ", TOKO
    tampilkan "Pembeli   : ", fullName
    tampilkan "Barang    : ", namaBarang
    tampilkan "Harga     : ", hargaSatuan, " | Jumlah: ", jumlah
    tampilkan "Subtotal  : ", subtotal
```
 
### Flowchart
 
```mermaid
flowchart TD
    A([Mulai]) --> B["TOKO <- #quot;Toko Belajar Java#quot;"]
    B --> C[/"Baca nama depan, nama belakang,<br/>nama barang"/]
    C --> D[/"Baca hargaSatuan, jumlah"/]
    D --> E["fullName <- firstName + #quot; #quot; + lastName"]
    E --> F["subtotal <- hargaSatuan * jumlah"]
    F --> G[/"Tampilkan TOKO, fullName, namaBarang,<br/>hargaSatuan, jumlah, subtotal"/]
    G --> H([Selesai])
```
