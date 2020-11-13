/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan44.hukumohm;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang menghitung rumus hukum OHM
 */
public class PBO210116380Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("=======Hukum OHM======");
        
        Baterai bti = new Baterai(3,12);
        System.out.println("Kuat Arus : " +bti.getKuatArus()+ " ampere ");
        System.out.println("Hambatan : " +bti.getHambatan()+ " ohm ");
        System.out.println("Hasil Tegangan : " +bti.hitungTegangan()+ " volt ");
    
    }
    
}
