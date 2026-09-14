/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projekpbo;

/**
 *
 * @author AXIOO
 */
public class ProjekPBO {

    public static void main(String[] args) {
        System.out.println("APLIKASI PENCATAT KEUANGAN PRIBADI");
        
        CatatanKeuangan dompetDigital = new CatatanKeuangan();
        
        System.out.println("Saldo Awal: Rp " + dompetDigital.getSaldo());
        
         System.out.println("\nMELAKUKAN TRANSAKSI");
         
        dompetDigital.tambahPemasukan("Uang Saku Bulan Ini", 500000);
        dompetDigital.tambahPengeluaran("Beli Buku Kuliah", 75000);
        
        System.out.println("\nSaldo Akhir: Rp " + dompetDigital.getSaldo());
    }
}
