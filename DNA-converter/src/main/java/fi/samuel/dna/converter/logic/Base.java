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
            return new Base('T');
        } else if (this.nucleobase == 'T' || this.nucleobase == 'U') {
            return new Base('A');
        } else if (this.nucleobase == 'C') {
            return new Base('G');
        } else {
            return new Base('C');
        }
    }
    
    
    
}
