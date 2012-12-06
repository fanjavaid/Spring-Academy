/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.di.setter;

/**
 *
 * @author fandy
 */
public class TextEditor {
    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    // Setter method untuk menginject dependency
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker()");
        this.spellChecker = spellChecker;
    }
    
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
