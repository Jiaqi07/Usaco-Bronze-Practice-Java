/*
ID: alanjia1
LANG: JAVA
TASK: namenum
*/
import java.util.*;
import java.io.*;

public class namenum {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("dict.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("namenum.out")));
        ArrayList<String> dict = new ArrayList<String>();
        while(br.ready()){//Goes till file reader hits bottom and runs out of reads
            dict.add(br.readLine());
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 2);
        map.put("B", 2);
        map.put("C", 2);
        map.put("D", 3);
        map.put("E", 3);
        map.put("F", 3);
        map.put("G", 4);
        map.put("H", 4);
        map.put("I", 4);
        map.put("J", 5);
        map.put("K", 5);
        map.put("L", 5);
        map.put("M", 6);
        map.put("N", 6);
        map.put("O", 6);
        map.put("P", 7);
        map.put("R", 7);
        map.put("S", 7);
        map.put("T", 8);
        map.put("U", 8);
        map.put("V", 8);
        map.put("W", 9);
        map.put("X", 9);
        map.put("Y", 9);

        boolean none = true;
        br = new BufferedReader(new FileReader("namenum.in"));
        String codename = br.readLine();
        for(int i = 0; i < dict.size(); ++i){
            String currentWord = dict.get(i);
            if(codename.length() != currentWord.length()){
                continue;
            }
            String tempCode = "";
            for(int j = 0; j < currentWord.length(); ++j){
                tempCode += "" + map.get(Character.toString(currentWord.charAt(j)));
            }
            if(codename.equals(tempCode)){
                none = false;
                pw.println(currentWord);
            }
        }
        if(none){
            pw.println("NONE");
        }
        pw.close();
    }
}
