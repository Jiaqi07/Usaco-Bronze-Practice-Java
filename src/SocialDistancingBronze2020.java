import java.io.*;

public class SocialDistancingBronze2020 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int answer = 0;
        int amount = 0;
        int count = 1;
        boolean go = true;
        int n1 = Integer.parseInt(br.readLine());
        String n2 = br.readLine();
        StringBuilder sb = new StringBuilder(n2);
        while(go){
            ++count;
            if(count >= n1){
                go = false;
            }
            while(sb.charAt(count-1) != '1'){
                if(count-1 == n1-1 && sb.charAt(n1-1) == '0'){
                    break;
                }

               ++amount;
               ++count;
            }
            answer = Math.max(answer, amount);
            amount = 0;
        }
        pw.println(answer);
        pw.close();
    }
}