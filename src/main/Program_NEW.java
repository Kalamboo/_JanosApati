/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import modell.Galeria_NEW;
import modell.KiallitasiTargy_NEW;

/**
 *
 * @author 36204
 */
public class Program_NEW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Galeria_NEW g1 = new Galeria_NEW();
        
        System.out.println("Cím szerinti:");
        for (KiallitasiTargy_NEW targy : g1.rendezCimSzerint()) {
            System.out.println(targy);
        }
        
        System.out.println("Készítő szerinti:");
        for (KiallitasiTargy_NEW targy : g1.rendezKeszitoSzerint()) {
            System.out.println(targy);
        }
        
    }
    
}
