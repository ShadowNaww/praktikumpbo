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
public class BangunDatar {
    private String input1;
    private String input2;
    private String input3;
    
    public void setInput1(String input1){
        this.input1 = input1;
    }
    
    public void setInput2(String input2){
        this.input2 = input2;
    }
    
    public void setInput3(String input3){
        this.input3 = input3;
    }
    
    public void menghitung(){
        int nilai1; int nilai2; int nilai3; int kali;
        
        nilai1 = Integer.parseInt(input1);
        nilai2 = Integer.parseInt(input2);
        nilai3 = Integer.parseInt(input3);
        kali = perkalian(nilai1, nilai2, nilai3);
        
        JOptionPane.showMessageDialog(null,
        "Hasil menghitung volume balok : "+kali);
    }
    
    public static int perkalian(int nilai1, int nilai2, int nilai3){
        return nilai1*nilai2*nilai3;
    }
    
}
