package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=855
public class mixmilk {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("Problems.mixmilk.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Problems.mixmilk.out")));
        int sizes[] = new int[3];
        int milk[] = new int[3];
        //Input
        for(int i = 0; i < 3; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());

            sizes[i] = Integer.parseInt(st.nextToken());
            milk[i] = Integer.parseInt(st.nextToken());
        }

        int[] newVal;
        for(int i = 0; i < 33; ++i){
            for(int j = 0; j < 3; ++j){
                if(j == 0){
                    newVal = pour(milk[0], milk[1], sizes[1]);
                    milk[0] = newVal[0];
                    milk[1] = newVal[1];
                }
                else if(j == 1){
                    newVal = pour(milk[1], milk[2], sizes[2]);
                    milk[1] = newVal[0];
                    milk[2] = newVal[1];
                }
                else{
                    newVal = pour(milk[2], milk[0], sizes[0]);
                    milk[2] = newVal[0];
                    milk[0] = newVal[1];
                }
            }
        }
        newVal = pour(milk[0], milk[1], sizes[1]);
        milk[0] = newVal[0];
        milk[1] = newVal[1];

        pw.println(milk[0] + "\n" + milk[1] + "\n" + milk[2]);
        pw.close();
    }
    public static int[] pour(int give, int take, int constraint){
        int[] twoMilk = new int[2];

        if(give+take <= constraint){
            take += give;
            give = 0;
        }
        else{
            int tooMuch = (give+take)-constraint;
            take += give-tooMuch;
            give = tooMuch;
        }
        twoMilk[0] = give;
        twoMilk[1] = take;

        return twoMilk;
    }
}








    /*
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    int a, c, e;
    int b, d, f;
    int[] ar1 = new int[3];
    int[] ar2 = new int[3];

        for(int i = 0; i < 3; ++i){
        StringTokenizer st = new StringTokenizer(br.readLine());
        ar1[i] = Integer.parseInt(st.nextToken());
        ar2[i] = Integer.parseInt(st.nextToken());
        }
        a = ar1[0];
        b = ar2[0];
        c = ar1[1];
        d = ar2[1];
        e = ar1[2];
        f = ar2[2];
        for (int i = 0; i < 33; i++) {
        pour(a, b, c, d);
        pour(c, d, e, f);
        pour(d, f, a, c);
        }
        pour(a, b, c, d);
        pw.println(b + " " + d + " " + f);
        pw.close();
        }
static void pour(int a, int b, int c, int d){
        int amt = Math.min(b, c - d);
        b -= amt;
        d += amt;
        }
        }
        */
