/*
ID: alanjia1
LANG: JAVA
TASK: palsquare
*/
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class palsquare {
    public static void main(String...args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("palsquare.in"));
        PrintWriter pw =new PrintWriter(new File("palsquare.out"));
        int base = Integer.parseInt(br.readLine());

        for(int i = 1; i <= 300; ++i){
            String convertedSquare = baseConversion(i*i, base);
            if(isPali(convertedSquare)){
                pw.println(allCap(baseConversion(i, base) + " " + convertedSquare));
            }
        }
        pw.close();
    }

    //Tells us whether or not if a number is a palindrome
    static boolean isPali(String num){
        for(int i = 0; i < num.length()/2; ++i){
            if(num.charAt(i) != num.charAt(num.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
    //Converts to any base, basically Integer.toString(int, radix);
    static String baseConversion(int toBeConverted, int baseToConvertTo){
        return new BigInteger(Integer.toString(toBeConverted), 10).toString(baseToConvertTo);
    }
    //Change it to captial string
    static String allCap(String s){
        String answer = "";
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) >= 'a'){
                answer += (char)(s.charAt(i) - 'a' + 'A');
            }
            else{
                answer += (char)s.charAt(i);
            }
        }
        return answer;
    }
}