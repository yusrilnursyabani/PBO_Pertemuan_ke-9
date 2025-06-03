/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author OMEN
 */
/*  Nama File   : Anabul.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String suara();

    public abstract String gerak();
}

