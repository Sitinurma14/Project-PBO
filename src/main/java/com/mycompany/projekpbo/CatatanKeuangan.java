/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekpbo;
import java.util.ArrayList;

/**
 *
 * @author AXIOO
 */
public class CatatanKeuangan {
    int saldo;
    ArrayList<String> riwayat;
    
    public CatatanKeuangan() {
        saldo = 0;
        riwayat = new ArrayList<>();
    }
    
    public void tambahPemasukan(String keterangan, int nominal) {
        if (nominal > 0) {
            saldo += nominal;
            riwayat.add("[+] " + keterangan + " : Rp " + nominal);
            System.out.println("Berhasil menambahkan pemasukan sebesar Rp " + nominal);
        } else {
            System.out.println("Nominal pemasukan harus lebih dari 0!");
        }
    }
}    
    
    
   
