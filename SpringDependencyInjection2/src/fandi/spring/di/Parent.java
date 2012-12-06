/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.di;

/**
 *
 * @author fandy
 */
public class Parent {
    private Item1 item1;
    private Item2 item2;
    
    public Parent(Item1 item1, Item2 item2) {
        System.out.println("Constructor Parent");
        this.item1 = item1;
        this.item2 = item2;
    }
}
