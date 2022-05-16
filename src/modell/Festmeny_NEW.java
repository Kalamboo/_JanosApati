package modell;

import java.io.File;
import java.time.LocalDate;

public class Festmeny_NEW extends KiallitasiTargy_NEW{
    
    private File eleresiUt;

    public Festmeny_NEW(String keszito, String cim) throws HibasDatumExctension_NEW{
        this(new File("nincs"), keszito, cim);
    }

    public Festmeny_NEW(File eleresiUt, String keszito, String cim) throws HibasDatumExctension_NEW {
        this(eleresiUt, LocalDate.now(), keszito, cim);
    }
    
    public Festmeny_NEW(LocalDate datum, String keszito, String cim) throws HibasDatumExctension_NEW {
        this(new File("nincs"), datum, keszito, cim);
    }

    public Festmeny_NEW(File eleresiUt, LocalDate datum, String keszito, String cim) throws HibasDatumExctension_NEW {
        super(datum, keszito, cim);
        this.eleresiUt = eleresiUt;
    }
    
    public void fileLetezik(){
        if(eleresiUt.exists()) {
            System.out.println("Megjelenítés folyamatban..");
        }else{
            System.out.println("Nem lehet megjeleníteni!");
        }
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "Festmeny_NEW{" + "eleresiUt=" + eleresiUt + '}';
    }
    
    
    
}
