package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

/**
 * MessengerRNA carries the information obtained from DNA to transferRNA.
 *
 * The base sequence is complementary to DNA, but instead of thymine, mRNA
 * contains uracil.
 *
 */
public class MessengerRNA {

    private ArrayList<Base> mRnaSequence;

    /**
     * Creates new MessengerRNA strand and stores the bases of mRNA in a list.
     *
     * @param dna The base sequence of DNA determines the base sequence of
     * corresponding mRNA sequence.
     */
    public MessengerRNA(DNA dna) {
        this.mRnaSequence = new ArrayList();
        for (int i = 0; i < dna.getDnaSequence().size(); i++) {
            mRnaSequence.add(dna.getDnaSequence().get(i).complementaryBase());
        }
    }

    /**
     * Gives the base sequence from which the mRNA sequence is made up.
     * @return Returns the base sequence as ArrayList.
     */
    public ArrayList<Base> getmRnaSequence() {
        return mRnaSequence;
    }

    @Override
    public String toString() {
        String mrnaSequence = "";
        for (Base c : this.getmRnaSequence()) {
            mrnaSequence += c.getNucleobase();
        }
        return mrnaSequence;
    }

}
