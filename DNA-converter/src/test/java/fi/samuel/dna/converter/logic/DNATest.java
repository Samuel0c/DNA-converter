
package fi.samuel.dna.converter.logic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import fi.samuel.dna.converter.logic.DNA;

public class DNATest {
    
    private DNA dna1;
    private DNA dna2;
    private DNA dna3;
    
    public DNATest() {
    }

    @Before
    public void setUp() {
        dna1 = new DNA("AACTGG");
        dna2 = new DNA("TTTTTT");
        dna3 = new DNA("");
    }


    @Test
    public void getDnaSequenceHasCorrectSize () {
        assertEquals(6, dna1.getDnaSequence().size());
    }
    
    @Test
    public void getDnaSequenceHasCorrectSizeWhenEmpty () {
        assertEquals(0, dna3.getDnaSequence().size());
    }
    
    @Test
    public void purinePercentageReturnsCorrectValue () {
        assertEquals(66, dna1.purinePercentage());
    }
    
    @Test
    public void purinePercentageReturnsCorrectValueWhenTheSequenceIsEmpty () {
        assertEquals(0, dna3.purinePercentage());
    }
    
    @Test
    public void pyrimidinePercentageReturnsCorrectValue () {
        assertEquals(100, dna2.pyrimidinePercentage());
    }
    
    @Test
    public void pyrimidinePercentageDoesNotExceed100 () {
        assertTrue(dna2.pyrimidinePercentage() <= 100);
    }
    
    @Test
    public void pyrimidinePercentageReturnsCorrectValueWhenTheSequenceIsEmpty () {
        assertEquals(0, dna3.pyrimidinePercentage());
    }
    
}
