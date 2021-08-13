package SummerUsacoPractice2021;

import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=988
//Solution: https://www.youtube.com/watch?v=eNDntWK6I_4&ab_channel=Cararra
public class PhotoShoot {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("photo.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = new int[n-1];
        int[] answer = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n-1; ++i){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        //System.out.println(Arrays.toString(numbers));

        int firstNumber = numbers[0];
        for(int i = 1; i <= firstNumber; ++i){ //Goes through each variation for first number which is 4 in sample input.
            int[] history = new int[n];
            history[0] = i;
            for(int j = 0; j < n-1; ++j){
                int currentNum = numbers[j];
                history[j+1] = currentNum - history[j];
            }

            Set<Integer> hs = new HashSet<Integer>();
            boolean brick = false;
            for(int j : history){
                if(j <= 0){
                    brick = true;
                    break;
                }
                hs.add(j);
            }
            if(brick){

            }
            else if(history.length != hs.size()){

            }
            else{
                answer = history;
            }
            brick = false;
        }
        //System.out.println(Arrays.toString(answer));

        for(int i = 0; i < n; ++i){
            if(i == n-1){
                pw.print(answer[i]);
            }
            else{
                pw.print(answer[i] + " ");
            }
        }
        pw.close();
    }
}