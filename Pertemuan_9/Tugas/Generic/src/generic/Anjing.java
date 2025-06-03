/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic;

/**
 *
 * @author OMEN
 */
/*  Nama File   : Anjing.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "guk-guk";
    }

    @Override
    public String gerak() {
        return "merayap";
    }
}

