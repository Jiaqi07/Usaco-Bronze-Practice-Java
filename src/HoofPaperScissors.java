import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php/index.php?page=viewproblem2&cpid=688
public class HoofPaperScissors {
    public static void main(String[] args) throws Exception {
        // initialize file I/O
        BufferedReader br = new BufferedReader(new FileReader("beads.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        // read in the number of games
        int n = Integer.parseInt(br.readLine());

        // initialize a 2D array to store the number of each ordered pair that shows up
        int[][] matches = new int[4][4];
        for(int i = 0; i < n; i++) {
            // read in one game
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            matches[first][second]++;
        }

        // compute the maximum number of wins
        int maximumWins = matches[1][2] + matches[2][3] + matches[3][1];
        if(matches[1][3] + matches[3][2] + matches[2][1] > maximumWins) {
            maximumWins = matches[1][3] + matches[3][2] + matches[2][1];
        }

        // print the answer
        pw.println(maximumWins);

        // close the file
        pw.close();
    }
}