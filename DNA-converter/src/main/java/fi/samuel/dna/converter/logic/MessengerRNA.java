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
     * @param dna 
     */
    public MessengerRNA(DNA dna) {
        this.mRnaSequence = new ArrayList();
        for (int i = 0; i < dna.getDnaSequence().size(); i++) {
            mRnaSequence.add(dna.getDnaSequence().get(i).complementaryBase());
        }
    }


    public ArrayList<Base> getmRnaSequence() {
        return mRnaSequence;
    }

}
