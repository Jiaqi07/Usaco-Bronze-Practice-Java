package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=987

public class WordProcessor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("word.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("word.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        ArrayList<String> answer = new ArrayList<String>();
        String[] input = new String[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i){
            input[i] = st.nextToken();
        }
        //System.out.println(Arrays.toString(input));

        int count = 0;
        for(int i = 0; i < n; ++i){
            count += input[i].length();
            if(count > k){
                //System.out.println(count);
                answer.add("0");
                count = 0;
                count += input[i].length();
            }
            answer.add(input[i]);
            //System.out.println(answer);
        }
        answer.add("Stop");
        int iteration = 1;
        for(String s : answer){
            if(s.equals("Stop")){
                break;
            }
            else if(s.equals("0")){
                pw.println();
            }
            else{
                if(!answer.get(iteration).equals("0") && !answer.get(iteration).equals("Stop")){
                    pw.print(s + " ");
                }
                else{
                    pw.print(s);
                }
            }
            ++iteration;
        }
        pw.close();
    }

}