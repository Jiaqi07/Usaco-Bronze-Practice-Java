import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=807
public class Teleporter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("beads.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int shortestDistanceTel = Math.min(Math.abs(a - c), Math.abs(a - d));
        int end = Math.min(Math.abs(b - c), Math.abs(b - d));
        int shortestDistanceNoTeleport = shortestDistanceTel + end;
        int shortestDistanceUsingTeleport = Math.abs(a - b);
        int shortDis = Math.min(shortestDistanceUsingTeleport, shortestDistanceNoTeleport);
        pw.print(shortDis);
        pw.close();
    }
}
