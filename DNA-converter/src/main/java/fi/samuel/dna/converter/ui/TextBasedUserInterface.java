/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.samuel.dna.converter.ui;

/**
 *
 * @author samleppi
 */
import java.util.Scanner;
import fi.samuel.dna.converter.logic.*;
import java.util.ArrayList;

public class TextBasedUserInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String dnaBaseSequence = "";
        while (true) {
            System.out.println("Please give the DNA base sequence using A, T, G and C, then press enter");
            dnaBaseSequence = scanner.nextLine().toUpperCase().replaceAll("\\s", "");

            if (checkIfValidDnaSequence(dnaBaseSequence)) {
                break;
            }
            System.out.println("Retry, the sequence that you entered was invalid");
        }

        System.out.println("DNA:");
        DNA dna = new DNA(dnaBaseSequence);
        for (Base c : dna.getDnaSequence()) {
            System.out.print(c.getNucleobase());
        }
        System.out.println("");

        System.out.println("");
        System.out.println("MessengerRNA: ");
        MessengerRNA mrna = new MessengerRNA(dna);
        for (Base c : mrna.getmRnaSequence()) {
            System.out.print(c.getNucleobase());
        }
        System.out.println("");

        System.out.println("");
        System.out.println("TransferRNA: ");
        TransferRNA trna = new TransferRNA(mrna);
        for (Base c : trna.gettRnaSequence()) {
            System.out.print(c.getNucleobase());
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Protein primary structure: ");
        Protein protein = new Protein(trna);
        ArrayList<String> s = protein.getAminoAcidSequence();
        for (String c : s) {
            System.out.println(c);
        }

    }

    public static boolean checkIfValidDnaSequence(String sequence) {
        for (int i = 0; i < sequence.length(); i++) {
            if (!(sequence.charAt(i) == 'A' || sequence.charAt(i) == 'T' || sequence.charAt(i) == 'C' || sequence.charAt(i) == 'G')) {
                return false;
            }
        }
        return true;
    }

}
