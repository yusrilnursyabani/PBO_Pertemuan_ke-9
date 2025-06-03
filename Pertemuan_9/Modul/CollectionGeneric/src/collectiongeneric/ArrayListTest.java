/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectiongeneric;

/**
 *
 * @author OMEN
 */
/*
 * Nama File    : ArrayListTest.java
 * Nama         : Moh Yusril Nur Syabani
 * Deskripsi    : program penggunaan objek ArrayList sebagai Collection class
 * Tanggal      : 9 Mei 2025
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args){
        //inisialisasi ArrayList yang hanya dapat
        //berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s : strings){
            System.out.print(s+" ");
        }
    }
}
