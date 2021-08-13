/*
ID: alanjia1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

public class gift1 {

    public static void main(String... args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter outf = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        StringTokenizer st;

        int np = Integer.parseInt(f.readLine());
        String[] names = new String[np];
        HashMap<String,Integer> money = new HashMap<>();
        for (int i = 0; i<np; i++) {
            names[i] = f.readLine();
            money.put(names[i], 0);
        }

        for (int i = 0; i<np; i++) {
            String name = f.readLine();
            st = new StringTokenizer(f.readLine());
            int amount = Integer.parseInt(st.nextToken());
            int people = Integer.parseInt(st.nextToken());
            if (amount != 0 && people != 0) {
                int give = amount/people;
                for (int j = 0; j<people; j++) {
                    String receiver = f.readLine();
                    money.put(receiver, money.get(receiver)+give);
                    money.put(name, money.get(name)-give);
                }
            }

            else if (people != 0) {
                for (int j = 0; j<people; j++) {
                    f.readLine();
                }
            }
        }

        for (String n : names) outf.println(n + " " + money.get(n));
        outf.close();

    }
}
/*
import java.io.*;
import java.util.*;

public class gift1{
    public static void main (String...args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        int names = Integer.parseInt(br.readLine());//Map
        HashMap<String, Integer> hm = new HashMap<String, Integer>();//To store users
        String[] users = new String[names];
        String name;//Guy going broke
        int cost;//How much money he losing ;'(
        int people;//The loan sharks

        //SETTING UP THE HASHMAP/DICTANORY
        for(int i = 0; i < names; ++i){
            users[i] = br.readLine();
            hm.put(users[i], 0);
        }
        for(int i = 0; i < names; ++i){
            name = br.readLine(); //The user givin money :sadge:
            StringTokenizer st = new StringTokenizer(br.readLine());
            cost = Integer.parseInt(st.nextToken());
            people = Integer.parseInt(st.nextToken());
            if(people != 0) {
                for (int j = 0; j < people; j++) {
                    br.readLine();
                }
            }
            else if (cost != 0 && people != 0) {
                int give = cost/people;//How much money to each person
                for (int j = 0; j<people; j++) {
                    String receiver = br.readLine();
                    hm.put(receiver, hm.get(receiver)+give);
                    hm.put(name, hm.get(name)-give);
                }
            }
        }
        //output
        for(String peopleName : users){
            pw.println(peopleName + " " + hm.get(peopleName));
        }
        pw.close();

    }
}
*/
