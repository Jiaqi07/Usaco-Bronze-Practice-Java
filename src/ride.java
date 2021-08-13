/*
ID: alanjia1
LANG: JAVA
TASK: ride
*/
import java.io.*;

public class ride {
    public static void main (String...args) throws Exception {
        // Use BufferedReader rather than RandomAccessFile; it's much faster
        BufferedReader f = new BufferedReader(new FileReader("beads.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
        String first = f.readLine();
        String second = f.readLine();
        int product1 = 1;
        int product2 = 1;
        for(int i = 0; i < first.length(); ++i){
            product1 *= first.charAt(i) - 'A' + 1;
        }

        for(int i = 0; i < second.length(); ++i){
            product2 *= second.charAt(i) - 'A' + 1;
        }
        if(product1%47 == product2%47) {
            out.println("GO");
        }
        else{
            out.println("STAY");
        }
        out.close();                                  // close the output file
    }
}