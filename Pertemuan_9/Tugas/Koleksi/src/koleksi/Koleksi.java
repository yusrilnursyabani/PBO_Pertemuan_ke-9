/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koleksi;

/**
 *
 * @author OMEN
 */
/*  Nama File   : Koleksi.java
    Nama        : Moh Yusril Nur Syabani
    Tanggal     : 9 Mei 2025
    Lab         : C2
*/
import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;             
    private ArrayList<T> wadah;    

    public Koleksi() {
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

  
    public T getIsi(int index) {
        if (index < 0 || index >= nbelm) {
            throw new IndexOutOfBoundsException("Index di luar jangkauan.");
        }
        return wadah.get(index);
    }

    
    public void setIsi(int index, T value) {
        if (index < 0 || index >= nbelm) {
            throw new IndexOutOfBoundsException("Index di luar jangkauan.");
        }
        wadah.set(index, value);
    }

   
    public int getSize() {
        return nbelm;
    }

    
    public void setSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Ukuran tidak boleh negatif.");
        }
        if (size < nbelm) {
            // hapus elemen di belakang agar wadah.size() == size
            for (int i = nbelm - 1; i >= size; i--) {
                wadah.remove(i);
            }
        } else if (size > nbelm) {
            // tambahkan null di akhir
            for (int i = nbelm; i < size; i++) {
                wadah.add(null);
            }
        }
        nbelm = size;
    }

 
    public void add(T value) {
        wadah.add(value);
        nbelm++;
    }

  
    public void delete(int index) {
        if (index < 0 || index >= nbelm) {
            throw new IndexOutOfBoundsException("Index di luar jangkauan.");
        }
        wadah.remove(index);
        nbelm--;
    }

  
    public void showAll() {
        System.out.println("=== Isi Koleksi (size=" + nbelm + ") ===");
        for (int i = 0; i < nbelm; i++) {
            System.out.println("Index " + i + " : " + wadah.get(i));
        }
        System.out.println();
    }
}

