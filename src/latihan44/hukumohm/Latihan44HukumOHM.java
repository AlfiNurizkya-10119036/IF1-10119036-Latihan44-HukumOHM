/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan44.hukumohm;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Menghitung Hukum OHM
 */
public class Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HukumOHM baterai = new HukumOHM();
        HukumOHM baterai1 = new HukumOHM(3f, 12f);

        System.out.println("Kuat Arus : " + baterai1.getKuatArus() + " ampere");
        System.out.println("Hambatan : " + baterai1.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : "+ baterai1.hitungTegangan() + " volt");
    }
}
