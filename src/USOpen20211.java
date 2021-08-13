import java.util.*;
import java.io.*;

public class USOpen20211 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] ar = new int[n];
        for(int i = 0; i < n; ++i){
            ar[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
    }
}
