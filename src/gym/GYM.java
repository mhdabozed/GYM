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
public class GYM {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        String last_name = null;
        String first_name = null;
        String gender = null;
        String phone = null;
        String username = null;
        String password = null;
        empolyees e1 = new empolyees(first_name, last_name, gender, phone, username, password);
        String i;
        System.out.println("what you want to add[em,cl,sp]");
        i = scan.nextLine();
        if (i == "em") {
            e1.ente();

        }
    }}








    

