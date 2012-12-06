/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.di;

/**
 *
 * @author fandy
 */
public class TextEditor {
    private SpellChecker spellChecker;
    
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor");
        this.spellChecker = spellChecker;
    }
    
    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
