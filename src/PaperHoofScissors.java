import java.util.*;
import java.io.*;

public class PaperHoofScissors {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        int[][] hoofPaper = new int[n][10];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            // read in a row of the grid
            String s = br.readLine();
            for(int j = 0; j < n; j++) {
                // update the relevant row in the array
                hoofPaper[i][j] = s.charAt(j);
            }
        }
        System.out.println(hoofPaper);

    }
}