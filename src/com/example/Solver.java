package com.example;

public class Solver {

    public static Integer chooseOperation(Integer n1, Integer n2, String operand){

        Integer result = 0;

        if (operand.equals("+")){
            result = n1+n2;
        } else if (operand.equals("-")){
            result = n1-n2;
        } else if (operand.equals("/")){
            result = n1/n2;
        }else if (operand.equals("*")){
            result = n1*n2;
        } else {System.out.println("Can't recognize your operation!");}

        return result;
    }
}
