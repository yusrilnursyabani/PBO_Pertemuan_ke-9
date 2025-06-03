/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variabelgeneric;

/**
 *
 * @author OMEN
 */
/*  Nama File   : MainBangunDatarGenerik.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
public class MainBangunDatarGeneric {
    public static void main(String[] args) {
        // 1) Persegi dengan sisi 5
        Persegi p = new Persegi(5.0);
        BangunDatarGeneric<Persegi> bdPersegi = new BangunDatarGeneric<>(p);
        bdPersegi.tampilInfo();

        // 2) Persegipanjang dengan panjang 7, lebar 3
        PersegiPanjang pp = new PersegiPanjang(7.0, 3.0);
        BangunDatarGeneric<PersegiPanjang> bdPersegipanjang = new BangunDatarGeneric<>(pp);
        bdPersegipanjang.tampilInfo();

        // 3) Segitiga siku-siku dengan alas 6, tinggi 4, sisi miring 5
        Segitiga s = new Segitiga(6.0, 4.0, 5.0);
        BangunDatarGeneric<Segitiga> bdSegitiga = new BangunDatarGeneric<>(s);
        bdSegitiga.tampilInfo();
    }
}

