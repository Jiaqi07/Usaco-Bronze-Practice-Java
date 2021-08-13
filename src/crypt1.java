/*
ID: alanjia1
LANG: JAVA
TASK: crypt1
*/
import java.io.*;
import java.util.*;

public class crypt1 {
    static ArrayList<Integer> list;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("crypt1.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        list = new ArrayList<>();

        for(int i = 0; i < n; ++i){
            list.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 100; i <=999; ++i){
            if(allDigitsContained(i)){
                for(int j = 10; j <= 99; ++j){
                    if(allDigitsContained(j)){
                        int topRow = i*(j%10);
                        if(topRow >= 100 && topRow <= 999 && allDigitsContained(topRow)){
                            int bottomRow = i*(j/10);
                            if(bottomRow >= 100 && bottomRow <= 999 && allDigitsContained(bottomRow)){
                                int prod = i*j;
                                if(prod >= 1000 && prod <= 9999 && allDigitsContained(prod)){
                                    ++count;
                                }
                            }
                        }
                    }
                }
            }
        }

        pw.println(count);
        pw.close();
    }
    static boolean allDigitsContained(int k){
        if(k == 0){
            if(list.contains(0)){
                return true;
            }
        }
        int p = k; //To be safe
        while(p > 0){
            int digit = p%10; //Last digit of number
            p /= 10; //Remove last digit
            if(!list.contains(digit)){
                return false;
            }
        }
        return true;
    }
}