import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=807
public class CircleBarn {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("beads.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
        int n = Integer.parseInt(br.readLine());
        int[] cow = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i){
            cow[i] = i;
        }
        int ans = n * n * 100;
        for(int house = 0; house < n; ++house){
            int initalPos = 0;
            for(int finalPos = 0; finalPos < n; ++finalPos){
                initalPos += finalPos * cow[(house+finalPos)%n];
            }
            if(initalPos < ans){
                ans = initalPos;
            }
        }
        pw.print(ans);
        pw.close();

    }
}