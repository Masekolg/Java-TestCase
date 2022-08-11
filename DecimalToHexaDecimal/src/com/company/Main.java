package com.company;
import java.util.Scanner;
class DecimalToHexaDecimal {
   public static void main(String[] args) {
       int decimalNum;
       String hexadecimalNum;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a decimal number: ");
       decimalNum = in.nextInt();
       hexadecimalNum = Integer.toHexString(decimalNum);
       System.out.println("Hexadecimal conversion for" + decimalNum + "is : " + hexadecimalNum);
   }
}