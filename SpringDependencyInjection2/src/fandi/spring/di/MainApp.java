/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.di;

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
        Parent p = (Parent) context.getBean("parent");
        
    }
}
