package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=893
//Solution: https://www.youtube.com/watch?v=McxxgmkXyu8&ab_channel=ProjectStarcoderbyCSKitty
public class GuessTheAnimal {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("guess.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("guess.out")));
        int n = Integer.parseInt(br.readLine());
        String[][] cows = new String[n][101];

        for(int i = 0; i < n; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int s = Integer.parseInt(st.nextToken());
            for(int j = 0; j < s; ++j){
                cows[i][j] = st.nextToken();
            }
        }
//        System.out.println(Arrays.toString(cows[0]));
//        System.out.println(Arrays.toString(cows[1]));
//        System.out.println(Arrays.toString(cows[2]));
//        System.out.println(Arrays.toString(cows[3]));
        int max = 0;

        for(int i = 0; i < n; ++i){
            for(int j = i+1; j < n; ++j){
                max = Math.max(max, attributes(cows[i], cows[j]));
//                System.out.println(max);
            }
        }
        pw.println(max+1);
        pw.close();
    }
    public static int attributes(String[] x, String[] y) {
        int count = 0;
        for(int i = 0; i < x.length; ++i){
            for(int j = 0; j < y.length; ++j){
                if(x[i] == null || y[j] == null){
                    break;
                }
                else if(x[i].equals(y[j])){
                    ++count;
                }
            }
        }
        return count;
    }
}