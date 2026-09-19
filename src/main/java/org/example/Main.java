package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int original = number;
        int reversed = 0;

         while(number != 0){
             int digit = number %10;
             reversed = reversed*10 + digit;
             number /=10;
         }
         return original == reversed;
     }
    public static boolean isPerfectNumber(int number1) {
        if(number1<0){
            return false;
        }
        int divisor = 0;
        for(int i=1; i < number1 ; i++){
         if(number1 % i == 0)
             divisor += i;
        }
        return divisor == number1;
    }

    public static String numberToWords(int number2) {
        if(number2<0){
            return "Invalid Value";
        }
        String num = Integer.toString(number2);
        String result = "";
        for(char n : num.toCharArray()){
            switch(n){
                case '0' : result += "Zero "; break;
                case '1' : result += "One "; break;
                case '2' : result += "Two "; break;
                case '3' : result += "Three "; break;
                case '4' : result += "Four "; break;
                case '5' : result += "Five "; break;
                case '6' : result += "Six "; break;
                case '7' : result += "Seven "; break;
                case '8' : result += "Eight "; break;
                case '9' : result += "Nine "; break;
            }
        }
        return result.trim();
    }
    }

