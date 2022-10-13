/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author Ega Naww
 */
public class Siswa {
    
    private String nama;
    private int nilai = 0;
    private String kelas;
    private String alamat;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getNilai(){
        return nilai;
    } 
    
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void getAll(){
        System.out.println("Nama : " + getNama());
        System.out.println("Nilai : " + getNilai());
        System.out.println("Kelas : " + getKelas());
        System.out.println("Alamat : " + getAlamat());
    }
    
    

    }
    
