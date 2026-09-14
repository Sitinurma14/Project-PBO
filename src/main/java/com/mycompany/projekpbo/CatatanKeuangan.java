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
    private int saldo;
    private ArrayList<String> riwayat;
    
    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh bernilai negatif!");
        }
    }
    public CatatanKeuangan() {
        this.saldo = 0;
        this.riwayat = new ArrayList<>();
    }
    
    public void tambahPemasukan(String keterangan, int nominal) {
        if (nominal > 0) {
            this.saldo += nominal;
            this.riwayat.add("[+] " + keterangan + " : Rp " + nominal);
            System.out.println("Berhasil menambahkan pemasukan sebesar Rp " + nominal);
        } else {
            System.out.println("Nominal pemasukan harus lebih dari 0!");
        }
    }
    
    public void tambahPengeluaran(String keterangan, int nominal) {
        if (nominal > 0 && nominal <= this.saldo) {
            this.saldo -= nominal;
            this.riwayat.add("[-] " + keterangan + " : Rp " + nominal);
            System.out.println("Berhasil mencatat pengeluaran sebesar Rp " + nominal);
        } else if (nominal > this.saldo) {
            System.out.println("Gagal! Saldo Anda tidak mencukupi.");
        } else {
            System.out.println("Nominal pengeluaran harus lebih dari 0!");
        }
    }
}    
    
    
   
