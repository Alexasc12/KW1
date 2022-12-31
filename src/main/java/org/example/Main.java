package org.example;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class Main {

    static Driver[] drivers = {
            new Driver("vasia", "SSD01", 22, 3),
            new Driver("petia", "SSD02", 25, 5),
            new Driver("kolia", "SSD03", 27, 7),
            new Driver("tolia", "SSD01", 29, 10),
            new Driver(),
            new Driver()};




    public static void main(String[] args) {
        drivers[4]. scaner();
        drivers[5].scaner();
        int minVozrast = 200;
        int numberYacheyka=0;

        for (int i = 0; i < drivers.length-1; i++) {
            if (minVozrast > drivers[i].getVozrast()) {
                minVozrast = drivers[i].getVozrast();
                numberYacheyka = i;
            }
        }System.out.println("данные самого молодого водителя :" + drivers[numberYacheyka] );


        int countStaj=0;
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i].getStajVozdenia() < 10) {
                countStaj= countStaj +1;
            }

        }
        System.out.println("количество водителей со стажем меньше 10 лет :" + countStaj);


            String s = "01";
            int n = 2;


        for (int i = 0; i < drivers.length ; i++) {
            String r =StringUtils.right(drivers[i].getNumber(),n);
            if (Objects.equals(s,r) ) {
                System.out.println("имена тех чей водительское заканчивает на 01 :" + drivers[i].getFio() );
        }
        }

        float midleAge = 0;
        for (int i = 0; i < drivers.length; i++) {
            midleAge =midleAge+ drivers[i].getVozrast();
        }
        System.out.println("средний возраст водителей " + midleAge/drivers.length + " лет");



    }
}
