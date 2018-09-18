package com.company;

public class Main {

    public static void main(String[] args) {
        public static String oddCharacters(String input)
        {
            int i = 1;
            String out = "";
            while (i < str.length())
            {
                out = out + str.substring(i,i+1);
                i = i + 2;
            }
        }
	// write your code here
        String input = "abcdefg";
        System.out.println("input = "+input);
        System.out.println("oddCharacters ="+oddCharacters(input));
        System.out.println("evenCharacters = "+evenCharacters(input));
        System.out.println("evenFirstOddSecond = "+evenFirstOddLast(input));

    }
}
