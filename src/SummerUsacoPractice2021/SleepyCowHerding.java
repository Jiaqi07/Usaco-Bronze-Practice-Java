package SummerUsacoPractice2021;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=915
import java.util.*;
import java.io.*;

public class SleepyCowHerding {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("herding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("herding.out")));

        int[] cowsmax = new int[3];
        int[] cows = new int[3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            cows[i] = Integer.parseInt(st.nextToken());
            cowsmax[i] = cows[i];
        }
        Arrays.sort(cows);
        Arrays.sort(cowsmax);

        int minDiff, maxDiff, minCount = 2, maxCount = 0;
        //minDiff = Math.min(cows[1] - cows[0], cows[2] - cows[1]);
        maxDiff = Math.max(cows[1] - cows[0], cows[2] - cows[1]);
        if(cowsmax[0] + 1 == cowsmax[1] && cowsmax[1] + 1 == cowsmax[2]){
            minCount = 0;
            maxCount = 0;
        }
        else{
            if(cows[2] - 2 == cows[1] || cows[0] + 2 == cows[1]){ //Min First
                minCount = 1;
            }
            maxCount = maxDiff-1;
        }



        pw.println(minCount);
        pw.println(maxCount);
        pw.close();
    }
}        /*
        else if(minDiff == maxDiff) {
            if(cows[2] - 2 == cows[1]){ //Min First
                minCount = 1;
            }

            while(!(cowsmax[0] + 1 == cowsmax[1] && cowsmax[1] + 1 == cowsmax[2])) {//Max
                cowsmax[0] = cowsmax[1] + 1;
                Arrays.sort(cowsmax);
            }
        }
        else if(minDiff == cows[2] - cows[1]){
            if(cows[2] - 2 == cows[1]){ //Min First
                minCount = 1;
            }

            while(!(cowsmax[0] + 1 == cowsmax[1] && cowsmax[1] + 1 == cowsmax[2])) {//Max
                cowsmax[2] = cowsmax[1] - 1;
                Arrays.sort(cowsmax);
                ++maxCount;
            }
        }
        else if(minDiff == cows[1] - cows[0]){
            if(cows[0] + 2 == cows[1]){ //Min First
                minCount = 1;
            }

            while(!(cowsmax[0] + 1 == cowsmax[1] && cowsmax[1] + 1 == cowsmax[2])) {//Max
                cowsmax[0] = cowsmax[1] + 1;
                Arrays.sort(cowsmax);
                ++maxCount;
            }
        }
        */