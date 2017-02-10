package fi.samuel.dna.converter.logic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

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
    
    private TransferRNA tRNA17;
    private TransferRNA tRNA18;
    private TransferRNA tRNA19;
    private TransferRNA tRNA20;

    private TransferRNA tRNA21;
    private TransferRNA tRNA22;
    private TransferRNA tRNA23;
    private TransferRNA tRNA24;

    private TransferRNA tRNA25;
    private TransferRNA tRNA26;
    private TransferRNA tRNA27;
    private TransferRNA tRNA28;

    private TransferRNA tRNA29;
    private TransferRNA tRNA30;
    private TransferRNA tRNA31;
    private TransferRNA tRNA32;
    
    private TransferRNA tRNA33;
    private TransferRNA tRNA34;
    private TransferRNA tRNA35;
    private TransferRNA tRNA36;

    private TransferRNA tRNA37;
    private TransferRNA tRNA38;
    private TransferRNA tRNA39;
    private TransferRNA tRNA40;

    private TransferRNA tRNA41;
    private TransferRNA tRNA42;
    private TransferRNA tRNA43;
    private TransferRNA tRNA44;

    private TransferRNA tRNA45;
    private TransferRNA tRNA46;
    private TransferRNA tRNA47;
    private TransferRNA tRNA48;
    
    private TransferRNA tRNA49;
    private TransferRNA tRNA50;
    private TransferRNA tRNA51;
    private TransferRNA tRNA52;
    
    private TransferRNA tRNA53;
    private TransferRNA tRNA54;
    private TransferRNA tRNA55;
    private TransferRNA tRNA56;
    
    private TransferRNA tRNA57;
    private TransferRNA tRNA58;
    private TransferRNA tRNA59;
    private TransferRNA tRNA60;
    
    private TransferRNA tRNA61;
    private TransferRNA tRNA62;
    private TransferRNA tRNA63;
    private TransferRNA tRNA64;
    
    private TransferRNA tRNA65;
    private TransferRNA tRNA66;
    private TransferRNA tRNA67;
    
    private TransferRNA emptyTRna;
    private TransferRNA tRnaLengthNotDivisibleByThreeRemainderOne;
    private TransferRNA tRnaLengthNotDivisibleByThreeRemainderTwo;

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
        
        
        tRNA17 = new TransferRNA(new MessengerRNA(new DNA("CTT")));
        tRNA18 = new TransferRNA(new MessengerRNA(new DNA("CTC")));
        tRNA19 = new TransferRNA(new MessengerRNA(new DNA("CTA")));
        tRNA20 = new TransferRNA(new MessengerRNA(new DNA("CTG")));

        tRNA21 = new TransferRNA(new MessengerRNA(new DNA("CCT")));
        tRNA22 = new TransferRNA(new MessengerRNA(new DNA("CCA")));
        tRNA23 = new TransferRNA(new MessengerRNA(new DNA("CCC")));
        tRNA24 = new TransferRNA(new MessengerRNA(new DNA("CCG")));

        tRNA25 = new TransferRNA(new MessengerRNA(new DNA("CAT")));
        tRNA26 = new TransferRNA(new MessengerRNA(new DNA("CAC")));
        tRNA27 = new TransferRNA(new MessengerRNA(new DNA("CAA")));
        tRNA28 = new TransferRNA(new MessengerRNA(new DNA("CAG")));

        tRNA29 = new TransferRNA(new MessengerRNA(new DNA("CGT")));
        tRNA30 = new TransferRNA(new MessengerRNA(new DNA("CGC")));
        tRNA31 = new TransferRNA(new MessengerRNA(new DNA("CGA")));
        tRNA32 = new TransferRNA(new MessengerRNA(new DNA("CGG")));
        
        
        tRNA33 = new TransferRNA(new MessengerRNA(new DNA("ATT")));
        tRNA34 = new TransferRNA(new MessengerRNA(new DNA("ATC")));
        tRNA35 = new TransferRNA(new MessengerRNA(new DNA("ATA")));
        tRNA36 = new TransferRNA(new MessengerRNA(new DNA("ATG")));

        tRNA37 = new TransferRNA(new MessengerRNA(new DNA("ACT")));
        tRNA38 = new TransferRNA(new MessengerRNA(new DNA("ACA")));
        tRNA39 = new TransferRNA(new MessengerRNA(new DNA("ACC")));
        tRNA40 = new TransferRNA(new MessengerRNA(new DNA("ACG")));

        tRNA41 = new TransferRNA(new MessengerRNA(new DNA("AAT")));
        tRNA42 = new TransferRNA(new MessengerRNA(new DNA("AAC")));
        tRNA43 = new TransferRNA(new MessengerRNA(new DNA("AAA")));
        tRNA44 = new TransferRNA(new MessengerRNA(new DNA("AAG")));

        tRNA45 = new TransferRNA(new MessengerRNA(new DNA("AGT")));
        tRNA46 = new TransferRNA(new MessengerRNA(new DNA("AGC")));
        tRNA47 = new TransferRNA(new MessengerRNA(new DNA("AGA")));
        tRNA48 = new TransferRNA(new MessengerRNA(new DNA("AGG")));
        
        
        tRNA49 = new TransferRNA(new MessengerRNA(new DNA("GTT")));
        tRNA50 = new TransferRNA(new MessengerRNA(new DNA("GTC")));
        tRNA51 = new TransferRNA(new MessengerRNA(new DNA("GTA")));
        tRNA52 = new TransferRNA(new MessengerRNA(new DNA("GTG")));

        tRNA53 = new TransferRNA(new MessengerRNA(new DNA("GCT")));
        tRNA54 = new TransferRNA(new MessengerRNA(new DNA("GCA")));
        tRNA55 = new TransferRNA(new MessengerRNA(new DNA("GCC")));
        tRNA56 = new TransferRNA(new MessengerRNA(new DNA("GCG")));

        tRNA57 = new TransferRNA(new MessengerRNA(new DNA("GAT")));
        tRNA58 = new TransferRNA(new MessengerRNA(new DNA("GAC")));
        tRNA59 = new TransferRNA(new MessengerRNA(new DNA("GAA")));
        tRNA60 = new TransferRNA(new MessengerRNA(new DNA("GAG")));

        tRNA61 = new TransferRNA(new MessengerRNA(new DNA("GGT")));
        tRNA62 = new TransferRNA(new MessengerRNA(new DNA("GGC")));
        tRNA63 = new TransferRNA(new MessengerRNA(new DNA("GGA")));
        tRNA64 = new TransferRNA(new MessengerRNA(new DNA("GGG")));
        
        
        tRNA65 = new TransferRNA(new MessengerRNA(new DNA("TAA")));
        tRNA66 = new TransferRNA(new MessengerRNA(new DNA("TAG")));
        tRNA67 = new TransferRNA(new MessengerRNA(new DNA("TGA")));
        
        emptyTRna = new TransferRNA(new MessengerRNA(new DNA("")));
        tRnaLengthNotDivisibleByThreeRemainderOne = new TransferRNA(new MessengerRNA(new DNA("TTTAAAGGGC")));
        tRnaLengthNotDivisibleByThreeRemainderTwo = new TransferRNA(new MessengerRNA(new DNA("TTTAAAGGGCC")));
    }
    
    @Test
    public void doesNotReturnAminoAcidsWhenEmpty() {
        assertEquals(0, new Protein(emptyTRna).getAminoAcidSequence().size());
    }
    
    @Test
    public void correctNumberOfAminoAcidsWhenNumberOfBasesInDnaSequenceIsNotDivisibleByThree() {
        assertEquals(3, new Protein(tRnaLengthNotDivisibleByThreeRemainderOne).getAminoAcidSequence().size());
    }
    
    @Test
    public void correctNumberOfAminoAcidsWhenNumberOfBasesInDnaSequenceIsNotDivisibleByThreeRemainderTwo() {
        assertEquals(3, new Protein(tRnaLengthNotDivisibleByThreeRemainderTwo).getAminoAcidSequence().size());
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
    
    @Test
    public void cttCorrespondsToLeucine() {
        assertEquals("Leucine", new Protein(tRNA17).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ctcCorrespondsToLeucine() {
        assertEquals("Leucine", new Protein(tRNA18).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ctaCorrespondsToLeucine() {
        assertEquals("Leucine", new Protein(tRNA19).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ctgCorrespondsToLeucine() {
        assertEquals("Leucine", new Protein(tRNA20).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ccuCorrespondsToProline() {
        assertEquals("Proline", new Protein(tRNA21).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void cccCorrespondsToProline() {
        assertEquals("Proline", new Protein(tRNA22).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ccaCorrespondsToProline() {
        assertEquals("Proline", new Protein(tRNA23).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ccgCorrespondsToProline() {
        assertEquals("Proline", new Protein(tRNA24).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void catCorrespondsToHistidine() {
        assertEquals("Histidine", new Protein(tRNA25).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void cacCorrespondsToHistidine() {
        assertEquals("Histidine", new Protein(tRNA26).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void caaCorrespondsToGlutamine() {
        assertEquals("Glutamine", new Protein(tRNA27).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void cagCorrespondsToGlutamine() {
        assertEquals("Glutamine", new Protein(tRNA28).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void cgtCorrespondsToArginine() {
        assertEquals("Arginine", new Protein(tRNA29).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void cgcCorrespondsToArginine() {
        assertEquals("Arginine", new Protein(tRNA30).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void cgaCorrespondsToArginine() {
        assertEquals("Arginine", new Protein(tRNA31).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void cggCorrespondsToArginine() {
        assertEquals("Arginine", new Protein(tRNA32).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void attCorrespondsToIsoleucine() {
        assertEquals("Isoleucine", new Protein(tRNA33).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void atcCorrespondsToIsoleucine() {
        assertEquals("Isoleucine", new Protein(tRNA34).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ataCorrespondsToIsoleucine() {
        assertEquals("Isoleucine", new Protein(tRNA35).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void atgCorrespondsToMethionine() {
        assertEquals("Methionine", new Protein(tRNA36).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void actCorrespondsToThreonine() {
        assertEquals("Threonine", new Protein(tRNA37).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void accCorrespondsToThreonine() {
        assertEquals("Threonine", new Protein(tRNA38).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void acaCorrespondsToThreonine() {
        assertEquals("Threonine", new Protein(tRNA39).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void acgCorrespondsToThreonine() {
        assertEquals("Threonine", new Protein(tRNA40).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void aatCorrespondsToAsparagine() {
        assertEquals("Asparagine", new Protein(tRNA41).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void aacCorrespondsToAsparagine() {
        assertEquals("Asparagine", new Protein(tRNA42).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void aaaCorrespondsToLysine() {
        assertEquals("Lysine", new Protein(tRNA43).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void aagCorrespondsToLysine() {
        assertEquals("Lysine", new Protein(tRNA44).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void agtCorrespondsToSerine() {
        assertEquals("Serine", new Protein(tRNA45).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void agcCorrespondsToSerine() {
        assertEquals("Serine", new Protein(tRNA46).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void agaCorrespondsToArginine() {
        assertEquals("Arginine", new Protein(tRNA47).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void aggCorrespondsToArginine() {
        assertEquals("Arginine", new Protein(tRNA48).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gttCorrespondsToValine() {
        assertEquals("Valine", new Protein(tRNA49).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gtcCorrespondsToValine() {
        assertEquals("Valine", new Protein(tRNA50).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gtaCorrespondsToValine() {
        assertEquals("Valine", new Protein(tRNA51).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gtgCorrespondsToValine() {
        assertEquals("Valine", new Protein(tRNA52).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gctCorrespondsToAlanine() {
        assertEquals("Alanine", new Protein(tRNA53).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gccCorrespondsToAlanine() {
        assertEquals("Alanine", new Protein(tRNA54).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gcaCorrespondsToAlanine() {
        assertEquals("Alanine", new Protein(tRNA55).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gcgCorrespondsToAlanine() {
        assertEquals("Alanine", new Protein(tRNA56).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gatCorrespondsToAsparticAcid() {
        assertEquals("Aspartic acid", new Protein(tRNA57).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gacCorrespondsToAsparticAcid() {
        assertEquals("Aspartic acid", new Protein(tRNA58).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gaaCorrespondsToGlutamicAcid() {
        assertEquals("Glutamic acid", new Protein(tRNA59).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gagCorrespondsToGlutamicAcid() {
        assertEquals("Glutamic acid", new Protein(tRNA60).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ggtCorrespondsToGlycine() {
        assertEquals("Glycine", new Protein(tRNA61).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ggcCorrespondsToGlycine() {
        assertEquals("Glycine", new Protein(tRNA62).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void ggaCorrespondsToGlycine() {
        assertEquals("Glycine", new Protein(tRNA63).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void gggCorrespondsToGlycine() {
        assertEquals("Glycine", new Protein(tRNA64).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void taaEndsAminoAcidSequence() {
        assertEquals("STOP", new Protein(tRNA65).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tagEndsAminoAcidSequence() {
        assertEquals("STOP", new Protein(tRNA66).getAminoAcidSequence().get(0));
    }
    
    @Test
    public void tgaEndsAminoAcidSequence() {
        assertEquals("STOP", new Protein(tRNA67).getAminoAcidSequence().get(0));
    }

}
