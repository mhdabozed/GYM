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
public class sport {

    Scanner scan=new Scanner(System.in);
private int id;
private static String name;
private int roomnum;
private static int number_of_places;
private int timing;
private String coach_name;
private int subprice;

    public sport(int id, String name, int roomnum, int number_of_places, int timing, String coach_name, int subprice) {
        this.id = id;
        this.name = name;
        this.roomnum = roomnum;
        this.number_of_places = number_of_places;
        this.timing = timing;
        this.coach_name = coach_name;
        this.subprice = subprice;

    }
    public int getId() {
        return id;
    }

    public void setCoach_name(String coach_name) {
        this.coach_name = coach_name;
    }

    public String getCoach_name() {
        return coach_name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumber_of_places() {
        return number_of_places;
    }

    public void setNumber_of_places(int number_of_places) {
        this.number_of_places = number_of_places;
    }

    public int getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(int roomnum) {
        this.roomnum = roomnum;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public int getSubprice() {
        return subprice;
    }

    public void setSubprice(int subprice) {
        this.subprice = subprice;
    }

}
