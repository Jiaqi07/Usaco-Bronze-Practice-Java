package SummerUsacoPractice2021;

import java.util.*;
import java.io.*;

//http://www.usaco.org/index.php?page=viewproblem2&cpid=784
public class LifeGuard {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("lifeguards.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lifeguards.out")));
        int n = Integer.parseInt(br.readLine());
        int[] timeLine = new int[1001];
        int[] timeStart = new int[n];
        int[] timeEnd = new int[n];

        for(int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            timeStart[i] = Integer.parseInt(st.nextToken());
            timeEnd[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> finalAns = new ArrayList<Integer>();

        for(int i = 0; i < n; ++i){
            //Hiring All Of Them
            for(int j = 0; j < n; ++j) {
                for (int k = timeStart[j]; k < timeEnd[j]; ++k) {
                    ++timeLine[k];
                }
            }
            //Firing one
            for(int j = timeStart[i]; j < timeEnd[i]; ++j){
                --timeLine[j];
            }
            System.out.println(Arrays.toString(timeLine));
            int count = 0;
            for (int value : timeLine) {
                if (value > 0) {
                    count++;
                }
            }
            System.out.println(count);
            finalAns.add(count);
            //Setting it to default
            Arrays.fill(timeLine, 0);
        }
        Collections.sort(finalAns);

        pw.println(finalAns.get(finalAns.size()-1));
        pw.close();

    }
}
        /*ArrayList<Integer> shifts = new ArrayList<Integer>();
        int[] times = new int[n*2];
        //Input
        for(int i = 0; i < n*2; i+=2) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            times[i] = Integer.parseInt(st.nextToken());
            times[i+1] = Integer.parseInt(st.nextToken());
        }

        int[] minT = new int[2];
        int[] maxT = new int[2];
        int min;
        int max;
        int index = 0;
        for(int i = 0; i < n; ++i){
            index = i*2;
            minT[0] = times[index];
            maxT[0] = times[index+1];
            for(int j = i+1; j < n; ++j){
                minT[1] = times[index+2];
                maxT[1] = times[index+3];
                if(minT[0] < minT[1]){
                    min = minT[0];
                    if(maxT[0] > maxT[1]){
                        max = maxT[0];
                    }
                    else if(maxT[0] < maxT[1]){
                        max = maxT[1];
                    }
                    else{
                        max = maxT[1]; //Anything works cuz its equal max
                    }
                    shifts.add(max-min);
                }
                else if(minT[0] > minT[1]){
                    min = minT[1];
                    if(maxT[0] > maxT[1]){
                        max = maxT[0];
                    }
                    else if(maxT[0] < maxT[1]){
                        max = maxT[1];
                    }
                    else{
                        max = maxT[0]; //Meh anything works cuz equal max
                    }
                    shifts.add(max-min);
                }
                else{ // Anything works for min cuz equal
                    min = minT[1];
                    if(maxT[0] > maxT[1]){
                        max = maxT[0];
                    }
                    else if(maxT[0] < maxT[1]){
                        max = maxT[1];
                    }
                    else{
                        max = maxT[0]; //Meh anything works cuz equal max
                    }
                    shifts.add(max-min);
                }
                System.out.println(max-min);
            }
        }
        Collections.sort(shifts);

        pw.println(shifts.get(shifts.size()-1));
        */