package SummerUsacoPractice2021;

import java.util.*;
import java.io.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=964

public class WhereAmI {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("whereami.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("whereami.out")));
        int n = Integer.parseInt(br.readLine());
        String mailbox = br.readLine();
        ArrayList<Integer> outputs = new ArrayList<Integer>();
        int minK = 0; //Output cuz K is unique colors of mailbox and we want min required

        for(int K = 1; K <= n; ++K){ // Each Unique mailbox color
            boolean noDuplicate = true;
            for(int i = 0; i <= n-K; ++i) { // n-k makes sure the last value doesn't throw an error ABCDABC while K = 3 - ABC, BCD, CDA, DAB, ABC, and no BC cuz nothing comes for 3rd so yea.
                for(int j = 0; j < n-K; ++j) {
                    String s1 = mailbox.substring(i, i+K);
                    String s2 = mailbox.substring(j, j+K);
                    if(i != j && s1.equals(s2)){
                        noDuplicate = false;
                        break;
                    }
                }
                if(!noDuplicate){
                    break;
                }
            }
            minK = K;
            if(noDuplicate){
                pw.println(minK);
                break;
            }
        }
        pw.close();
    }
}
