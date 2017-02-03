package fi.samuel.dna.converter.logictest;

import fi.samuel.dna.converter.logic.DNA;
import fi.samuel.dna.converter.logic.Protein;
import fi.samuel.dna.converter.logic.MessengerRNA;
import fi.samuel.dna.converter.logic.TransferRNA;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class ProteinTest {

    private TransferRNA tRNA1;
    private TransferRNA tRNA2;
    private TransferRNA tRNA3;
    private TransferRNA tRNA4;

    private TransferRNA tRNA5;
    private TransferRNA tRNA6;
    private TransferRNA tRNA7;
    private TransferRNA tRNA8;

    private TransferRNA tRNA9;
    private TransferRNA tRNA10;
    private TransferRNA tRNA11;
    private TransferRNA tRNA12;

    private TransferRNA tRNA13;
    private TransferRNA tRNA14;
    private TransferRNA tRNA15;
    private TransferRNA tRNA16;

    public ProteinTest() {
    }

    @Before
    public void setUp() {
        tRNA1 = new TransferRNA(new MessengerRNA(new DNA("TTT")));
        tRNA2 = new TransferRNA(new MessengerRNA(new DNA("TTC")));
        tRNA3 = new TransferRNA(new MessengerRNA(new DNA("TTA")));
        tRNA4 = new TransferRNA(new MessengerRNA(new DNA("TTG")));

        tRNA5 = new TransferRNA(new MessengerRNA(new DNA("TCT")));
        tRNA6 = new TransferRNA(new MessengerRNA(new DNA("TCA")));
        tRNA7 = new TransferRNA(new MessengerRNA(new DNA("TCC")));
        tRNA8 = new TransferRNA(new MessengerRNA(new DNA("TCG")));

        tRNA9 = new TransferRNA(new MessengerRNA(new DNA("TAT")));
        tRNA10 = new TransferRNA(new MessengerRNA(new DNA("TAC")));
        tRNA11 = new TransferRNA(new MessengerRNA(new DNA("TAA")));
        tRNA12 = new TransferRNA(new MessengerRNA(new DNA("TAG")));

        tRNA13 = new TransferRNA(new MessengerRNA(new DNA("TGT")));
        tRNA14 = new TransferRNA(new MessengerRNA(new DNA("TGC")));
        tRNA15 = new TransferRNA(new MessengerRNA(new DNA("TGA")));
        tRNA16 = new TransferRNA(new MessengerRNA(new DNA("TGG")));
    }

    @Test
    public void tttCorrespondsToPhenylalanine() {
        assertEquals("Phenylalanine", new Protein(tRNA1).getAminoAcidSequence().get(0));
    }

    @Test
    public void ttcCorrespondsToPhenylalanine() {
        assertEquals("Phenylalanine", new Protein(tRNA2).getAminoAcidSequence().get(0));
    }

    @Test
    public void ttaCorrespondsToLeucine() {
        assertEquals("Leucine", new Protein(tRNA3).getAminoAcidSequence().get(0));
    }

    @Test
    public void ttgCorrespondsToLeucine() {
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
    
    @Test
    public void tatCorrespondsToTyrosine() {
        assertEquals("Tyrosine", new Protein(tRNA9).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tacCorrespondsToTyrosine() {
        assertEquals("Tyrosine", new Protein(tRNA10).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void taaCorrespondsToStop() {
        assertEquals("STOP", new Protein(tRNA11).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tagCorrespondsToStop() {
        assertEquals("STOP", new Protein(tRNA12).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tgtCorrespondsToCysteine() {
        assertEquals("Cysteine", new Protein(tRNA13).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tgcCorrespondsToCysteine() {
        assertEquals("Cysteine", new Protein(tRNA14).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tgaCorrespondsToStop() {
        assertEquals("STOP", new Protein(tRNA15).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tggCorrespondsToTryptophan() {
        assertEquals("Tryptophan", new Protein(tRNA16).getAminoAcidSequence().get(0));
    }
    

}
