package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


  Bankacc cont1 = new Bankacc();
cont1.setAccnumber("1093456712349857");
        System.out.println("Numarul contului este : " + cont1.getAccnumber());
        if(cont1.getAccnumber() == "Cont invalid") System.out.println("Nu exista detalii despre acest cont");
        else{
            cont1.setNume("Cojanu Andrei");
            System.out.println("Numele detinatorului : " + cont1.getNume());

            cont1.setBalance(169.34);
            System.out.println("Balanta contului este : " + cont1.getBalance() + " Lei");

            cont1.setEmail("milsugi@gmail.com");
            System.out.println("Email : "+ cont1.getEmail());


        }
    }

}
