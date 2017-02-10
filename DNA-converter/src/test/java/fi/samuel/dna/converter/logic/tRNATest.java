
package fi.samuel.dna.converter.logic;

import fi.samuel.dna.converter.logic.DNA;
import fi.samuel.dna.converter.logic.MessengerRNA;
import fi.samuel.dna.converter.logic.TransferRNA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samleppi
 */
public class tRNATest {
    
    private TransferRNA tRNA1;
    private TransferRNA tRNA2;
    
    public tRNATest() {
    }
    
    @Before
    public void setUp() {
        DNA dna1 = new DNA("TCTCAA");
        MessengerRNA mRNA1 = new MessengerRNA(dna1);
        tRNA1 = new TransferRNA(mRNA1);
        DNA dna2 = new DNA("");
        MessengerRNA mRNA2 = new MessengerRNA(dna2);
        tRNA2 = new TransferRNA(mRNA2);
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
