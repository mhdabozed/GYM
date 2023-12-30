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
public class client extends stakeholders {
    Scanner scan=new Scanner(System.in);
    private int age;
    private int wight ;
    private int hight;
    private card card;
    public client(String firstname, String lastname, String gender, String phone,int age, int wight, int hight) {
        super( firstname,  lastname,  gender, phone);
        this.age = age;
        this.wight = wight;
        this.hight = hight;

    }
}
