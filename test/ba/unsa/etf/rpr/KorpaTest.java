package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class KorpaTest {


    @Test
    void testDodajArtikl(){

        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Televizija", 200, "33"));
        assertEquals(1, korpa.Broj_Artikala_U_Korpi);
    }

    @Test
    void testIzbaciArtiklSaKodom(){

        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Olovka", 2, "4"));
        korpa.izbaciArtiklSaKodom("4");
        assertEquals(0, korpa.Broj_Artikala_U_Korpi);

    }

    @Test
    void testDajUkupnuCijenuArtikala(){

        Korpa korpa = new Korpa();
        for(int i=0; i<20; i++){
            korpa.dodajArtikl(new Artikl("Stolica", 25, "11"));
        }
        assertEquals(500, korpa.dajUkupnuCijenuArtikala());

    }

    @Test
    void testDaLiJeKorpaPuna(){

        Korpa korpa = new Korpa();
        for(int i=0; i<50; i++){
            korpa.dodajArtikl(new Artikl("Tepih", 44, "12"));

        }
        assertEquals(50, korpa.Broj_Artikala_U_Korpi);
    }

    @Test
    void testGetArtikli(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Jastuk", 7, "7"));
        assertArrayEquals(korpa.artikli, korpa.getArtikli());
    }


}