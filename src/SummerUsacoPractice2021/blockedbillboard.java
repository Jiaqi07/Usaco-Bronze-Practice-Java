package SummerUsacoPractice2021;

import java.util.*;
import java.io.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=783

public class blockedbillboard {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        int x1mow, y1mow, x2mow, y2mow; //x1 and y1 is always lower left while x2 and y2 is always upper right
        int x1feed, y1feed, x2feed, y2feed; // ^
        StringTokenizer st = new StringTokenizer(br.readLine());//For the LawnMower the one you need to block
        x1mow = Integer.parseInt(st.nextToken());
        y1mow = Integer.parseInt(st.nextToken());
        x2mow = Integer.parseInt(st.nextToken());
        y2mow = Integer.parseInt(st.nextToken());
        st =  new StringTokenizer(br.readLine()); //For the Cow feed the one you want to see
        x1feed = Integer.parseInt(st.nextToken());
        y1feed = Integer.parseInt(st.nextToken());
        x2feed = Integer.parseInt(st.nextToken());
        y2feed = Integer.parseInt(st.nextToken());
        //All of this is input^^^^

        if(x1mow >= x1feed && y1mow >= y1feed && x2mow <= x2feed && y2mow <= y2feed){ //Checks if all covered
            pw.println(0);
        }
        else if(x2feed >= x2mow && x1feed > x1mow && y2feed >= y2mow && y1feed <= y1mow){ // On Right Side
            pw.println(Math.abs(x1feed - x1mow) * Math.abs(y2mow - y1mow));
        }
        else if(x2feed < x2mow && x1feed <= x1mow && y2feed >= y2mow && y1feed <= y1mow){ // On Left Side
            pw.println(Math.abs(x2feed - x2mow) * Math.abs(y2mow - y1mow));
        }
        else if(x2feed >= x2mow && x1feed <= x1mow && y2feed >= y2mow && y1feed > y1mow && y1feed < y2mow){ // On Top Side
            pw.println(Math.abs(x2mow - x1mow) * Math.abs(y1feed - y1mow));
        }
        else if(x2feed >= x2mow && x1feed <= x1mow && y2feed < y2mow && y1feed <= y1mow && y2feed > y1mow){ // On Bottom Side
            pw.println(Math.abs(x2mow - x1mow) * Math.abs(y2feed - y2mow));
        }
        else{ //None Covered or doesn't satisfy conditions
            pw.println(Math.abs(x1mow - x2mow) * Math.abs(y1mow - y2mow));
        }

        pw.close();
    }
}
