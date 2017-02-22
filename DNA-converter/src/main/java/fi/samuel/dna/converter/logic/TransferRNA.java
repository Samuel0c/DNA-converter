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
     * Creates new TransferRNA strand and stores the bases of tRNA in a list.
     *
     * @param mRNA The base sequence of mRNA determines the base sequence of
     * corresponding tRNA sequence.
     */
    public TransferRNA(MessengerRNA mRNA) {
        this.tRnaSequence = new ArrayList();
        for (int i = 0; i < mRNA.getmRnaSequence().size(); i++) {
            tRnaSequence.add(mRNA.getmRnaSequence().get(i).complementaryBase());
        }
    }

    /**
     *Gives the base sequence from which the tRNA sequence consists of.
     * @return Returns the base sequence as ArrayList.
     */
    public ArrayList<Base> gettRnaSequence() {
        return tRnaSequence;
    }

    @Override
    public String toString() {
        String trnaSequence = "";
        for (Base c : this.gettRnaSequence()) {
            trnaSequence += c.getNucleobase();
        }
        return trnaSequence;
    }

}
