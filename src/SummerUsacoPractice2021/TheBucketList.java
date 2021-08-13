package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=856
//Solution that I looked at: https://usaco.guide/problems/usaco-856-the-bucket-list/solution
public class TheBucketList {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("blist.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
        int n = Integer.parseInt(br.readLine());
        int[] milkLine = new int[1001];
        int startTime[] = new int[n];
        int endTime[] = new int[n];
        int buckets[] = new int[n];
        int greatestEnd = 0;
        //Input
        for(int i = 0; i < n; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());

            startTime[i] = Integer.parseInt(st.nextToken());
            endTime[i] = Integer.parseInt(st.nextToken());
            buckets[i] = Integer.parseInt(st.nextToken());
            milkLine[startTime[i]] += buckets[i];
            milkLine[endTime[i]] -= buckets[i];

            greatestEnd = Math.max(greatestEnd, endTime[i]);
        }
        int cur = 0;
        int max = 0;
        for(int i = 0; i < greatestEnd; ++i){
            cur += milkLine[i];
            max = Math.max(cur, max);
        }

        pw.println(max);
        pw.close();
    }
}
