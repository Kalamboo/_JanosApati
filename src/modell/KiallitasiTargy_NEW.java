/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import java.text.Collator;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author 36204
 */
class KeszitoComparator implements Comparator<KiallitasiTargy_NEW>{
    @Override
    public int compare(KiallitasiTargy_NEW o1, KiallitasiTargy_NEW o2) {
        Collator coll = Collator.getInstance();
        return coll.compare(o1.getKeszito(), o2.getKeszito());
    }
}

class CimComparator implements Comparator<KiallitasiTargy_NEW>{
    @Override
    public int compare(KiallitasiTargy_NEW o1, KiallitasiTargy_NEW o2) {
        Collator coll = Collator.getInstance();
        return coll.compare(o1.getCim(), o2.getCim());
    }
}

public abstract class KiallitasiTargy_NEW {
    private LocalDate datum;
    private String keszito, cim;

    public KiallitasiTargy_NEW(LocalDate datum, String keszito, String cim) throws HibasDatumExctension_NEW{
        if (datum.isAfter(LocalDate.now())) {
            throw new HibasDatumExctension_NEW("Hibás dárum megadása!");
        }
        this.datum = datum;
        this.keszito = keszito;
        this.cim = cim;
    }

    public KiallitasiTargy_NEW(String keszito, String cim) throws HibasDatumExctension_NEW {
        this(LocalDate.now(), keszito, cim);
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }
    
    public static CimComparator cimRendezo(){
        return new CimComparator();
    } 
    
    public static KeszitoComparator keszRendezo(){
        return new KeszitoComparator();
    }

    @Override
    public String toString() {
        return "KiallitasiTargy_NEW{" + "datum=" + datum + ", keszito=" + keszito + ", cim=" + cim + '}';
    }
    
    
}
