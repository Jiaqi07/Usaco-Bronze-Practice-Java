import java.util.*;
import java.io.*;

public class UsacoBronzeJan22020 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n-1];
        int print = 0;
        int nextPermu = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n-1; j++) {
            array[j] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(array));//test
        for(int i = 0; i < n-1; ++i){
            nextPermu = array[i] - nextPermu;
            System.out.println(nextPermu);
        }
    }
}

