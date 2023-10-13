import java.util.*;
import java.io.*;
import java.lang.Math;
public class RomanToInteger{
    int NumValue(char roman){
      if (roman == 'I')
         return 1;
      if (roman == 'V')
         return 5;
      if (roman == 'X')
         return 10;
      if (roman == 'L')
         return 50;
      if (roman == 'C')
         return 100;
      if (roman == 'D')
         return 500;
      if (roman == 'M')
         return 1000;
      return -1;
   }
   int romanToInt(String str) {
      int sum = 0;
      for (int i=0; i<str.length(); i++) {
         int s1 = NumValue(str.charAt(i));
         if (i+1 <str.length()) {
            int s2 = NumValue(str.charAt(i+1));
            if (s1 >= s2) {
               sum = sum + s1;
            }
            else {
               sum = sum - s1;
            } 
         }
         else {
            sum = sum + s1;
         } 
      }
      return sum;
   } 
   public static void main(String args[]) {
      Main obj = new Main();
      Scanner sc = new Scanner(System.in);
      String inputRoman= sc.nextLine();
      System.out.println("Integer value of given Roman number is: "+obj.romanToInt(inputRoman));
   }
}