/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;
import javax.swing.JOptionPane;
/**
 *
 * @author Ega Naww
 */
public class BangunDatarObj {
    public static void main(String[] args){
        BangunDatar volume = new BangunDatar();
        
        JOptionPane.showMessageDialog(null, "Menghitung Volume Balok");
        volume.setInput1(JOptionPane.showInputDialog("Masukkan panjang : "));
        volume.setInput2(JOptionPane.showInputDialog("Masukkan lebar : "));
        volume.setInput3(JOptionPane.showInputDialog("Masukkan tinggi : "));
        volume.menghitung();
        
    }
    
}
