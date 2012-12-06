/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.app;

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
        
        SoftwareCompany company = (SoftwareCompany) context.getBean("softwareCompany");
        System.out.println("Lead Developer : "+company.getLeadDeveloper().getName());
        System.out.println("Developer : "+company.getDeveloper().getName());
    }
}
