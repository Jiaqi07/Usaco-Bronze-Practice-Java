import java.util.*;
import java.io.*;

public class UsacoBronzeFeburary12019 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int minCount = 0;
        int maxCount = 0;
        boolean whenDone = true;
        ArrayList<Integer> ar = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 3; ++i){
            ar.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(ar);
        while(whenDone) {
            //Checks to see if they are consecutive!
            if (ar.get(0) == ar.get(1) - 1 && ar.get(1) == ar.get(2) - 1) {
                pw.println(minCount);
                pw.println(maxCount);
                whenDone = false;
            }
            //End Point Beginning
            //if(ar.get(1)){

            //}


        }
        pw.close();
    }
}
