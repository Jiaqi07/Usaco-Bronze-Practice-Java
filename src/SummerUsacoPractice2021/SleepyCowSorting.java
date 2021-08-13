package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=892
//Solution: Make sure to understand explanation thoroughly  http://www.usaco.org/current/data/sol_sleepy_bronze_jan19.html
public class SleepyCowSorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("sleepy.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sleepy.out")));
        int n = Integer.parseInt(br.readLine());
        int[] cows = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; ++i){
            cows[i] = Integer.parseInt(st.nextToken());
        } //Answer means moves
        int answer = n-1; //Set it to this if moves != 0 because if it is, then we skip past the less and break and print it out cuz it would take the last number of moves to solve because you expect it to be sorted by the number in the end.

        for(int i = n-2; i >= 0; --i){ //1, 2, 4, 3  starts at 4 and compares with 3 all the way till 1 2
            if(cows[i] < cows[i+1]){
                answer = i; //Set it to 2 if its 1 2 3 4; next iteration would set it to 1, then would finnaly be index 0 because their are 0 moves needed.
            }
            else{
                break;
            }
        }

        pw.println(answer);
        pw.close();
    }
}
