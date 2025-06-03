/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic;

/**
 *
 * @author OMEN
 */

/*  Nama File   : MainKoleksiAnabul.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
import java.util.Random;

public class MainKoleksiAnabul {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();

        // Nama‑nama acak untuk contoh
        String[] namaKucing = { "Kitty", "Mimi", "Tom", "Luna", "Millie" };
        String[] namaAnjing = { "Buddy", "Rocky", "Max", "Bella", "Charlie" };
        String[] namaBurung = { "Cici", "Lulu", "Rio", "Coco", "Kiki" };

        Random rnd = new Random();

        // Isi koleksi dengan 10 elemen acak (Kucing / Anjing / Burung)
        for (int i = 0; i < 10; i++) {
            int jenis = rnd.nextInt(3); // 0=Kucing, 1=Anjing, 2=Burung
            switch (jenis) {
                case 0:
                    // ambil nama acak dari namaKucing
                    String namaK = namaKucing[rnd.nextInt(namaKucing.length)];
                    koleksiAnabul.add(new Kucing(namaK));
                    break;
                case 1:
                    String namaA = namaAnjing[rnd.nextInt(namaAnjing.length)];
                    koleksiAnabul.add(new Anjing(namaA));
                    break;
                default:
                    String namaB = namaBurung[rnd.nextInt(namaBurung.length)];
                    koleksiAnabul.add(new Burung(namaB));
                    break;
            }
        }

        // Tampilkan semuanya: nama, suara, gerak
        System.out.println("=== Koleksi Anabul (10 Elemen Acak) ===");
        for (int i = 0; i < koleksiAnabul.getSize(); i++) {
            Anabul hewan = koleksiAnabul.getIsi(i);
            System.out.println("Index " + i + " :");
            System.out.println("  Nama  : " + hewan.getNama());
            System.out.println("  Suara : " + hewan.suara());
            System.out.println("  Gerak : " + hewan.gerak());
            System.out.println();
        }
    }
}

