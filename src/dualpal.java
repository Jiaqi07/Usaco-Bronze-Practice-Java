/*
ID: alanjia1
LANG: JAVA
TASK: dualpal
*/
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class dualpal {
    public static void main(String...args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("dualpal.in"));
        PrintWriter pw =new PrintWriter(new File("dualpal.out"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int found = 0;
        int cur = s+1;

        while(found < n){
            int palinCount = 0;
            for(int base = 2; base <= 10; ++base){
                if(isPali(baseConversion(cur,base))){
                    ++palinCount;
                }
            }
            if(palinCount >= 2){
                ++found;
                pw.println(cur);
            }
            ++cur;
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
}