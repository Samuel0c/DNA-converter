
package fi.samuel.dna.converter.logic;

import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        DNA dna = new DNA("TTATTTGCG");
        for(Base c : dna.getDnaSequence()) {
            System.out.print(c.getNucleobase());
        }
        System.out.println("");
        
        mRNA mRNA = new mRNA(dna);
        for(Base c : mRNA.getmRnaSequence()) {
            System.out.print(c.getNucleobase());
        }
        System.out.println("");
        
        tRNA tRNA = new tRNA(mRNA);
        for(Base c : tRNA.gettRnaSequence()) {
            System.out.print(c.getNucleobase());
        }
        System.out.println("");
        
        Protein protein = new Protein(tRNA);
        
        ArrayList<String> s = protein.getAminoAcidSequence();
        for (String c : s) {
            System.out.println(c);
        }

    }
    
}
