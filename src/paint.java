import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=567
public class paint {
    public static void main(String[] args) throws Exception {
        // initialize file I/O
        BufferedReader br = new BufferedReader(new FileReader("beads.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));

        // read in the first line, store a and b
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // read in the second line, store c and d
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int amountPainted = 0;
        for(int i = 0; i < 100; i++) {
            if(i >= a && i+1 <= b) {
                amountPainted++;
            }
            else if(i >= c && i+1 <= d) {
                amountPainted++;
            }
        }
        // print the answer!
        pw.println(amountPainted);

        // close output stream
        pw.close();
    }
}

/* My Version
import java.io.*;
import java.util.*;

public class paint {
    public static void main(String...args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("beads.in"));
        PrintWriter pw = new PrintWriter(new File("speeding.out"));
        int max = 0;
        int min = 0;
        int max2 = 0;
        int min2 = 0;

        for(int i = 0; i < 2; ++i){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int firstNum = Integer.parseInt(st.nextToken());
            int secondNum = Integer.parseInt(st.nextToken());

            if(i == 0){
                max = Math.max(firstNum, secondNum);
                min = Math.min(firstNum, secondNum);
            }
            else if(i == 1){
                max2 = Math.max(firstNum, secondNum);
                min2 = Math.min(firstNum, secondNum);
            }
            else{
                System.out.println("WTH?");
            }
        }
        if(max > max2 && min < min2){
            int answer = max - min;
            pw.println(answer);
        }
        else if(max > max2 && min > min2){
            int answer = max - min2;
            pw.println(answer);
        }
        else if(max < max2 && min < min2){
            int answer = max2 - min;
            pw.println(answer);
        }
        else if(max < max2 && min > min2){
            int answer = max2 - min2;
            pw.println(answer);
        }
        else if(max == max2 && min == min2){
            int answer = max - min;
            pw.println(answer);
        }
        else if(max > max2 && min == min2){
            int answer = max - min;
            pw.println(answer);
        }
        else if(max < max2 && min == min2){
            int answer = max2 - min;
            pw.println(answer);
        }
        else if(max == max2 && min > min2){
            int answer = max - min2;
            pw.println(answer);
        }
        else if(max == max2 && min < min2){
            int answer = max - min;
            pw.println(answer);
        }
        pw.close();
    }
}
*/