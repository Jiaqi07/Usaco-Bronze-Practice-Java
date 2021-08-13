/*
ID: alanjia1
LANG: JAVA
TASK: milk2
*/
import java.io.*;
import java.util.*;
public class milk2 {
    public static void main(String...args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("milk2.in"));
        PrintWriter pw =new PrintWriter(new File("milk2.out"));
        int pairs = Integer.parseInt(br.readLine());
        //at time i, there are time[i] cows being milked
        int[] time = new int[1000003];
        int startTime = 999999999;
        int endTime = -1;
        for(int i = 0; i < pairs; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int lowBound = Integer.parseInt(st.nextToken());
            startTime = Math.min(startTime, lowBound);
            int highBound = Integer.parseInt(st.nextToken());
            endTime = Math.max(endTime, highBound);
            for(int j = lowBound; j < highBound; ++j){
                ++time[j];
            }
        }
        int longestIdle = 0;
        int longestMilk = 0;
        for(int i  = startTime; i < endTime; ){
            if(time[i] == 0){
                int gapStart = i;
                while(time[i] == 0 && i < endTime){
                    ++i;
                }
                int gapEnd = i;
                longestIdle = Math.max(gapEnd - gapStart , longestIdle);
            }
            else if(time[i] != 0){
                int milkStart = i;
                while(time[i] != 0&& i < endTime){
                    ++i;
                }
                int milkEnd = i;
                longestMilk = Math.max(milkEnd - milkStart , longestMilk);
            }
        }
        pw.println(longestMilk + " " + longestIdle);
        pw.close();


    }
}