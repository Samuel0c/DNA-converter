
package fi.samuel.dna.converter.logictest;

import fi.samuel.dna.converter.logic.DNA;
import fi.samuel.dna.converter.logic.Protein;
import fi.samuel.dna.converter.logic.mRNA;
import fi.samuel.dna.converter.logic.tRNA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ProteinTest {
    
    private tRNA tRNA1;
    private tRNA tRNA2;
    private tRNA tRNA3;
    private tRNA tRNA4;
    
    private tRNA tRNA5;
    private tRNA tRNA6;
    private tRNA tRNA7;
    private tRNA tRNA8;
    
    
    public ProteinTest() {
    }
    
    @Before
    public void setUp() {
        tRNA1 = new tRNA(new mRNA(new DNA("TTT")));
        tRNA2 = new tRNA(new mRNA(new DNA("TTC")));
        tRNA3 = new tRNA(new mRNA(new DNA("TTA")));
        tRNA4 = new tRNA(new mRNA(new DNA("TTG")));
        
        tRNA5 = new tRNA(new mRNA(new DNA("TCT")));
        tRNA6 = new tRNA(new mRNA(new DNA("TCA")));
        tRNA7 = new tRNA(new mRNA(new DNA("TCC")));
        tRNA8 = new tRNA(new mRNA(new DNA("TCG")));
    }
    
    @Test
    public void tttCorrespondsToPhenylalanine () {
        assertEquals("Phenylalanine", new Protein(tRNA1).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ttcCorrespondsToPhenylalanine () {
        assertEquals("Phenylalanine", new Protein(tRNA2).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ttaCorrespondsToLeucine () {
        assertEquals("Leucine", new Protein(tRNA3).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ttgCorrespondsToLeucine () {
        assertEquals("Leucine", new Protein(tRNA4).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tctCorrespondsToSerine() {
        assertEquals("Serine", new Protein(tRNA5).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tccCorrespondsToSerine() {
        assertEquals("Serine", new Protein(tRNA6).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tcaCorrespondsToSerine() {
        assertEquals("Serine", new Protein(tRNA7).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tcgCorrespondsToSerine() {
        assertEquals("Serine", new Protein(tRNA8).getAminoAcidSequence().get(0));
    }

}
