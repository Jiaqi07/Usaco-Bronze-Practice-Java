import java.util.*;
import java.io.*;

public class UsacoBronzeJanurary12021 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int count = 1;
        boolean contains = false;
        String cowphabet = br.readLine();
        String mood = br.readLine();

        String[] countArray = mood.split("(?!^)");
        String[] arrayCow = cowphabet.split("(?!^)");
        List<String> lastArray = new ArrayList<String>();

        for(int i = 0; i < countArray.length; i++) {
            for (String c : arrayCow) {
                if (c.equals(countArray[i])){
                    lastArray.add(c);
                    System.out.println(lastArray);
                    if(lastArray.size() % 2 == 0) {
                        if(cowphabet.indexOf(lastArray.get(0)) >= cowphabet.indexOf(lastArray.get(1))){
                            count += 1;
                            System.out.println(141);
                            lastArray.remove(0);
                            break;
                        }
                        lastArray.remove(0);
                    }
                }

            }
        }
        System.out.println(count);
    }
}
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cowphabelt = br.readLine();
        String heard = br.readLine();

        int countLoops = 1;
        for(int i = 1; i < heard.length(); ++i){
            if(cowphabelt.indexOf(heard.charAt(i)) <= cowphabelt.indexOf(heard.charAt(i-1))){
                ++countLoops;
            }
        }
        System.out.println(countLoops);
 */