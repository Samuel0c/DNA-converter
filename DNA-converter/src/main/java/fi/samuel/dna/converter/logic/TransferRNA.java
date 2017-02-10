package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

/**
 * TransferRNA is used to link certain amino acids in a specific order.
 *
 * TransferRNA has complementary base sequence to messengerRNA.
 *
 */
public class TransferRNA {

    private ArrayList<Base> tRnaSequence;

    /**
     *
     * @param mRNA
     */
    public TransferRNA(MessengerRNA mRNA) {
        this.tRnaSequence = new ArrayList();
        for (int i = 0; i < mRNA.getmRnaSequence().size(); i++) {
            tRnaSequence.add(mRNA.getmRnaSequence().get(i).complementaryBase());
        }
    }

    /**
     *
     * @return
     */
    public ArrayList<Base> gettRnaSequence() {
        return tRnaSequence;
    }

}
