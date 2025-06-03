/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author OMEN
 */

/*  Nama File   : Kucing.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "meong";
    }

    @Override
    public String gerak() {
        return "merayap";
    }
}

