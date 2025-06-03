/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koleksi;

/**
 *
 * @author OMEN
 */
/*  Nama File   : MainKoleksi.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
public class MainKoleksi {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>();
        for (char ch = 'A'; ch <= 'J'; ch++) {
            koleksiChar.add(ch);
        }
        
        koleksiChar.showAll();
        System.out.println("Elemen pada indeks 3: " + koleksiChar.getIsi(3)); // D

        koleksiChar.setIsi(3, 'Z');
        System.out.println("Setelah setIsi(3,'Z'):");
        koleksiChar.showAll();

        koleksiChar.delete(5);
        System.out.println("Setelah delete(5):");
        koleksiChar.showAll();

        koleksiChar.setSize(12);
        System.out.println("Setelah setSize(12):");
        koleksiChar.showAll();

        koleksiChar.setSize(5);
        System.out.println("Setelah setSize(5):");
        koleksiChar.showAll();
    }
}

