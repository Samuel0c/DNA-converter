
package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

public class tRNA {

    private ArrayList<Base> tRnaSequence;

    public tRNA(mRNA mRNA) {
        this.tRnaSequence = new ArrayList();
        for (int i = 0; i < mRNA.getmRnaSequence().size(); i++) {
            tRnaSequence.add(mRNA.getmRnaSequence().get(i).complementaryBase());
        }
    }

    public ArrayList<Base> gettRnaSequence() {
        return tRnaSequence;
    }

}
