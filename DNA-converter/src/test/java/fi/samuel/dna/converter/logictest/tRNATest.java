
package fi.samuel.dna.converter.logictest;

import fi.samuel.dna.converter.logic.DNA;
import fi.samuel.dna.converter.logic.mRNA;
import fi.samuel.dna.converter.logic.tRNA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samleppi
 */
public class tRNATest {
    
    private tRNA tRNA1;
    private tRNA tRNA2;
    
    public tRNATest() {
    }
    
    @Before
    public void setUp() {
        DNA dna1 = new DNA("TCTCAA");
        mRNA mRNA1 = new mRNA(dna1);
        tRNA1 = new tRNA(mRNA1);
        DNA dna2 = new DNA("");
        mRNA mRNA2 = new mRNA(dna2);
        tRNA2 = new tRNA(mRNA2);
    }
    
    @Test
    public void getTRnaSequenceHasCorrectSize () {
        assertEquals(6, tRNA1.gettRnaSequence().size());
    }
    
    @Test
    public void getTRnaSequenceHasCorrectSizeWhenEmpty () {
        assertEquals(0, tRNA2.gettRnaSequence().size());
    }
}
