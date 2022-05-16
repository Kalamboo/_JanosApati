/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Festmeny_NEW;
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
        
        for (KiallitasiTargy_NEW targy : g1) {
            if(targy instanceof Festmeny_NEW){
                ((Festmeny_NEW)targy).fileLetezik();
            }
        
        }
        
        try {
            ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("g1.bin"));
            objKi.writeObject(g1);
            objKi.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Program_NEW.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Program_NEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        g1 = null;
        
        try {
            ObjectInputStream objBe = new ObjectInputStream(new FileInputStream("g1.bin"));
            g1 = (Galeria_NEW)objBe.readObject();
            
            objBe.close();
            
            System.out.println("Visszaállítás:");
            for (KiallitasiTargy_NEW targy : g1) {
                System.out.println(targy);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Program_NEW.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Program_NEW.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Program_NEW.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
