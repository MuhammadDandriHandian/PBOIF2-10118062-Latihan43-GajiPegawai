/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118062.latihan43.gajipegawai;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Karyawan {
    private String nama, alamat;
    private int uangtransport, uangtunjangan, gajipokok, totalgaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangtransport() {
        return uangtransport;
    }

    public void setUangtransport(int uangtransport) {
        this.uangtransport = uangtransport;
    }

    public int getUangtunjangan() {
        return uangtunjangan;
    }

    public void setUangtunjangan(int uangtunjangan) {
        this.uangtunjangan = uangtunjangan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getTotalgaji() {
        return totalgaji = uangtunjangan + uangtransport + gajipokok;
    }

    public void setTotalgaji(int totalgaji) {
        this.totalgaji = totalgaji;
    }
    
    public void totalgaji(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("### Data Gaji Karyawan PT.KAKATU ###");
        System.out.println("------------------------------------");
        System.out.println("Nama Karyawan: ");
        System.out.println("Alamat: ");
        System.out.println("Uang Transport: ");
        System.out.println("Uang Tunjangan: ");
        System.out.println("Gaji Pokok: ");
        System.out.println("TOTAL GAJI: ");
    }
    
    public void tampildata(){
      System.out.println("");
      System.out.println("### Data Gaji Karyawan PT.KAKATU###");
      System.out.println("--------------------------");
      System.out.println("Nama Karyawan: M Dandri Handian");
      System.out.println("Alamat: Gelatik Dalam");
      System.out.println("Uang Transport: Rp. 250000");
      System.out.println("Uang Tunjangan: Rp. 300000");
      System.out.println("Gaji Pokok: Rp. 4500000");
      System.out.println("TOTAL GAJI: Rp."+getTotalgaji());
    }
    
} 
   