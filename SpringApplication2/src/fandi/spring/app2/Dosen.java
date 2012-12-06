/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.app2;

import java.util.Set;


/**
 *
 * @author fandy
 */
public class Dosen {
    private String nama;
    private Set<MataKuliah> mataKuliahSet;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Set<MataKuliah> getMataKuliahSet() {
        return mataKuliahSet;
    }

    public void setMataKuliahSet(Set<MataKuliah> mataKuliahSet) {
        this.mataKuliahSet = mataKuliahSet;
    }
    
}
