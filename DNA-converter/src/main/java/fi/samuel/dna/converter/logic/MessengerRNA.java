package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

public class MessengerRNA {

    private ArrayList<Base> mRnaSequence;

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
