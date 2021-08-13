import java.util.*;
import java.io.*;

public class UsacoBronzeFeburary12021 {
    public static HashMap<String, Integer> history = new HashMap<>();
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        List<String> input = new ArrayList<String>();
        String garbage;
        int count = 0;
        boolean go = true;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 8; ++j){
                if(j == 0 || j == 3 || j == 4 || j == 7){
                    input.add(st.nextToken());
                }
                else{
                    garbage = st.nextToken();
                }
            }
        }
        String first;
        String last;
        String nextPrev;
        String animal;
        int answer = 0;
        while(input.size() != 0){
            first = input.remove(count);
            animal = input.remove(count);
            nextPrev = input.remove(count);
            last = input.remove(count);
            answer = findNextOne(first, nextPrev, animal, last);
            if(answer != 0){
                pw.println(answer);
            }
        }
        pw.close();
    }
    public static int findNextOne(String name, String which, String what, String name2){//Mildred, Dragon, previous, Bessie
        HashMap<String, Integer> map = new HashMap<>();
        int answer = 0;
        int[] ar = new int[1];
        map.put("Ox", 0);
        map.put("Tiger", 1);
        map.put("Rabbit", 2);
        map.put("Dragon", 3);
        map.put("Snake", 4);
        map.put("Horse", 5);
        map.put("Goat", 6);
        map.put("Monkey", 7);
        map.put("Rooster", 8);
        map.put("Dog", 9);
        map.put("Pig", 11);
        map.put("Rat", 12);

        history.put("Bessie", 0);
        if(what.equals("previous")){
            answer = history.get(name2) - map.get(which);
        }
        else if(what.equals("next")){
            answer = history.get(name2) + map.get(which);
        }
        if(name.equals("Elsie")){
            ar[0] = answer;
            return ar[0];
        }
        history.put(name, answer);
        System.out.println(history);
        return 0;
    }
}