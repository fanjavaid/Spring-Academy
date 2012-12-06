/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.collection;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-collection.xml");
        JavaCollection java = (JavaCollection) context.getBean("javaCollection");
        
        java.getAddressList();
        java.getAddressSet();
        java.getAddressMap();
        java.getAddressProp();
    }
}
