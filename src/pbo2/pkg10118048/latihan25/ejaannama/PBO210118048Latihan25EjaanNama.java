/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan ejaan nama
 */
public class PBO210118048Latihan25EjaanNama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int i;
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scanner.nextLine();
        System.out.println("\nEjaan untuk '" + nama + "' adalah : ");
        for(i = 0;i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + ": " + nama.substring(i, (i+1)));
        }
    }
}
