/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.samuel.dna.converter.logic;

/**
 *
 * @author samleppi
 */
import java.util.ArrayList;

public class mRNA {
    
    private ArrayList<Base> mRnaSequence;

    public mRNA(DNA dna) {
        this.mRnaSequence = new ArrayList();
        for (int i = 0; i < dna.getDnaSequence().size(); i++) {
            mRnaSequence.add(dna.getDnaSequence().get(i).complementaryBase());
        }
    }

    public ArrayList<Base> getmRnaSequence() {
        return mRnaSequence;
    }
    
    
    
    
}
