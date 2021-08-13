package SummerUsacoPractice2021;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=1013
import java.util.*;
import java.io.*;

public class SwapitySwap{
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("swap.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("swap.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cows[] = new int[N];
        int start[] = new int[2];
        int end[] = new int[2];

        for(int i = 0; i < N; ++i){ //This is the array that needs to be swapped around
            cows[i] = i+1;
        }
        //System.out.println(Arrays.toString(cows));

        for(int i = 0; i < 2; ++i) { //Setting up which numbers need to be swapped first
            st = new StringTokenizer(br.readLine());

            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        int lhs, rhs;

        for(int k = 0; k < K; ++k){
            for(int i = 0; i < 2; ++i){
                lhs = start[i]-1;
                rhs = end[i]-1;
                int tempL;
                int tempR;

                while(lhs < rhs){
                    tempL = cows[lhs];
                    tempR = cows[rhs];
                    cows[rhs] = tempL;
                    cows[lhs] = tempR;

                    ++lhs;
                    --rhs;
                }
                //System.out.println(Arrays.toString(cows));
            }

        }

        for(int x : cows){
            pw.println(x);
        }
        pw.close();
    }
}
        /*
        int[] ar = new int[7];
        for(int i = 0; i < 6; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ar[i] = Integer.parseInt(st.nextToken());
            ar[++i] = Integer.parseInt(st.nextToken());
        }
        int N = ar[0];//Max Value
        int K = ar[1];//Amount of times it repeats
        int count = 2;
        int reps = 0;
        int cows[] = new int[N+1];
        for(int i = 0; i <= N;){
            cows[i] = ++i;
        }
        while(count != 2*K+2) {
            int lhs = 0;
            ++reps;

            while(cows[lhs] != ar[count]){
                lhs++;
            }
            int rhs = N-1;//for boundary char in array
            ++count;
            while(cows[rhs] != ar[count]){
                rhs--;
            }
            int temp = cows[lhs];
            cows[lhs] = cows[rhs];
            cows[rhs] = temp;
            if(reps == 2){
                count = 0;
            }
        }

        //Output
        for(int i : cows)
        {
            pw.println(i);
        }
        */