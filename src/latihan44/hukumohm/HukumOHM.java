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
public class HukumOHM {

     private float kuatArus, hambatan;

    public HukumOHM(){
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n" +
                "akan berbanding lurus dengan beda potensial\n" +
                "pada ujung-ujung kawat penghantar tersebut\n" +
                "asalkan suhu kawat dijaga konstan.\n");
    }

    public HukumOHM(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}

