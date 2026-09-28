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
public class Transaksi {
    protected int saldo;
    protected ArrayList<String> riwayat;
    
    public Transaksi() {
        this.saldo = 0;
        this.riwayat = new ArrayList<>();
    }
    
    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo tidak boleh negatif!");
        }
    }

    public ArrayList<String> getRiwayat() {
        return this.riwayat;
    }

    public void setRiwayat(ArrayList<String> riwayat) {
        this.riwayat = riwayat;
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
}
    

