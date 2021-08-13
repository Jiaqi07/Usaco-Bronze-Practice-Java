import java.io.*;
import java.math.*;
import java.util.*;

public class UsacoBronzeJanurary32020 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        int curI;
        int count = 0;
        Long ans;

        for(int i = 0; i < n; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < a.length; ++i){
            int k = 0;
            //Arrays.sort(b);
            while(a[k] <= b[i]){
                for(int j = 0; j < b.length; ++j){
                    if(a[i] <= b[j]){
                        count++;
                    }
                }
                ++k;
            }

        }

        pw.println(count);
        pw.close();
    }
}