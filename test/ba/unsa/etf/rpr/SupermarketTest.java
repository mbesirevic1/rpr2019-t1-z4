package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SupermarketTest {

    @Test
    void testIzbaciArtiklSaKodom(){

        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Jabuka", 3, "14"));
        supermarket.izbaciArtiklSaKodom("14");
        assertEquals(0, supermarket.Broj_Artikala_U_Supermarketu);

    }

    @Test
    void testDodajArtiklUSupermarket(){
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Sladoled", 8, "20"));
        assertEquals(1,supermarket.Broj_Artikala_U_Supermarketu);

    }

}