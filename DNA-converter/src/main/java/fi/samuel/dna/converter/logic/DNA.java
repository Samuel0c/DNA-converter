package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

/**
 * DNA contains the base sequence that determines the amino acids and their
 * order in a protein primary structure.
 *
 * It is assumed that only protein coding sequences, exons, are analysed.
 *
 */
public class DNA {

    private final ArrayList<Base> dnaBaseSequence;

    /**
     *Creates new DNA strand and stores the bases, which forms the DNA strand, in a list.
     * 
     * @param dnaSequence A string that represents the base sequence of segment
     * of the coding strand of DNA
     */
    public DNA(String dnaSequence) {
        this.dnaBaseSequence = new ArrayList();
        for (int i = 0; i < dnaSequence.length(); i++) {
            dnaBaseSequence.add(new Base(dnaSequence.charAt(i)));
        }
    }

    public ArrayList<Base> getDnaSequence() {
        return dnaBaseSequence;
    }

    /**
     * Gives the percentage of purine bases in the studied DNA segment.
     *
     * @return The percentage as integer
     */
    public int purinePercentage() {
        if (this.dnaBaseSequence.isEmpty()) {
            return 0;
        }
        int numberOfPurineBases = 0;
        for (Base current : this.dnaBaseSequence) {
            if (current.isPurine()) {
                numberOfPurineBases++;
            }
        }
        return (int) (1.0 * numberOfPurineBases / this.dnaBaseSequence.size() * 100);
    }

    /**
     *Gives the percentage of pyrimidine bases in the studied DNA segment.
     * 
     * @return The percentage as integer
     */
    public int pyrimidinePercentage() {
        if (this.dnaBaseSequence.isEmpty()) {
            return 0;
        }
        return 100 - this.purinePercentage();
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
