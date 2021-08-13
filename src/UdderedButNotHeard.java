import java.util.*;
import java.io.*;

public class UdderedButNotHeard {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        String alphabet = br.readLine();
        String word = br.readLine();
        int count = 1;
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < alphabet.length(); ++i){
            hm.put(alphabet.charAt(i), i);
        }
        for(int i = 0; i < word.length()-1; ++i){
            if(hm.get(word.charAt(i)) >= hm.get(word.charAt(i+1))){
                ++count;
            }
        }
        pw.println(count);

        pw.close();
    }
}
