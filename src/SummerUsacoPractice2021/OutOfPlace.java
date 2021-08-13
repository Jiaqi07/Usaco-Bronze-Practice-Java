package SummerUsacoPractice2021;

import java.util.*;
import java.io.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=785
public class OutOfPlace{
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("outofplace.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("outofplace.out")));
        int n = Integer.parseInt(br.readLine());
        int[] cows = new int[n];
        int[] correctCows = new int[n];
        //Input
        for(int i = 0; i < n; ++i){
            cows[i] = Integer.parseInt(br.readLine());
            correctCows[i] = cows[i];
        }
        //Set up Correct Cows by sorting
        Arrays.sort(correctCows); //Correct Cows is 2 3 4 7 7 9 while cows is 2 4 7 7 9 3
        int moves = -1; //The reason why it's -1 is because the number of moves not in the right spot is 4, we are sure that removing one of them aka bessie will give you a sorted array and that's why it's number of moves-1

        for(int i = 0; i < n; ++i){
            if(cows[i] != correctCows[i]){ //Checks if each position is wrong because you know it's only a one offset leading to being able to count which ones are duplicates making this really easy.
                ++moves;
            }
        }

        if(moves <= 0){
            pw.println(0);
        }
        else{
            pw.println(moves);
        }
        pw.close();
    }
}
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> alCorrect;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; ++i){
            al.add(Integer.parseInt(br.readLine()));
        }
        alCorrect = (ArrayList<Integer>)al.clone();
        Collections.sort(alCorrect);
        int wrongIndex = 0;
        int count = 0;
        for(int i = 0; i < n; ++i){
            if(al.get(i) != alCorrect.get(i)){
                wrongIndex = i;

            }
        }
        int wrongNumber = al.get(wrongIndex);
        al.remove(wrongIndex);
        int rhs = al.size()-1;//for boundary int in arrayList
        int lhs = 0;

        if(wrongNumber > al.get(lhs)){
            while (wrongNumber > al.get(lhs)) {
                if (lhs == al.size()) {

                } else if (al.get(lhs) == al.get(lhs + 1)) {
                    boolean go = true;
                    while (go) {
                        if (al.get(lhs) != al.get(lhs + 1)) {
                            go = false;
                        } else {
                            lhs++;
                        }
                    }
                }
                lhs++;
                count++;
            }
        }
        else{
            while (wrongNumber < al.get(rhs)) {
                if (rhs == 0) {

                } else if (al.get(rhs) == al.get(rhs - 1)) {
                    boolean go = true;
                    while (go) {
                        if (rhs == 0) {
                            go = false;
                        } else if (al.get(rhs) != al.get(rhs - 1)) {
                            go = false;
                        } else {
                            --rhs;
                        }
                    }
                }
                count++;
                rhs--;
            }
        }
        //Output
        pw.println(count);
         */
