package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] artikli;
    private int broj_artikala_u_korpi;

    Korpa(){
        artikli = new Artikl[50];
        broj_artikala_u_korpi = 0;
    }
    public Artikl izbaciArtkilSaKodom(String kod){

        Artikl a = null;
        for(int i=0; i<broj_artikala_u_korpi; i++){
            if(artikli[i].dajKod().equals(kod)){
                a = artikli[i];
                artikli[i] = null;
                broj_artikala_u_korpi--;
                break;
            }
        }

        return a;
    }

    public final int dajUkupnuCijenuArtikala(){
        int cijena = 0;
        for(int i=0; i<broj_artikala_u_korpi; i++){
            cijena += artikli[i].dajCijenu();
        }

        return cijena;
    }





}
