/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;
import java.util.Scanner;
/**
 *
 * @author MHD abo zed
 */
public class  empolyees extends stakeholders {
    Scanner scan =new Scanner(System.in);
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
  void ente (String firstname, String lastname, String gender, String phone,String username, String password){
    System.out.println("enter the first name");
    firstname = scan.nextLine();
    System.out.println("enter the last name");
    lastname = scan.nextLine();
    System.out.println("enter the gender");
    gender = scan.nextLine();
    System.out.println("enter phone number");
    phone = scan.nextLine();
    System.out.println("enter user name");
    username = scan.nextLine();
    System.out.println("enter password");
    password = scan.nextLine();
    }
}

