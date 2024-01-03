/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

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
        ArrayList <card> ca = new ArrayList <card> () ;
        String j;
        String i;
        String k;
        String name1;
         int card_num = 0;

        LocalDate today = LocalDate.now();
        card Card = new card(today);
        do{
        System.out.println("what do you want to do [add,search,card,end]");
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
        e1.add(new empolyees(first_name,last_name,gender,phone,username,password));

    }else if (i.equals("sp")) {
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
        sp1.add(new sport(sp_id,sp_name,roomnum,number_of_places,timing,coach_name,subprice));
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
        cl1.add(new client(first_name,last_name,gender,phone, age,wight,hight));
        System.out.println("Start Date: " + card.getStartDate());
        System.out.println("End Date: " + card.getEndDate());
        System.out.println("Expired Date: " + card.getExpiredDate());
        System.out.println("what kind os sport you want to sub"+sp1+"enter by number");
        int sp_type= scan.nextInt();
        card_num +=1;
          ca.add(new card(card_num));
    }

    }while (!i.equals("end") );}

        else if(j.equals("search"))
        {
            System.out.println("what you want to search for[em,sp,cl,end]");
            k=scan.nextLine();
            if(k.equals("em")){

                System.out.println("what the name of emp you want to search");
                name1=scan.nextLine();
            for(int i1=0;i1> e1.size();i1++) {
                if(e1.get(i1).firstname.equals(name1)){
                    System.out.println(e1);
                }
                else
                    i1++;
                }

        }
            else if(k.equals("cl")){
                System.out.println("what the name of client you want to search");
                name1=scan.nextLine();
                for(int i2=0;i2> e1.size();i2++){
                    if(cl1.get(i2).firstname.equals(name1)){
                        System.out.println(cl1);
                    }
                    else
                        i2++;
                }
            }

                    }}while (!j.equals("end"));
                                                                                                             








        } }








    

