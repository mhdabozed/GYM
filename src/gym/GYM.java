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

        String last_name ;
        String first_name ;
        String gender ;
        String phone ;
        String username ;
        String password ;
        int age ;
        int wight ;
        int hight;
        String sp_name;
        int sp_id;
        int roomnum;
        int timing;
        String coach_name;
        int number_of_places;
        int subprice;
        String i;
        System.out.println("what you want to add[em,cl,sp,end]");
        i = scan.nextLine();
            if (i == "em") {
                System.out.println("enter the first name");
                first_name = scan.nextLine();
                System.out.println("enter the last name");
                last_name = scan.nextLine();
                System.out.println("enter the gender");
                gender = scan.nextLine();
                System.out.println("enter phone number");
                phone = scan.nextLine();
                System.out.println("enter user name");
                username = scan.nextLine();
                System.out.println("enter password");
                password = scan.nextLine();
                empolyees[] e1 = new empolyees [50] ;
            }
            else if(i=="cl"){
                System.out.println("enter the first name");
                first_name = scan.nextLine();
                System.out.println("enter the last name");
                last_name = scan.nextLine();
                System.out.println("enter the gender");
                gender = scan.nextLine();
                System.out.println("enter phone number");
                phone = scan.nextLine();
                System.out.println("enter age");
                age=scan.nextInt();
                System.out.println("enter wight");
                wight=scan.nextInt();
                System.out.println("enter hight");
                hight=scan.nextInt();
                client []cl1=new client[50];
            }
            //hello niga;
            else if (i=="sp"){
                System.out.println("enter the name of sport you want to add");
                sp_name =scan.nextLine();
                System.out.println("enter the id");
                sp_id =scan.nextInt();
                System.out.println("enter the room numeber");
                roomnum= scan.nextInt();
                System.out.println("enter the time of sport");
                timing = scan.nextInt();
                System.out.println("enter the coach name");
                coach_name=scan.nextLine();
                System.out.println("enter number of places");
                number_of_places= scan.nextInt();
                System.out.println("enter subscribe price");
                subprice=scan.nextInt();
                sport []sp1=new sport[50];
            }
        } }








    

