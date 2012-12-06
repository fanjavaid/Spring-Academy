/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.autowiring;

/**
 *
 * @author fandy
 */
public class MataKuliah {
    private String name;
    private String sks;

    public MataKuliah() {
        System.out.println("MataKuliah Constructor");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }
    
}
