import java.util.*;
import java.io.*;

public class UsacoBronzeFeburary32021 {
    static boolean[][] field;
    static final int[] dirX = {1, 0, -1, 0};
    static final int[] dirY = {0, 1, 0, -1};
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int numCows = Integer.parseInt(br.readLine());
        int numComfy = 0;
        for(int i = 0; i < numCows; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cowI = Integer.parseInt(st.nextToken());
            int cowJ = Integer.parseInt(st.nextToken());
            int dnumComfy = 0;

            for(int j = 0; j < 4; ++j){
                if(countNeighbors(cowI + dirX[j], cowJ + dirY[j]) == 3){
                    --dnumComfy;
                }
            }
            field[cowI][cowJ] = true;
            for(int j = 0; j < 4; ++j){
                if(countNeighbors(cowI + dirX[j], cowJ + dirY[j]) == 3){
                    ++dnumComfy;
                }
            }
            if(countNeighbors(cowI, cowJ) == 3){
                ++dnumComfy;
            }
            numComfy += dnumComfy;
            pw.println(numComfy);
        }
        field = new boolean[1000][1000];
        pw.close();
    }
    static boolean inBounds(int i, int j){
        return i >= 0 && j >= 0 && i < 1000 && j < 1000;
    }
    static int countNeighbors(int i, int j){
       int count = 0;
       for(int k = 0; k < 4; ++k){
           if(inBounds(i + dirX[k], j + dirY[k])){
               if(field[i+dirX[k]][j+dirY[k]]){
                   ++count;
               }
           }
       }
       return count;
    }
}