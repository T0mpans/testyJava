import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfrTest {

    @Test
    void testSzyfrujCezaremJezeliDanePodstawoweKluczDodatni() {
        Assertions.assertEquals("def",Szyfr.szyfrujCezarem("abc", 3));
    }
    @Test
    void testSzyfrujCezarem_JezeliZawijanie(){
        Assertions.assertEquals("abc", Szyfr.szyfrujCezarem("xyz",3));
    }
    @Test
    void testSzyfrujCezxaremJezeliOdszyfrofywanie(){
        Assertions.assertEquals("abc", Szyfr.szyfrujCezarem("def",-3));
    }
    @Test
    void testSzyfrujCezaremJezeliKluczWiekszyNizDlugoscAlfabetu(){
        Assertions.assertEquals("def",Szyfr.szyfrujCezarem("abc",29));
    }
    @Test
    void testSzyfrujCezaremJezeliSpacjaWTekscie(){
        Assertions.assertEquals("cd ef", Szyfr.szyfrujCezarem("ab cd", 2));
    }
    @Test
    void testSzyfrujCezaremJezeliZawijanieKluczUjemny(){
        Assertions.assertEquals("xyz",Szyfr.szyfrujCezarem("abc",-3));
    }
}