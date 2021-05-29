package com.example;

public class Equation {

    Integer n1,n2;
    String operand, rom1, rom2;
    Boolean roman=false;

    public Equation (){
    }

    public String solve(){
        String result;
        Integer res;
        Integer[] rom = new Integer[2];
        if(!roman){
            res = Solver.chooseOperation(n1,n2,this.operand);
            result = res.toString();
        } else {
            rom = Converter.convert(rom1,rom2);

            if (rom[0]>10 || rom[1]>10 || rom[0]<1 || rom [1] < 1 ){
                return "Numbers between 1 and 10 please!";
            }

            res = Solver.chooseOperation(rom[0],rom[1],this.operand);
            result = Converter.intToRoman(res);
        }

        return result;
    }

    public Boolean romanCheck(){
        char c[] = rom1.toCharArray();
        for (int i =0; i< rom1.length(); i++) {
            if (c[i] != 'V' && c[i] != 'X' && c[i] != 'I')
                return false;
        }
        c = rom2.toCharArray();
        for (int i =0; i< rom2.length(); i++) {
            if (c[i] != 'V' && c[i] != 'X' && c[i] != 'I')
                return false;
        }
        return true;
    }

    public Boolean check() {

        if (!roman) {
            if ((this.operand.equals("+") || this.operand.equals("-") || this.operand.equals("/") || this.operand.equals("*")) && this.n1 <= 10 && this.n1 >= 1 && this.n2 <= 10 && this.n2 >= 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return this.romanCheck();
        }
    }

}
