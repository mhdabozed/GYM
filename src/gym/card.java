/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;
/**
 *
 * @author MHD abo zed
 */

public class card {

        private  int card_num=0 ;
        private static LocalDate startDate;
        private static LocalDate endDate;
        private  Card_type sub_type;

    public card(int card_num) {
        this.card_num = card_num;
    }

    public card(LocalDate startDate) {
            this.startDate = startDate;
            this.endDate = startDate.plusMonths(1);
            this.card_num=card_num ;
            this.sub_type=sub_type;

        }



    public static LocalDate getStartDate() {
            return startDate;
        }

        public static LocalDate getEndDate() {
            return endDate;
        }

        public static LocalDate getExpiredDate() {
            return endDate.plusDays(1);
        }
    }



