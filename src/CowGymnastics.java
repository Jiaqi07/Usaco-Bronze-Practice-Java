import java.io.*;
import java.util.*;

public class CowGymnastics{
    public static void main(String args[]) throws Exception { // Must have "throws Exception" here!
        File in = new File("beads.in"); // Construct file objects
        File out = new File("gymnastics.out"); // For input and output files

        Scanner sc = new Scanner(in); // Construct Scanner from input file object
        PrintWriter pw = new PrintWriter(out); // Construct PrintWriter from output file object

        int K = sc.nextInt(); // number of sessions
        int N = sc.nextInt(); // number of cows

        int place[][] = new int[11][21]; // 2D array to store place of each cow in every session
        for (int i = 1; i <= K; ++i) { // i is which session
            for (int j = 1; j <= N; ++j) { // j is placing
                int cow = sc.nextInt();
                place[i][cow] = j; // cow got jth place
            }
        }

        int ans = 0; // counter to count number of consistent pairs

        // complete search
        // try every pair (a, b)
        for (int a = 1; a <= N; ++a) {
            for (int b = 1; b <= N; ++b) {
                if (a == b) continue; // must be distinct

                boolean better = true; // cow a is better than cow b in all sessions
                for (int i = 1; i <= K; ++i)
                    if (place[i][a] > place[i][b])
                        better = false; // a did worse, so a is not better

                if (better == true) ++ans; // we found a consistent pair!
            }
        }

        pw.println(ans); // Print the answer, we're done

        // close Scanner and PrintWriter to avoid memory leaks
        sc.close();
        pw.close();
    }
}