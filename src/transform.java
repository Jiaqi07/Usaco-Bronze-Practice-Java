/*
ID: alanjia1
LANG: JAVA
TASK: transform
*/
import java.io.*;
import java.util.*;

public class transform {
    public static void main(String... args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("transform.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));

        int size = Integer.parseInt(br.readLine());
        char[][] before = new char[size][size];
        char[][] after = new char[size][size];

        //Input into matrix square sizexsize
        for(int i = 0; i < size; ++i){
            String row = br.readLine();
            for(int j = 0; j < size; ++j){
                before[i][j] = row.charAt(j);
            }
        }
        for(int i = 0; i < size; ++i){
            String row = br.readLine();
            for(int j = 0; j < size; ++j){
                after[i][j] = row.charAt(j);
            }
        }
        char[][] move1 = rotate(before);
        char[][] move2 = rotate(move1);
        char[][] move3 = rotate(move2);
        char[][] move4 = reflection(before);
        char[][] move5a = rotate(move4);
        char[][] move5b = rotate(move5a);
        char[][] move5c = rotate(move5b);

        if(isEqual(after, move1)){
            pw.println(1);
        }else if(isEqual(after, move2)){
            pw.println(2);
        }else if(isEqual(after, move3)){
            pw.println(3);
        }else if(isEqual(after, move4)){
            pw.println(4);
        }else if(isEqual(after, move5a) || isEqual(after, move5b) || isEqual(after,move5c)){
            pw.println(5);
        }else if(isEqual(after, before)){
            pw.println(6);
        }else{
            pw.println(7);
        }
        pw.close();
    }
    static char[][] reflection(char[][] m){
        char[][] answer = new char[m.length][m.length];
        for(int i = 0; i < m.length; ++i){
            for(int j = 0; j < m.length; ++j){
                answer[i][m.length - j - 1] = m[i][j];//SWAPPING VALUES AROUND
            }
        }
        return answer;
    }
    static char[][] rotate(char[][] m){
        char[][] answer = new char[m.length][m.length];
        for(int i = 0; i < m.length; ++i){
            for(int j = 0; j < m.length; ++j){
                answer[j][m.length - i - 1] = m[i][j];//changing values to right by 90 degrees
            }
        }
        return answer;
    }
    /**Precondition: x and y are the same size*/
    static boolean isEqual(char[][] x, char[][] y){
        for(int i = 0; i < x.length; ++i){
            for(int j = 0; j < x[i].length; ++j){
                if(x[i][j] != y[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
