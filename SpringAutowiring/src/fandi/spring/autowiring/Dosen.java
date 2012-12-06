/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.autowiring;

/**
 *
 * @author fandy
 */
public class Dosen {
    private String name;
    private MataKuliah mataKuliah;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void ngajarMk() {
        System.out.println("Dosen mengajar MK");
    }
}
