import java.io.*;
import java.util.*;

public class UsacoBronzeDecember3{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine()); //N is only 50 so we can be pretty inefficent
        String[] dir = new String[n];
        int[] x = new int[n];
        int[] y = new int[n];
        int[] answer = new int[n];  //Basically output

        for(int i = 0; i < n; ++i){ //Input
            StringTokenizer st = new StringTokenizer(br.readLine());
            dir[i] = st.nextToken(); //N or E
            x[i] = Integer.parseInt(st.nextToken()); //First int
            y[i] = Integer.parseInt(st.nextToken()); //Second int
        }
        int max = 0;

        for(int i = 0; i < n; ++i){ //Goes through each one
            if(dir[i].equals("E")){ //Means Compare N, no same y or E axis cuz it says all of them are distinct
                for(int j = 0; j < n; ++j){ //Checks all variation
                    if(i == j){
                        //Skip
                    }else if(dir[j].equals("N")){ //to make sure pair works
                        if(x[i] - x[j] > y[i] - y[j] && x[i] - x[j] > 0 && y[i] - y[j] > 0) {
                            max = Math.max(max, y[i] - y[j]);
                            System.out.println(max);
                            System.out.println(j);
                        }

                    }

                }
            }
            else if(dir[i].equals("N")){ //Means Compare E, no same x or N axis cuz it says all of them are distinct
                for(int j = 0; j < n; ++j){ //Checks all variation
                    if(i == j){
                        //Skip
                    }else if(dir[j].equals("E")){ //to make sure pair works
                        if(x[i] - x[j] < y[i] - y[j] && x[i] - x[j] > 0 && y[i] - y[j] > 0) {
                            max = Math.max(max, x[i] - x[j]);
                            System.out.println(max);
                            System.out.println(j);
                        }
                    }
                    //System.out.println(max);
                }
            }
            if(max == 0){
                max = -999;
            }
            answer[i] = max;
            max = 0;
        }

        for(int i : answer){ //Output
            if(i == -999){
                pw.println("Infinity");
            }
            else {
                pw.println(i);
            }
        }
        pw.close();
    }
}
/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] xs = new int[n];
        int[] ys = new int[n];
        char[] dir = new char[n];
        for (int j = 0; j < n; j++) {
            dir[j] = in.next().charAt(0);
            xs[j] = in.nextInt();
            ys[j] = in.nextInt();
        }
        int[] answer = new int[n];
        Arrays.fill(answer, Integer.MAX_VALUE);
        List<Integer> differences = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                differences.add(Math.abs(xs[k] - xs[j]));
                differences.add(Math.abs(ys[k] - ys[j]));
            }
        }
        Collections.sort(differences);
        for (int d : differences) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (dir[j] == 'E' && dir[k] == 'N' && xs[j] < xs[k] && ys[k] < ys[j]) {
                        if (xs[j] + d == xs[k] && ys[k] + Math.min(answer[k], d) > ys[j]) {
                            answer[j] = Math.min(answer[j], d);
                        } else if (ys[k] + d == ys[j] && xs[j] + Math.min(answer[j], d) > xs[k]) {
                            answer[k] = Math.min(answer[k], d);
                        }
                    }
                }
            }
        }
        for (int j = 0; j < n; j++) {
            System.out.println(answer[j] == Integer.MAX_VALUE ? "Infinity" : answer[j]);
        }
        */
