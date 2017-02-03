package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

public class DNA {

    private final ArrayList<Base> dnaBaseSequence;

    public DNA(String dnaSequence) {
        this.dnaBaseSequence = new ArrayList();
        for (int i = 0; i < dnaSequence.length(); i++) {
            dnaBaseSequence.add(new Base(dnaSequence.charAt(i)));
        }
    }

    public ArrayList<Base> getDnaSequence() {
        return dnaBaseSequence;
    }

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

    public int pyrimidinePercentage() {
        if (this.dnaBaseSequence.isEmpty()) {
            return 0;
        }
        return 100 - this.purinePercentage();
    }

}
