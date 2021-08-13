/*
ID: alanjia1
LANG: JAVA
TASK: skidesign
*/
import java.io.*;

public class skidesign {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("skidesign.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("skidesign.out")));
        int hills = Integer.parseInt(br.readLine());
        int[] hillSize = new int[hills];
        for(int i = 0; i < hills; ++i){
            hillSize[i] = Integer.parseInt(br.readLine());
        }
        int minCost = Integer.MAX_VALUE;
        for(int i = 0; i <= 83; ++i){
            int curCost = 0;
            for(int j = 0; j < hills; ++j){
                if(hillSize[j] > i + 17){
                    curCost += (hillSize[j] - i - 17)*(hillSize[j] - i - 17);
                }
                else if(hillSize[j] < i){
                    curCost += (i - hillSize[j]) * (i - hillSize[j]);
                }
            }
            minCost = Math.min(curCost, minCost);
        }
        pw.println(minCost);
        pw.close();
    }
}