package SummerUsacoPractice2021;

import java.io.*;
import java.util.StringTokenizer;

public class Triangles {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("triangles.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
        int n = Integer.parseInt(br.readLine());
        int[] cowX = new int[n];
        int[] cowY = new int[n];

        for(int i = 0; i < n; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            cowX[i] = Integer.parseInt(st.nextToken());
            cowY[i] = Integer.parseInt(st.nextToken());
        }
        int x1, x2, x3, y1, y2, y3, answer = 0;
        int realAnswer = 0;

        for(int i = 0; i < n-2; ++i){
            x1 = cowX[i];
            y1 = cowY[i];
            for(int j = i+1; j < n-1; ++j){
                x2 = cowX[j];
                y2 = cowY[j];
                for(int k = j+1; k < n; ++k){
                    x3 = cowX[k];
                    y3 = cowY[k];

                    if(x1 == x2 && y1 == y3){
                        answer = (x3 - x1) * (y2 - y1);
                    }
                    else if(x2 == x3 && y2 == y1){
                        answer = (x1 - x2) * (y3 - y2);
                    }
                    else if(x3 == x1 && y3 == y2){
                        answer = (x2 - x3) * (y1 - y3);
                    }
                    //System.out.println("Index " + i + " " + j + " " + k);
                    realAnswer = Math.max(Math.abs(answer), realAnswer);
                    answer = 0;
                }
            }
        }
        pw.println(realAnswer);
        pw.close();
    }
}
