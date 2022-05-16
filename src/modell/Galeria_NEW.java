/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author 36204
 */
public class Galeria_NEW implements Iterable<KiallitasiTargy_NEW>, Serializable{
    private ArrayList<KiallitasiTargy_NEW> lista;

    public Galeria_NEW() {
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
