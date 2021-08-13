import java.util.*;
import java.io.*;

public class shape {
    public static void main(String...args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("beads.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
        int n = Integer.parseInt(br.readLine());
        int count = -1;
        ArrayList<Integer> originalAr = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ar.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0; i < n; ++i) {
            originalAr.add(ar.get(i));
        }
        Collections.sort(ar);
        for(int j = 0; j < n; ++j) {
            if(ar.get(j) != originalAr.get(j)){
                count++;
            }
        }
        count = Math.max(0, count);
        pw.print(count);
        pw.close();
    }
}
