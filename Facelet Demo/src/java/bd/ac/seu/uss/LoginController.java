/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.uss;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author kmhasan
 */
@ManagedBean
@SessionScoped
public class LoginController {
    private String userName;
    private String password;
    private String response;
    private User user;
    
    public LoginController() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getResponse() {
        if (userName.equals("admin") && password.equals("admin"))
            this.response = "Hello, " + userName;
        else this.response = "মুড়ি খাও";        
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
