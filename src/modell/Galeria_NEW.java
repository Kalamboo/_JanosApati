/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 36204
 */
public class Galeria_NEW implements Iterable<KiallitasiTargy_NEW>, Serializable{
    private ArrayList<KiallitasiTargy_NEW> lista;

    public Galeria_NEW() {
        lista = new ArrayList<>();
        try {
            Festmeny_NEW f1 = new Festmeny_NEW("keszito4", "cim2");
            Festmeny_NEW f2 = new Festmeny_NEW(LocalDate.now(), "keszito1", "cim5");
            //Festmeny_NEW f3 = new Festmeny_NEW(LocalDate.now().plusYears(2), "keszito2", "cim3");
            Festmeny_NEW f4 = new Festmeny_NEW(new File("random.txt"), "keszito5", "cim1");
            Festmeny_NEW f5 = new Festmeny_NEW(new File("random.txt"), LocalDate.now(), "keszito3", "cim4");
            
            /*
            lista.add(new Festmeny_NEW("keszito4", "cim2"));
            lista.add(new Festmeny_NEW(LocalDate.now(), "keszito1", "cim5"));
            //lista.add(new Festmeny_NEW(LocalDate.now().plusYears(2), "keszito2", "cim3"));
            lista.add(new Festmeny_NEW(new File("random.txt"), "keszito5", "cim1"));
            lista.add(new Festmeny_NEW(new File("random.txt"), LocalDate.now(), "keszito3", "cim4"));
            */
            
            lista.add(f1);
            lista.add(f2);
            //lista.add(f3);
            lista.add(f4);
            lista.add(f5);
            
        } catch (HibasDatumExctension_NEW ex) {
            Logger.getLogger(Galeria_NEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void felvesz(KiallitasiTargy_NEW targy){
        lista.add(targy);
    }

    @Override
    public Iterator<KiallitasiTargy_NEW> iterator() {
        return Collections.unmodifiableList(lista).iterator();
    }
    
    public List<KiallitasiTargy_NEW> rendezCimSzerint(){
        Collections.sort(lista, KiallitasiTargy_NEW.cimRendezo());
        return Collections.unmodifiableList(lista);
    }
    
    public List<KiallitasiTargy_NEW> rendezKeszitoSzerint(){
        Collections.sort(lista, KiallitasiTargy_NEW.keszRendezo());
        return Collections.unmodifiableList(lista);
    }
}
