package com.example;

import java.util.TreeMap;

public class Converter {

    private static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }

    public static String intToRoman(Integer number) {
        Integer l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + intToRoman(number-l);
    }



    public static Integer[] convert(String rom1, String rom2) {
     Integer[] result = new Integer[2];

     result[0] = romanToInt(rom1);
     result[1] = romanToInt(rom2);

     return result;
    }

    public static int romanToInt(String s) {
        int x=0;
        for(int i=s.length()-1;i>=0;i--){
            if(i!=0&& returnNumber(s.charAt(i))>returnNumber(s.charAt(i-1))){
                x=x+returnNumber(s.charAt(i))-returnNumber(s.charAt(i-1));
                i--;
            }
            else{
                x=x+returnNumber(s.charAt(i));
            }
        } return x;



    }
    public static int returnNumber(char s){
        switch(s){
            case 'I': return 1;


            case 'V': return 5;


            case 'X': return 10;

        }
        return 0;
    }






}


