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
public class stakeholders {
    Scanner scan =new Scanner(System.in);
    protected String firstname;
    protected String lastname;
    protected String gender;
    protected String phone;
    protected char type;

    protected stakeholders(char type,String firstname, String lastname, String gender, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phone = phone;
        this.type= type;
        System.out.println("enter first name");
        firstname= scan.next();
        System.out.println("enter last name");
        lastname= scan.next();
        System.out.println("enter the gender");
        gender=scan.next();
        System.out.println("enter the phone");
        phone=scan.next();
    }

    public stakeholders(String firstname, String lastname, String gender, String phone) {
    }

    public stakeholders() {
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public char getType() {
        return type;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setType(char type) {
        this.type = type;
    }
}