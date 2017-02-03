
package fi.samuel.dna.converter.logictest;

import fi.samuel.dna.converter.logic.Base;
import fi.samuel.dna.converter.logic.DNA;
import fi.samuel.dna.converter.logic.MessengerRNA;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class mRNATest {
    
    private MessengerRNA mRNA1;
    private MessengerRNA mRNA2;
    private MessengerRNA mRNA3;
    
    
    public mRNATest() {
    }
    
    @Before
    public void setUp() {
        DNA dna1 = new DNA("TCTGGG");
        mRNA1 = new MessengerRNA(dna1);
        DNA dna2 = new DNA("AAA");
        mRNA2 = new MessengerRNA(dna2);
        DNA dna3 = new DNA("");
        mRNA3 = new MessengerRNA(dna3);
    }
    
    @Test
    public void getMRnaSequenceHasCorrectSize () {
        assertEquals(6, mRNA1.getmRnaSequence().size());
    }
    
    @Test
    public void getMRnaSequenceHasCorrectSizeWhenEmpty () {
        assertEquals(0, mRNA3.getmRnaSequence().size());
    }
    
    @Test
    public void mRnaSequenceDoesNotContainThymine () {
        for (Base current : mRNA2.getmRnaSequence()) {
            assertEquals(true, current.getNucleobase() != 'T');
        }
    }

}
