package fi.samuel.dna.converter.logic;

import java.util.ArrayList;

public class Protein {

    private ArrayList<String> aminoAcidSequence;
    private ArrayList<Base> tRnaSequence;

    public Protein(tRNA tRNA) {
        this.aminoAcidSequence = new ArrayList<>();
        ArrayList<Base> tRnaSequence = tRNA.gettRnaSequence();
    }

    private ArrayList<String> getAminoAcidSequence() {
        if (this.aminoAcidSequence.size() == 0) {
            int numberOfCodons = tRnaSequence.size() - (tRnaSequence.size() % 3);
            for (int i = 0; i < numberOfCodons; i++) {
                ArrayList<Base> currentCodon = new ArrayList<>();
                for (int counterToThree = 1; counterToThree <= 3; counterToThree++) {
                    currentCodon.add(tRnaSequence.get(i));
                }
                this.aminoAcidSequence.add(codonToAminoAcid(currentCodon));
            }
        }
        return this.aminoAcidSequence;
    }

    public String codonToAminoAcid(ArrayList<Base> codon) {
        String name = "";
        if (codon.get(0).getNucleobase() == 'U') {
            if (codon.get(1).getNucleobase() == 'U') {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C') {
                    name = "Phenylalanine";
                } else {
                    name = "Leucine";
                }
            } else if (codon.get(1).getNucleobase() == 'C') {
                name = "Serine";
            } else if (codon.get(1).getNucleobase() == 'A') {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C') {
                    name = "Tyrosine";
                } else {
                    name = "STOP";
                }
            } else {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C') {
                    name = "Cysteine";
                } else if (codon.get(2).getNucleobase() == 'A') {
                    name = "STOP";
                } else {
                    name = "Tryptophan";
                }
            }
        } else if (codon.get(0).getNucleobase() == 'C') {
            if (codon.get(1).getNucleobase() == 'U') {
                name = "Leucine";
            } else if (codon.get(1).getNucleobase() == 'C') {
                name = "Proline";
            } else if (codon.get(1).getNucleobase() == 'A') {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C') {
                    name = "Histidine";
                } else {
                    name = "Glutamine";
                }
            } else {
                name = "Arginine";
            }
        } else if (codon.get(0).getNucleobase() == 'A') {
            if (codon.get(1).getNucleobase() == 'U') {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C' || codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'A') {
                    name = "Isoleucine";
                } else {
                    name = "Methionine";
                }
            } else if (codon.get(1).getNucleobase() == 'C') {
                name = "Threonine";
            } else if (codon.get(1).getNucleobase() == 'A') {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C') {
                    name = "Asparagine";
                } else {
                    name = "Lysine";
                }
            } else {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C') {
                    name = "Serine";
                } else {
                    name = "Arginine";
                }
            }
        } else {
            if (codon.get(1).getNucleobase() == 'U') {
                name = "Valine";
            } else if (codon.get(1).getNucleobase() == 'C') {
                name = "Alanine";
            } else if (codon.get(1).getNucleobase() == 'A') {
                if (codon.get(2).getNucleobase() == 'U' || codon.get(2).getNucleobase() == 'C') {
                    name = "Aspartic acid";
                } else {
                    name = "Glutamic acid";
                }
            } else {
                name = "Glycine";
            }
        }
        return name;
    }

}
