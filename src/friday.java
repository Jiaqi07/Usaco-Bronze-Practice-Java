/*
ID: alanjia1
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;

public class friday {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("friday.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        int n = Integer.parseInt(br.readLine());
        int[] days = new int[7];
        int index = 0;
        for(int i = 1900; i < 1900 + n; ++i){
            days[index]++;//Janurary
            index += 3;
            index %= 7;
            days[index]++;//Feburary
            if((i % 4 == 0 && i % 100 != 0)||i%400 == 0){
                index += 1;
                index %= 7;
            }//Leap year
            days[index]++;//March
            index += 3;
            index %= 7;
            days[index]++;//April
            index += 2;
            index %= 7;
            days[index]++;
            //month of May
            index += 3;
            index %= 7;
            days[index]++;//June
            index += 2;
            index %= 7;
            days[index]++;//July
            index += 3;
            index %= 7;
            days[index]++;//August
            index += 3;
            index %= 7;
            days[index]++;
            //month of Sept
            index += 2;
            index %= 7;
            days[index]++;
            //month of October
            index += 3;
            index %= 7;
            days[index]++;//Nov
            index += 2;
            index %= 7;
            days[index]++;//December
            index += 3;
            index %= 7;
        }
        for(int i = 0; i < 7; ++i){
            if (i == 6) {
                pw.print(days[i]);
            }
            else{
                pw.print(days[i] + " ");
            }
        }
        pw.println();
        pw.close();
    }
}