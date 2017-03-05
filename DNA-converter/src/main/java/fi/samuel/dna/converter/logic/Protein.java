package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

/**
 * Protein contains amino acids in specific order.
 *
 * Here protein means the primary structure of a protein, which is the amino
 * acid sequence. TransferRNA is used to determine the sequence.
 *
 */
public class Protein {

    private ArrayList<String> aminoAcidSequence;
    private final ArrayList<Base> tRnaSequence;
    private int numberOfAminoAcidChains;

    /**
     * When creating new protein, the tRNA base sequence is stored and storage
     * place for corresponding amino acid sequence is created.
     *
     * @param tRNA TransferRNA is needed as parameter, because it determines the
     * protein's amino acid sequence.
     */
    public Protein(TransferRNA tRNA) {
        this.aminoAcidSequence = new ArrayList<>();
        this.tRnaSequence = new ArrayList<>();
        for (Base c : tRNA.gettRnaSequence()) {
            this.tRnaSequence.add(c);
        }
        this.init();
    }

    /**
     * Gives the amino acid sequence corresponding to tRNA strand as list.
     *
     * @return Amino acid sequence as ArrayList.
     */
    public ArrayList<String> getAminoAcidSequence() {
        return aminoAcidSequence;
    }

    /**
     * Converts the tRNA sequence to corresponding amino acid sequence. First
     * tRNA sequence is divided into triplets (units consisting of three bases).
     * Then the codon is converted into string representation of its bases.
     * After this, it is checked which amino acid does the triplet code for. The
     * amino acid (or stop) is added to list.
     */
    public void init() {
        if (this.aminoAcidSequence.isEmpty()) {
            int numberOfCodons = this.tRnaSequence.size() / 3;
            int index = 0;
            while (numberOfCodons > 0) {
                ArrayList<Base> currentCodon = new ArrayList<>();
                for (int counterToThree = 0; counterToThree < 3; counterToThree++) {
                    currentCodon.add(this.tRnaSequence.get(index));
                    index++;
                }
                this.aminoAcidSequence.add(codonToAminoAcid(currentCodon));
                numberOfCodons--;
            }
        }
    }

    private boolean expectedNucleobases(String currentCodon, String... acceptedCodons) {
        for (String currentAcceptedCodon : acceptedCodons) {
            if (currentAcceptedCodon.equals(currentCodon)) {
                return true;
            }
        }
        return false;
    }

    private String codonToString(ArrayList<Base> codon) {
        String c = "";
        for (Base current : codon) {
            c += current.getNucleobase();
        }
        return c;
    }

    private String codonToAminoAcid(ArrayList<Base> codon) {
        String codonBaseSequence = codonToString(codon);
        if (expectedNucleobases(codonBaseSequence, "UUU", "UUC")) {
            return "Phenylalanine";
        } else if (expectedNucleobases(codonBaseSequence, "UUA", "UUG", "CUU", "CUC", "CUA", "CUG")) {
            return "Leucine";
        } else if (expectedNucleobases(codonBaseSequence, "AUG")) {
            return "Methionine";
        } else if (expectedNucleobases(codonBaseSequence, "AUU", "AUC", "AUA")) {
            return "Isoleucine";
        } else if (expectedNucleobases(codonBaseSequence, "GUU", "GUC", "GUA", "GUG")) {
            return "Valine";
        } else if (expectedNucleobases(codonBaseSequence, "UCU", "UCC", "UCA", "UCG", "AGU", "AGC")) {
            return "Serine";
        } else if (expectedNucleobases(codonBaseSequence, "CCU", "CCC", "CCA", "CCG")) {
            return "Proline";
        } else if (expectedNucleobases(codonBaseSequence, "ACU", "ACC", "ACA", "ACG")) {
            return "Threonine";
        } else if (expectedNucleobases(codonBaseSequence, "GCU", "GCC", "GCA", "GCG")) {
            return "Alanine";
        } else if (expectedNucleobases(codonBaseSequence, "UAU", "UAC")) {
            return "Tyrosine";
        } else if (expectedNucleobases(codonBaseSequence, "CAU", "CAC")) {
            return "Histidine";
        } else if (expectedNucleobases(codonBaseSequence, "CAA", "CAG")) {
            return "Glutamine";
        } else if (expectedNucleobases(codonBaseSequence, "AAU", "AAC")) {
            return "Asparagine";
        } else if (expectedNucleobases(codonBaseSequence, "AAA", "AAG")) {
            return "Lysine";
        } else if (expectedNucleobases(codonBaseSequence, "GAU", "GAC")) {
            return "Aspartic acid";
        } else if (expectedNucleobases(codonBaseSequence, "GAA", "GAG")) {
            return "Glutamic acid";
        } else if (expectedNucleobases(codonBaseSequence, "UGU", "UGC")) {
            return "Cysteine";
        } else if (expectedNucleobases(codonBaseSequence, "UGG")) {
            return "Tryptophan";
        } else if (expectedNucleobases(codonBaseSequence, "CGU", "CGC", "CGA", "CGG", "AGA", "AGG")) {
            return "Arginine";
        } else if (expectedNucleobases(codonBaseSequence, "GGU", "GGC", "GGA", "GGG")) {
            return "Glycine";
        } else {
            return "STOP";
        }
    }

    @Override
    public String toString() {
        String aminoAcidSequence = "";
        for (String c : this.aminoAcidSequence) {
            if (c.equals("STOP")) {
                aminoAcidSequence += "\n";
            } else {
                aminoAcidSequence += c + " ";
            }
        }
        return aminoAcidSequence;
    }

}
