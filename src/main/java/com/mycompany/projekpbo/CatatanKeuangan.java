/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projekpbo;

/**
 *
 * @author AXIOO
 */
public class CatatanKeuangan extends Transaksi {
    public CatatanKeuangan() {
        super();
    }
    
    @Override
    public void tambahPemasukan(String keterangan, int nominal) {
        if (nominal > 0) {
            this.saldo += nominal;
            this.riwayat.add("[+] (Pemasukan Catatan) " + keterangan + " : Rp " + nominal);
            System.out.println("Pemasukan berhasil dicatat!");
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