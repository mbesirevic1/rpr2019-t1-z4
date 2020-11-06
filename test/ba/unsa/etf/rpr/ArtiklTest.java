package ba.unsa.etf.rpr;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArtiklTest {

        @Test
        void testGetNaziv(){
            Artikl artikl = new Artikl("Kamera", 60, "25");
            assertEquals("Kamera", artikl.getNaziv());
        }

        @Test
        void testGetCijena(){
            Artikl artikl = new Artikl("Mikrofon", 40, "5");
            assertEquals(40, artikl.getCijena());
        }

        @Test
        void testGetKod(){
            Artikl artikl = new Artikl("Knjiga", 25, "33");
            assertEquals("33", artikl.getKod());

        }

}