import java.util.*;
import java.io.*;

public class UsacoBronzeDecember2 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        int[] petals = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; ++i){
            petals[i] = Integer.parseInt(st.nextToken());
        }

        int photos = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int totalPetals = 0;
                for(int k = i; k <= j; k++) {
                    totalPetals += petals[k];
                }
                boolean present = false;
                for(int k = i; k <= j; k++) {
                    if(petals[k] * (j-i+1) == totalPetals) {
                        present = true;
                    }
                }
                if(present) {
                    photos++;
                }
            }
        }

        pw.println(photos);
        pw.close();
    }
}
//Attempt for 7/22/2021robotics camp thursday cpp linux played gartic phone that day and then met sam or whydoesbruh or something
  /*int answer = 0, index;
    float avg = 0;

        for(int atATime = 2; atATime <= n; ++atATime){ //How many numbers taken at a time
                for(int i = 0; i < n; ++i){
        //int[] indexs = new int[n];
        for(int j = 0; j < n; ++j){
        if(petals[i] <= petals[j] && i != j){
        avg += petals[j]; //Adding all average
        }
        //indexs[j] = index;
        }
        avg /= atATime;

        for(int j = 0; j < n; ++j){
        if(petals[j] == avg) {
        // System.out.println(Arrays.toString(indexs));
        answer += atATime;
        break;
        }
        }
        avg = 0;
        }
        }

import java.util.*;
import java.io.*;

public class UsacoBronzeDecember2 {
    public static void main(String...args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        double[] petals = new double[1001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            petals[i] = Integer.parseInt(st.nextToken());
        }
        int avgPetalNum = n;
        int number = 1;
        for(int i = 0; i < n; i++){
            for(int j = i+number; j < n; j++){
                if(petals[j] > n){
                    break;
                }
                else if((petals[i]+petals[j])/2==0){

                }
            }
        }
        System.out.println(avgPetalNum);
    }
}

 */
/*import java.io.*;
import java.util.*;
public class UsacoBronzeDecember2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int n = Integer.parseInt(br.readLine());
        int[] petals = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            petals[i] = Integer.parseInt(st.nextToken());
        }
        int photos = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int totalPetals = 0;
                for(int k = i; k <= j; k++) {
                    totalPetals += petals[k];
                }
                boolean present = false;
                for(int k = i; k <= j; k++) {
                    if(petals[k] * (j-i+1) == totalPetals) {
                        present = true;
                    }
                }
                if(present) {
                    photos++;
                }
            }
        }
        pw.println(photos);
        pw.close();
    }
}
*/