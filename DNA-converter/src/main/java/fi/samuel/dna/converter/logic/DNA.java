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
     *
     * @param dnaSequence
     */
    public DNA(String dnaSequence) {
        this.dnaBaseSequence = new ArrayList();
        for (int i = 0; i < dnaSequence.length(); i++) {
            dnaBaseSequence.add(new Base(dnaSequence.charAt(i)));
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Base> getDnaSequence() {
        return dnaBaseSequence;
    }

    /**
     *
     * @return
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
     *
     * @return
     */
    public int pyrimidinePercentage() {
        if (this.dnaBaseSequence.isEmpty()) {
            return 0;
        }
        return 100 - this.purinePercentage();
    }

}
