/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

/**
 *
 * @author MHD abo zed
 */
public class empolyees extends stakeholders {
     private String username;
     private String password;

    public empolyees(String firstname, String lastname, String gender, String phone,String username, String password) {
        super( firstname, lastname,gender,phone);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
