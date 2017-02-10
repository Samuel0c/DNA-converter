package fi.samuel.dna.converter.logic;

/**
 * Bases are the constituents of DNA and RNA strands.
 *
 */
public class Base {

    private final char nucleobase;

    /**
     * Sets a nucleobase when new base is created.
     *
     * @param nucleobase Nucleobase is the character that describes the type of
     * the base (adenine, thymine, guanine, cytosine or uracil).
     */
    public Base(char nucleobase) {
        this.nucleobase = nucleobase;
    }

    /**
     * The type of the base.
     *
     * @return Gives the type of the base as char (A, T, G, C, or U).
     */
    public char getNucleobase() {
        return nucleobase;
    }

    /**
     * The complementary base of another base. A base can pair only with a
     * specific type of bases.
     *
     * @return Base, which can pair with the original base.
     */
    public Base complementaryBase() {
        char letter = 'C';
        if (this.nucleobase == 'A') {
            letter = 'U';
        } else if (this.nucleobase == 'T' || this.nucleobase == 'U') {
            letter = 'A';
        } else if (this.nucleobase == 'C') {
            letter = 'G';
        }
        return new Base(letter);
    }

    /**
     * Describes the properties of the nucleobase.
     *
     *
     * @return Gives a boolean value that tells whether a base is purine or not.
     */
    public boolean isPurine() {
        return this.nucleobase == 'A' || this.nucleobase == 'G';
    }

}
