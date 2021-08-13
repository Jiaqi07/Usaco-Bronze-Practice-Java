/*
ID: alanjia1
LANG: JAVA
TASK: barn1
*/
import java.io.*;
import java.util.*;

public class barn1 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("barn1.in"));
        PrintWriter pw = new PrintWriter(new File("barn1.out"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxBoards = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        int cows = Integer.parseInt(st.nextToken());
        boolean[] barn = new boolean[size + 5];
        int startLocation = size;
        int endLocation = 0;
        for(int i = 0; i < cows; ++i){
            int location = Integer.parseInt(br.readLine());
            startLocation = Math.min(startLocation, location);
            endLocation = Math.max(endLocation, location);
            barn[location] = true;
        }
        ArrayList<Integer> gaps = new ArrayList<>();
        for(int i = startLocation; i <= endLocation; ++i){
            if (!barn[i]){
                int j = i;
                while(!barn[j] && j <= endLocation){
                    ++j;
                }
                gaps.add(j - i);
                i = j;
            }
        }
        Collections.sort(gaps);
        Collections.reverse(gaps);
        int length = endLocation - startLocation + 1;
        for(int i = 2; i <= maxBoards; ++i){
            if(gaps.size() == 0){
                break;
            }
            length -= gaps.remove(0);
        }
        pw.println(length);
        pw.close();
    }
}