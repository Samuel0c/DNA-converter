package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

public class Protein {

    private ArrayList<String> aminoAcidSequence;
    private final ArrayList<Base> tRnaSequence;

    public Protein(TransferRNA tRNA) {
        this.aminoAcidSequence = new ArrayList<>();
        this.tRnaSequence = new ArrayList<>();
        for (Base c : tRNA.gettRnaSequence()) {
            this.tRnaSequence.add(c);
        }
    }

    public ArrayList<String> getAminoAcidSequence() {
        if (this.aminoAcidSequence.isEmpty()) {
            int numberOfCodons = (tRnaSequence.size() - (tRnaSequence.size() % 3)) / 3;
            int index = 0;
            while (numberOfCodons > 0) {
                ArrayList<Base> currentCodon = new ArrayList<>();
                for (int counterToThree = 1; counterToThree <= 3; counterToThree++) {
                    currentCodon.add(tRnaSequence.get(index));
                    index++;
                }
                this.aminoAcidSequence.add(codonToAminoAcid(currentCodon));
                numberOfCodons--;
            }
        }
        return this.aminoAcidSequence;
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
        } else if (expectedNucleobases(codonBaseSequence, "AUU", "AUC", "AUA")) {
            return "Methionine";
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

}
