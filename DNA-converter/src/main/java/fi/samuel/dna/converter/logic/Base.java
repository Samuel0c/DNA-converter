
package fi.samuel.dna.converter.logic;

public class Base {
    
    private final char nucleobase;

    public Base(char nucleobase) {
        this.nucleobase = nucleobase;
    }

    public char getNucleobase() {
        return nucleobase;
    }
    
    
    
    public Base complementaryBase() {
        if (this.nucleobase == 'A') {
            return new Base('U');
        } else if (this.nucleobase == 'T' || this.nucleobase == 'U') {
            return new Base('A');
        } else if (this.nucleobase == 'C') {
            return new Base('G');
        } else {
            return new Base('C');
        }
    }
    
    public boolean isPurine() {
        return this.nucleobase == 'A' || this.nucleobase == 'G';
    }

   
}
