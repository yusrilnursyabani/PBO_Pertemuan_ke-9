/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author OMEN
 */

/*  Nama File   : Burung.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "cuit";
    }

    @Override
    public String gerak() {
        return "terbang";
    }
}

