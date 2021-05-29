package com.example;


import java.util.Scanner;

public class StringChecker {

    Integer n1,n2;
    String operand, rom1, rom2;
    Boolean roman=false;


    public StringChecker(){

    }

    public void get (Scanner sc){

        if (sc.hasNextInt()) {
            this.n1 = sc.nextInt();
            this.operand = sc.next();
            this.n2 = sc.nextInt();

        } else if (!sc.hasNextInt()) {

            roman = true;
            this.rom1 = sc.next().toUpperCase();
            if (!check(rom1)){
                System.out.println("you're doing it all wrong!");
            }
            this.operand = sc.next();
            this.rom2 = sc.next().toUpperCase();
            if (!check(rom1)){
                System.out.println("you're doing it all wrong again!");
            }

        }

    }

    public Boolean check(String s1){
        char c1[] = s1.toCharArray();


        for (int i=0; i<c1.length; i++){
            if (!(c1[i] == 'I' || c1[i] == 'V' || c1[i] == 'X')){
                return false;
            }
        }



        return true;
    }

    public Equation makeEqu (){

        Equation equ = new Equation();
        if (!roman) {

            equ.n1 = this.n1;
            equ.n2 = this.n2;
            equ.operand = this.operand;

        } else if (roman){

            equ.rom1 = this.rom1;
            equ.rom2 = this.rom2;
            equ.operand = this.operand;
            equ.roman=true;

        }

        return equ;
    }

}
