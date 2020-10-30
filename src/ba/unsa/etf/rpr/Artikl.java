package ba.unsa.etf.rpr;

public class Artikl {

    private String naziv;
    private int cijena;
    private String kod;



    public Artikl(String naziv, int cijena, String kod){
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public final String dajNaziv(){
        return naziv;
    }
    public final int dajCijenu(){
        return cijena;
    }
    public final String dajKod(){
        return kod;
    }
}
