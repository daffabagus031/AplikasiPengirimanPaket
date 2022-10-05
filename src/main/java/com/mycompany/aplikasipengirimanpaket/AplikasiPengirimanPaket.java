/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aplikasipengirimanpaket;
import java.util.*;

/**
 *
 * @author YGIM
 */
public class AplikasiPengirimanPaket {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========== Aplikasi Pengiriman Paket ==========");
        System.out.println("==Silahkan mengisi kelengkapan data Pengirim==");
        
        System.out.println("Nama Pengirim: ");
        String nama_pengirim = input.next();
        
        System.out.println("No Telp: ");
        int no_telp = input.nextInt();
        
        System.out.println("==Silahkan mengisi kelengkapan data Penerima==");
        
        System.out.println("Nama Penerima: ");
        String nama_penerima = input.next();
        
        System.out.println("No Telp: ");
        int no_tlp = input.nextInt();
        
        System.out.println("Alamat: ");
        String alamat = input.next();
        
        System.out.println("Provinsi: ");
        String prov = input.next();
        
        System.out.println("Kabupaten/Kota: ");
        String kab = input.next();
        
        System.out.println("Kecamatan: ");
        String kec = input.next();
        
        System.out.println("Kode Pos: ");
        int kp = input.nextInt();
        
        System.out.println("Berat (kg): ");
        int berat = input.nextInt();
        
        System.out.println("Harga/kg: ");
        int harga = input.nextInt();
        
        System.out.println("================================     ");
        System.out.println("           INV" + no_tlp           );
        System.out.println("================================");
        
        System.out.println("=============Tujuan=============");
        System.out.println("Nama Penerima: " + nama_penerima);
        System.out.println("Alamat: " + alamat + "," + kec + "," + kab + "," + prov + "," + kp);
        System.out.println("Berat: " + berat);
        System.out.println("Total Biaya: Rp." + (berat*harga));
        System.out.println("No Telp: " + no_tlp);
        
        System.out.println("============Pengirim============");
        System.out.println("Nama Pengirim: " + nama_pengirim);
        System.out.println("No Telp: " + no_telp);
    }
}
