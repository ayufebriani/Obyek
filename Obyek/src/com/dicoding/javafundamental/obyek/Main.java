/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dicoding.javafundamental.obyek;

/**
 *
 * @author ASUS
 */
public class Main {
              public static void main(String[] args) {
        Hewan Gajah = new Hewan("Gajah");
        Hewan Buaya = new Hewan("Buaya");
        
        Gajah.beratHewan(10);
        Gajah.jumlahKakiHewan(4);
        Gajah.cetakHewan();
        Buaya.beratHewan(5);
       Buaya.jumlahKakiHewan(4);
       Buaya.cetakHewan();
    }
}