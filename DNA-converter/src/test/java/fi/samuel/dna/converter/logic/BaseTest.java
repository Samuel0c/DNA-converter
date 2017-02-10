
package fi.samuel.dna.converter.logic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import fi.samuel.dna.converter.logic.Base;

public class BaseTest {
    
    private Base adenine;
    private Base thymine;
    private Base guanine;
    private Base cytosine;
    private Base uracil;
    
    public BaseTest() {
    }
    
    @Before
    public void setUp() {
        adenine = new Base('A');
        thymine = new Base('T');
        guanine = new Base('G');
        cytosine = new Base('C');
        uracil = new Base('U');
    }
    
    @Test
    public void adenineHasCorrectBase() {
        assertEquals('A', this.adenine.getNucleobase());
    }
    @Test
    public void thymineHasCorrectBase() {
        assertEquals('T', this.thymine.getNucleobase());
    }
    @Test
    public void guanineHasCorrectBase() {
        assertEquals('G', this.guanine.getNucleobase());
    }
    @Test
    public void cytosineHasCorrectBase() {
        assertEquals('C', this.cytosine.getNucleobase());
    }
    @Test
    public void uracilHasCorrectBase() {
        assertEquals('U', this.uracil.getNucleobase());
    }
    
    @Test
    public void adenineHasCorrectComplementaryBase() {
        assertEquals('U', this.adenine.complementaryBase().getNucleobase());
    }
    
    @Test
    public void guanineHasCorrectComplementaryBase() {
        assertEquals('C', this.guanine.complementaryBase().getNucleobase());
    }
    
    @Test
    public void thymineHasCorrectComplementaryBase() {
        assertEquals('A', this.thymine.complementaryBase().getNucleobase());
    }
    
    @Test
    public void cytosineHasCorrectComplementaryBase() {
        assertEquals('G', this.cytosine.complementaryBase().getNucleobase());
    }
    
    @Test
    public void uracilHasCorrectComplementaryBase() {
        assertEquals('A', this.uracil.complementaryBase().getNucleobase());
    }

}
