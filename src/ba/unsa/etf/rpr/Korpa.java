package ba.unsa.etf.rpr;

public class Korpa {

    protected Artikl[] artikli;
    protected int Broj_Artikala_U_Korpi;

    Korpa(){
        artikli = new Artikl[50];
        Broj_Artikala_U_Korpi = 0;
    }
    public Artikl izbaciArtiklSaKodom(String kod){

        Artikl artikl = null;
        for(int i=0; i<Broj_Artikala_U_Korpi; i++){
            if(kod.equals(artikli[i].getKod())){
                artikl = artikli[i];
                artikli[i] = null;
                for(int j=i; j<Broj_Artikala_U_Korpi; j++) artikli[j] = artikli[j+1];
                Broj_Artikala_U_Korpi--;
                break;
            }
        }

        return artikl;
    }

    public int dajUkupnuCijenuArtikala(){
        int cijena = 0;
        for(int i=0; i<Broj_Artikala_U_Korpi; i++){
            cijena = cijena + artikli[i].getCijena();
        }

        return cijena;
    }

    public Artikl[] getArtikli(){
        return artikli;
    }

    public boolean dodajArtikl(Artikl artikl){

        if(Broj_Artikala_U_Korpi==50) {
            return false;
        }
        else {
            artikli[Broj_Artikala_U_Korpi] = artikl;
            Broj_Artikala_U_Korpi++;
            return true;
        }
    }




}
