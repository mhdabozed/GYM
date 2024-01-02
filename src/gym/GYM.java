/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;
import java.util.Scanner;
import java.util.ArrayList;

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
        ArrayList <client> cl1 = new ArrayList <client> () ;
        ArrayList <empolyees> e1 = new ArrayList <empolyees> () ;
        ArrayList <sport> sp1 = new ArrayList <sport> () ;
        String j;
        String i;
        String k;
        do{
        System.out.println("what do you want to do [add,search,end]");
        j=scan.nextLine();
        if (j.equals("add")){

    do{
        System.out.println("what you want to add[em,cl,sp,end]");
        i = scan.nextLine();

    if (i.equals("em")) {
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
        e1.toArray();
    } else if (i.equals("cl")) {
        System.out.println("enter the first name");
        first_name = scan.nextLine();
        System.out.println("enter the last name");
        last_name = scan.nextLine();
        System.out.println("enter the gender");
        gender = scan.nextLine();
        System.out.println("enter phone number");
        phone = scan.nextLine();
        System.out.println("enter age");
        age = scan.nextInt();
        System.out.println("enter wight");
        wight = scan.nextInt();
        System.out.println("enter hight");
        hight = scan.nextInt();
        cl1.toArray();

    }
    else if (i.equals("sp")) {
        System.out.println("enter the name of sport you want to add");
        sp_name = scan.nextLine();
        System.out.println("enter the id");
        sp_id = scan.nextInt();
        System.out.println("enter the room numeber");
        roomnum = scan.nextInt();
        System.out.println("enter the time of sport");
        timing = scan.nextInt();
        System.out.println("enter the coach name");
        coach_name = scan.nextLine();
        System.out.println("enter number of places");
        number_of_places = scan.nextInt();
        System.out.println("enter subscribe price");
        subprice = scan.nextInt();
        sp1.toArray();
    }}while (!i.equals("end") );}
        else if(j.equals("search"))
        {
            System.out.println("what you want to search for[em,sp,cl,end]");
            k=scan.nextLine();
            if(k.equals("em")){
                String name1;
                System.out.println("what the name of emp you want to search");
                name1=scan.nextLine();
            for(int i1=0;i1> e1.size();i1++) {



                }


            }
        }}while (!j.equals("end"));

        } }








    

