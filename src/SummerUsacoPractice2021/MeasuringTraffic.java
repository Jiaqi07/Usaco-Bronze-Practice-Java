package SummerUsacoPractice2021;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=917
import java.util.*;
import java.io.*;

public class MeasuringTraffic {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Sample.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Sample.out")));
        int n = Integer.parseInt(br.readLine());
        int[] example = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            example[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;

        for(int i = 0; i < n; ++i){

        }


        pw.println(count);
        pw.close();
    }
}