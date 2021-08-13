package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=891

public class ShellGame {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("shell.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
        int n = Integer.parseInt(br.readLine());

        int[] startSwap = new int[n];
        int[] endSwap = new int[n];
        int[] guess = new int[n];

        for(int i = 0; i < n; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());

            startSwap[i] = Integer.parseInt(st.nextToken());
            endSwap[i] = Integer.parseInt(st.nextToken());
            guess[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        int cur = 0;
        for(int i = 1; i <= n; ++i){ //Passes in which shell Bessie placed the pebble in for that specific turn, choices: 1, 2, or 3.
            int current_shell = i; //The shell that the pebble is under
            for (int j = 0; j < n; ++j) { //Goes through each swap
                if (startSwap[j] == current_shell){ //Sees if Bessie swapped the pebble around
                    current_shell = endSwap[j]; //Swaps the location of the pebble
                }
                else if (endSwap[j] == current_shell){ //Sees if Bessie swapped the pebble around
                    current_shell = startSwap[j]; //Same swap
                }
                if (current_shell == guess[j]){ //Checks if the guess for each round matches with the shell that the pebble is under
                    cur++;
                }
            }
            answer = Math.max(cur, answer); //Get the best value only
            cur = 0;
        }

        pw.println(answer);
        pw.close();
    }
}
