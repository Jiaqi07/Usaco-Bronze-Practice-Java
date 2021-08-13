package SummerUsacoPractice2021;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=963
public class CowGymnastics2019 {
    public static void main(String...args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int count = 0;
        int oneLine = 0;
        //int index = 0;
        int cows[][] = new int[k][n];
        ArrayList<Integer> constpairs = new ArrayList<Integer>();
        ArrayList<Integer> pairs = new ArrayList<Integer>();
        //int pairs[] = new int[50];

        for(int i = 0; i < k; ++i){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; ++j) { // Each Cow Input
                cows[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //System.out.println(Arrays.deepToString(cows)); //TEST FOR CORRECT INPUT

        for(int i = 0; i < k; ++i){ //Sessions
            for(int j = 0; j < n; ++j){ // Each Cow
                for(int x = j+1; x < n; ++x){ // Basically Factorial picture that
                    if(i == 0){
                        constpairs.add(cows[i][j]);
                        constpairs.add(cows[i][x]);
                        ++oneLine;
                        //System.out.println(constpairs);
                    }
                    else{
                        pairs.add(cows[i][j]);
                        pairs.add(cows[i][x]);
                        //System.out.println(pairs);
                    }
                    //pairs[index++] = cows[i][j];
                    //pairs[index++] = cows[i][x];
                    //System.out.println(Arrays.toString(pairs));
                }
            }
        }
        //System.out.println(pairs);
        int index = 0;
        int ans = 0;

        for(int x = 0; x < constpairs.size()/2; ++x){
            int xpair = constpairs.get(index++);
            int ypair = constpairs.get(index++);
            for(int i = 0; i < pairs.size(); i+=2){
                if(pairs.get(i) == xpair && pairs.get(i+1) == ypair){
                    ++count;
                    //System.out.println(xpair + " " + ypair);
                }
                if(count == k-1){
                    ans++;
                    //System.out.println(xpair + " " + ypair);
                    break;
                }
            }
            count = 0;
        }

        if(k == 1){
            pw.println(oneLine);
        }
        else{
            pw.println(ans);
        }

        pw.close();
        /*
        for(int x = 0; x < k; ++x){
            for(int i = 0; i < n; ++i){ //Make Sure to do each cow
                for(int j = count; j < n; ++j) { // Each Cow
                    pairs.add(cows.get(index));
                    pairs.add(cows.get(j));
                }
                ++count;
                ++index;
                System.out.println(pairs);
            }
            --n;
            count = 1;
            index = 0;
        }
*/

    }
}
