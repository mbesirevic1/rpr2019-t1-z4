package ba.unsa.etf.rpr;

public class Supermarket {

    protected Artikl[] artikli;
    protected int Broj_Artikala_U_Supermarketu;

    Supermarket(){

        artikli = new Artikl[1000];
        Broj_Artikala_U_Supermarketu = 0;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl artikl = null;
        for(int i=0; i<Broj_Artikala_U_Supermarketu; i++){
            if(kod.equals(artikli[i].getKod())){
                artikl = artikli[i];
                artikli[i] = null;
                for(int j=i; j<Broj_Artikala_U_Supermarketu; j++) artikli[j] = artikli[j+1];
                Broj_Artikala_U_Supermarketu--;
                break;
            }
        }

        return artikl;
    }

    public Artikl[] getArtikli(){

        return artikli;
    }

    public boolean dodajArtikl(Artikl artikl){

        if(Broj_Artikala_U_Supermarketu==1000){
            return false;
        }
        else {
            artikli[Broj_Artikala_U_Supermarketu] = artikl;
            Broj_Artikala_U_Supermarketu++;
            return true;
        }
    }
}
