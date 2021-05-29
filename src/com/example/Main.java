package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    StringChecker checker = new StringChecker();
    Boolean input;

	System.out.println("This is a simple calculator! Waiting for your input:");

	checker.get(sc);
	Equation equ = checker.makeEqu();



	if (equ.check()) {

                System.out.println(equ.solve());



    } else {
	    System.out.println("Your input was wrong, sorry");
    }

    }
}
