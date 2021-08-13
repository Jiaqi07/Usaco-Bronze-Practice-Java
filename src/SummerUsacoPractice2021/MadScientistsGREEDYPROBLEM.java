package SummerUsacoPractice2021;

import java.util.*;
import java.io.*;

public class MadScientistsGREEDYPROBLEM{
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("breedflip.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
        int n = Integer.parseInt(br.readLine());

        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int count = 0;

        for(int i = 0; i < n; ++i){
            if(a[i] != b[i]){
                a[i] = b[i];
                ++i;

                while(a[i] != b[i]){
                    if(i+1 >= n){
                        break;
                    }
                    ++i;
                }
                ++count;
            }
        }
        pw.println(count);
        pw.close();
    }
}
/*
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();
        int ans = 0;
        while(!new String(a).equals(new String(b))) {
            ans++;
            int lhs = 0;
            while(a[lhs] == b[lhs]){
                lhs++;
            }
            int rhs = n-1;//for boundary char in array
            while(a[rhs] == b[rhs]){
                rhs--;
            }
            for(int i = lhs; i <= rhs; i++) {
                if(b[i] == 'G'){
                    b[i] = 'H';
                }
                else{
                    b[i] = 'G';
                }
            }
        }
        pw.println(ans);
*/
