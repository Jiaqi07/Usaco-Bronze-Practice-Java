import java.util.*;
import java.io.*;

public class UsacoBronzeFeburary22021 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int input = Integer.parseInt(br.readLine());
        int count = 0;
        String[] st = new String[input];

        for(int i = 0; i < input; ++i){
            st[i] = br.readLine();
        }
        for(int i = 0; i < input; ++i){
            boolean go = true;
            char[] s = st[i].toCharArray();
            for(int j = 0; j < s.length-1; ++j){
                int index = j;
                if(s[index] == 'N'){
                    ++index;
                    if(s[index] == 'E'){
                        ++count;
                        go = false;
                    }
                    if(s[index] == 'W'){
                        --count;
                        go = false;
                    }
                }else if(s[index] == 'E'){
                    ++index;
                    if(s[index] == 'S'){
                        ++count;
                        go = false;
                    }
                    if(s[index] == 'N'){
                        --count;
                        go = false;
                    }
                }else if(s[index] == 'S'){
                    ++index;
                    if(s[index] == 'W'){
                        ++count;
                        go = false;
                    }
                    if(s[index] == 'E'){
                        --count;
                        go = false;
                    }
                }else if(s[index] == 'W'){
                    ++index;
                    if (s[index] == 'N') {
                        ++count;
                        go = false;
                    }
                    if (s[index] == 'S') {
                        --count;
                        go = false;
                    }
                }
            }
            if(count > 0){
                pw.println("CW");
            }else{
                pw.println("CCW");
            }
            count = 0;
        }


        pw.close();
    }
}
/*
        for(int i = 0; i < input; ++i){
            for(int j = 0; j < st[i].length(); ++j){
                if(st[i].charAt(j) == 'N'){
                    count += N;
                    if(st[i].charAt(j) == 'E'){
                        count += E;
                    }
                    if(st[i].charAt(j) == 'W'){
                        count -= W;
                    }
                }else if(st[i].charAt(j) == 'E'){
                    count += E;
                    if(st[i].charAt(j) == 'S'){
                        count += S;
                    }
                    if(st[i].charAt(j) == 'N'){
                        count -= N;
                    }
                }else if(st[i].charAt(j) == 'S'){
                    count += S;
                    if(st[i].charAt(j) == 'W'){
                        count += W;
                    }
                    if(st[i].charAt(j) == 'E'){
                        count -= E;
                    }
                }else if(st[i].charAt(j) == 'W'){
                    count += W;
                    if(st[i].charAt(j) == 'N'){
                        count += N;
                    }
                    if(st[i].charAt(j) == 'S'){
                        count -= S;
                    }
                }
            }
            if(count < 0){
                pw.println("CCW");
            }else if(count > 0){
                pw.println("CW");
            }
        }
*/