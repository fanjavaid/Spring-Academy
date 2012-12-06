/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.app2;

import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fandy
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Dosen dosen = (Dosen) context.getBean("dosen");
        
        MataKuliah matkul = (MataKuliah) context.getBean("mataKuliah");
        
        matkul.setMataKuliah("Struktur Data");
        matkul.setSks(3);
        
        for (MataKuliah ma : dosen.getMataKuliahSet()) {
            System.out.println(ma.getMataKuliah());
            System.out.println(ma.getSks());
        }
    }
}
