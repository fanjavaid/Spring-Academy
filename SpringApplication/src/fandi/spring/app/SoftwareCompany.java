/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fandi.spring.app;

/**
 *
 * @author fandy
 */
public class SoftwareCompany {
    private Developer leadDeveloper;
    private Developer developer;

    public Developer getLeadDeveloper() {
        return leadDeveloper;
    }

    public void setLeadDeveloper(Developer leadDeveloper) {
        this.leadDeveloper = leadDeveloper;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
    
}
