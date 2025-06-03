/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variabelgeneric;

/**
 *
 * @author OMEN
 */
/*  Nama File   : BangunDatarGeneric.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangun;

    public BangunDatarGeneric(T bangun) {
        this.bangun = bangun;
    }

    public T getBangun() {
        return bangun;
    }

    public void setBangun(T bangun) {
        this.bangun = bangun;
    }

    public void tampilInfo() {
        System.out.println("=== Informasi " + bangun.getClass().getSimpleName() + " ===");
        System.out.printf("Luas      : %.2f%n", bangun.hitungLuas());
        System.out.printf("Keliling  : %.2f%n", bangun.hitungKeliling());
        System.out.println();
    }
}

