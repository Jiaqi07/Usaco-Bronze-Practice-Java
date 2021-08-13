package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=989

public class Race {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("race.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("race.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); //The End Speed
        int N = Integer.parseInt(st.nextToken()); //The number of max speed in the end meaning last index of step
        int[] numbers = new int[N];

        for(int i = 0; i < N; ++i){
            numbers[i] = Integer.parseInt(br.readLine());
        }
        //System.out.println(Arrays.toString(numbers));
        int count, lhs, rhs, velo;

        for(int x : numbers){
            count = lhs = rhs = velo = 0;
            while(lhs + rhs < K){
                ++velo;
                lhs = lhs + velo;
                ++count;
                if(velo >= x && lhs + rhs < K){
                    rhs = rhs + velo;
                    ++count;
                }
            }
            pw.println(count);
        }
        pw.close();
    }
}