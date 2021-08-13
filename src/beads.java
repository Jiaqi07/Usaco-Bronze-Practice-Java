/*
ID: alanjia1
LANG: JAVA
TASK: beads
*/
import java.io.*;
public class beads {

    public static int chainLength (String s) {
        char [] sChar=s.toCharArray();
        int count=1;
        char lastColour=sChar[0];
        char currColour;
        boolean switchedColour=false;
        for (int i=1;i<sChar.length;i++) {
            currColour=sChar[i];
            if (currColour=='w') {
                count++;
            } else {
                if (lastColour=='w' || lastColour==currColour) {
                    lastColour=currColour;
                    count++;
                } else {
                    if (switchedColour) {
                        break;
                    } else {
                        switchedColour=true;
                        lastColour=currColour;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("beads.in"));
        br.readLine();
        String line=br.readLine();
        int maxLength=0;
        for (int i=0;i<line.length();i++) {
            int currLength=chainLength(line.substring(i)+line.substring(0,i));
            if (currLength>maxLength) {
                maxLength=currLength;
            }
        }
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        pw.println(maxLength);
        pw.close();
    }
}/*
ID: alanjia1
LANG: JAVA
TASK: beads
*/
/*
import java.io.*;
import java.util.*;

public class beads {
    public static void main (String...args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
        int n = Integer.parseInt(f.readLine());
        String second = f.readLine();
        second = second + second;
        int[] highScores = new int[101];
        int streakCount = 0;
        int count = 0;
        boolean go = true;

        for(int i = 0; i < n*2-1; ++i){
            if(second.charAt(i) == 'w' || second.charAt(i) == 'r' ){
                ++streakCount;
                if(second.charAt(i+1) == 'b'){
                    while(go){
                        if(second.charAt(i+1) == 'r' || second.charAt(i+1) == 'w'){
                            go = false;
                        }
                        ++streakCount;
                        ++i;
                    }
                    highScores[count++] = streakCount;
                    streakCount = 0;
                }
            }
        }
        go = true;
        for(int j = 0; j < n*2-1; ++j){
            if(second.charAt(j) == 'w' || second.charAt(j) == 'b' ){
                ++streakCount;
                if(second.charAt(j+1) == 'r'){
                    while(go){
                        if(second.charAt(j+1) == 'b' || second.charAt(j+1) == 'w'){
                            go = false;
                        }
                        ++streakCount;
                        ++j;
                    }
                    highScores[count++] = streakCount;
                    streakCount = 0;
                }
            }
        }

        Arrays.sort(highScores);

        out.println(highScores[highScores.length-1]);
        out.close();                                  // close the output file
    }
}
*/