
package fi.samuel.dna.converter.logic;

/**
 *
 * @author samleppi
 */
import java.util.ArrayList;

public class DNA {
    
    private final ArrayList<Base> dnaBaseSequence;

    public DNA(String dnaSequence) {
        this.dnaBaseSequence = new ArrayList();
        for (int i = 0; i < dnaSequence.length(); i ++) {
            dnaBaseSequence.add(new Base(dnaSequence.charAt(i)));
        }
    }

    public ArrayList<Base> getDnaSequence() {
        return dnaBaseSequence;
    }

    
    
    
}
