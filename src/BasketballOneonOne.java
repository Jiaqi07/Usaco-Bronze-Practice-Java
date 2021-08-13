import java.util.*;
import java.io.*;

public class BasketballOneonOne {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String s = br.readLine();
        StringBuilder build = new StringBuilder(s);
        int aScore = 0;
        int bScore = 0;

        while(s.length() != 1){
            //If player 1 scores
            if(s.charAt(0) == 'A'){
                aScore += s.charAt(1);
            }
            //If Player 2 scores
            else if(s.charAt(0) == 'B'){
                bScore += s.charAt(1);

            }
            System.out.println(build);
            build.deleteCharAt(0);
            build.deleteCharAt(1);
            if(aScore == 10 && bScore == 10){

            }
        }
        if(aScore == 11){
            System.out.println('A');
        }
        if(bScore == 11){
            System.out.println('B');
        }

        pw.close();
    }
}
