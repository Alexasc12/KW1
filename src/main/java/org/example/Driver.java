package org.example;

import java.util.Scanner;

public class Driver {
   private String fio;
   private String number;
   private int vozrast;
   private int stajVozdenia;

   Scanner sc = new Scanner(System.in);
   public void scaner() {
       System.out.println("введите имя");
        this.fio = sc.nextLine();
       System.out.println("введите номер");
        this.number = sc.nextLine();
       System.out.println("введите возраст");
        this.vozrast = sc.nextInt();
       System.out.println("введите стаж вождения");
        this. stajVozdenia = sc.nextInt();

   }

   public Driver(String fio, String number, int vozrast,int stajVozdenia) {
       this.fio = fio;
       this.number = number;
       this.vozrast = vozrast;
       this.stajVozdenia = stajVozdenia;
   }
   public Driver() {

   }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        this.vozrast = vozrast;
    }

    public int getStajVozdenia() {
        return stajVozdenia;
    }

    public void setStajVozdenia(int stajVozdenia) {
        this.stajVozdenia = stajVozdenia;
    }

    public String toString() {
       return fio + " " +
               number + " " +
               vozrast + " " +
               stajVozdenia;

    }






}
