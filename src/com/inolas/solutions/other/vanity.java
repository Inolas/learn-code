package com.inolas.solutions.other;

import netscape.security.UserTarget;

import java.util.*;

public class vanity
{
    public static void main(String[] args){ // stuff that is Given
        List name = Arrays.asList("TWLO", "CODE", "HTCH"); // VANITY CODES
        /*
        * TWLO - 8956        CODE - 2633      HTCH - '4824'
        * 2. TRANSLATE GIVE CODES INTO NUMBER STRING
        *
        * ABC - 2       DEF - 3       GHI - 4     JKL - 5
        * MNO - 6       PQRS - 7      TUV - 8     WXYZ - 9
        * 1. MAP ALPHABETS FOR CODE CONVERSION - DATA STRUCTES - HASH MAP
        * .PUT('ABC', 2); .PUT('DEF', 3); HASH MAP - 26 CHAR; WE
        *
        * '+17474824380' - Hint - String manipulation; ascii?? ans - subString()
        * 3. check if each code is present in each number
        * if you do not
        * */
        List<String> numbers = Arrays.asList("+17474824380", "+14157088956", "+919810155555", "+15109926333", "+1415123456");
    /*System.out.println(numbers);
    String nn = new String();
    nn = numbers.get(2);
        numbers.remove(nn);
    System.out.println(numbers);*/
        // return - FIND PHONES NUMBERS (return List/Map/ArrayList) THAT MATCH NAMES
        List<String> p = vanity(numbers, name);
//        String op = '+17474824380';
//        String s = '484';
//    System.out.println(op.contains(s));

        for (String pp : p) {
            System.out.println(pp+"-here");
        }
    }

  public static List<String> vanity(List<String> numbers, List<String> names) {

    List<String> phone_numbers = new ArrayList<>();
    HashMap<Character, Integer> code_conversions = new HashMap<>();
    code_conversions.put('A', 2);
    code_conversions.put('B', 2);
    code_conversions.put('C', 2);
    code_conversions.put('D', 3);
    code_conversions.put('E', 3);
    code_conversions.put('F', 3);
    code_conversions.put('G', 4);
    code_conversions.put('H', 4);
    code_conversions.put('I', 4);
    code_conversions.put('J', 5);
    code_conversions.put('K', 5);
    code_conversions.put('L', 5);
    code_conversions.put('M', 6);
    code_conversions.put('N', 6);
    code_conversions.put('O', 6);
    code_conversions.put('P', 7);
    code_conversions.put('Q', 7);
    code_conversions.put('R', 7);
    code_conversions.put('S', 7);
    code_conversions.put('T', 8);
    code_conversions.put('U', 8);
    code_conversions.put('V', 8);
    code_conversions.put('W', 9);
    code_conversions.put('X', 9);
    code_conversions.put('Y', 9);
    code_conversions.put('Z', 9);

    List<String> codes = new ArrayList<>();
    for (String name : names) {
      // TWLO - '2345'
      StringBuilder code = new StringBuilder();
      for (char c : name.toCharArray()) {
        //               c = T
        //               System.out.println(c); // HINT: data type of ??
        int code_int = code_conversions.get(c);
        code.append(code_int);
        //    best debugging way is to Print stuff\
      }

      codes.add(code.toString());
    }
    System.out.println(codes + "codes");
    System.out.println(numbers + "numbers");

    for (String code : codes) {
      for (String number : numbers) {
        if (number.contains(code)) { // list.contains code
          phone_numbers.add(number);
        }
      }
    }
    return phone_numbers;
    }
}
