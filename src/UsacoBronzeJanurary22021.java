import java.util.*;
import java.io.*;

public class UsacoBronzeJanurary22021 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // Just count how many evens and odds.
        int nEven=0, nOdd = 0;
        for (int i=0; i<n; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (val%2 == 0) {
                nEven++;
            }
            else {
                nOdd++;
            }
        }
        // Turn 2 odds into 1 even until we cross over...
        if (nOdd > nEven) {
            int nTimes = (nOdd-nEven+2)/3;
            nOdd -= (2*nTimes);
            nEven += nTimes;
        }
        // Just two cases now...
        int res = 0;
        if (nEven > nOdd) {
            res = 2 * nOdd + 1;
        }
        else {
            res = 2 * nOdd;
        }
        pw.println(res);

        pw.close();
    }
}
