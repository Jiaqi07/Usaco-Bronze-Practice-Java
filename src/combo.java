/*
ID: alanjia1
LANG: JAVA
TASK: combo
*/
import java.io.*;
import java.util.*;

public class combo {
    static int lockSize;
    public static void main(String...args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("combo.in"));
        PrintWriter pw = new PrintWriter(new File("combo.out"));
        lockSize = Integer.parseInt(br.readLine());
        int[] combo1 = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; ++i){
            combo1[i] = Integer.parseInt(st.nextToken());
        }
        int[] combo2 = new int[3];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; ++i){
            combo2[i] = Integer.parseInt(st.nextToken());
        }
        int workingCombos = 0;
        for(int i = 1; i <= lockSize; ++i){
            for(int j = 1; j <= lockSize; ++j){
                for(int k = 1; k <= lockSize; ++k){
                    if(closeTo(i, combo1[0])&&closeTo(j, combo1[1])&&closeTo(k, combo1[2])||closeTo(i, combo2[0])&&closeTo(j, combo2[1])&&closeTo(k, combo2[2])){
                        ++workingCombos;
                    }
                }
            }
        }
        pw.println(workingCombos);
        pw.close();
    }
    /** Tests to see whether a is close enough to b*/
    static boolean closeTo(int a, int b){
        return Math.abs(a - b) <= 2 || Math.abs(a - b) >= lockSize-2;
    }
}
