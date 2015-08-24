package bd.ac.seu.labexam;


import bd.ac.seu.labexam.Administrator;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kmhasan
 */
@ManagedBean
@SessionScoped
public class AdministratorCreator implements Serializable {
    private String userId;
    private String password;
    private Administrator administrator;

    public AdministratorCreator() {
    }

    public String getUserId() {
        System.out.println("My userId " + userId);
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        System.out.println("My password " + password);
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
    
    public void create() {
        Administrator administrator = new Administrator(userId, Md5Generator.generateMd5(password));
        
        Session session = SessionFactorySingleton.getSessionFactory().openSession();
        String response = "";
        FacesMessage message;
        try {
            session.beginTransaction();
            session.save(administrator);
            session.getTransaction().commit();
            response = "Successfully added administrator " + userId;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, response, null);
        } catch (Exception e) {
            e.printStackTrace();
            response = "Failed to add administrator " + userId;
            message = new FacesMessage(FacesMessage.SEVERITY_ERROR, response, null);
        }
        
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
