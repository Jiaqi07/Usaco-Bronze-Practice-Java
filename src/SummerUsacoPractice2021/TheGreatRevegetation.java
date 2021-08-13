package SummerUsacoPractice2021;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=916
import java.util.*;
import java.io.*;

public class TheGreatRevegetation {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("revegetate.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("revegetate.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] grassA = new int[M];
        int[] grassB = new int[M];


        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            grassA[i] = Integer.parseInt(st.nextToken());
            grassB[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int[] perm = new int[N];
        for(int i = 0; i < N; ++i){
            perm[i] = 1;
        }
        boolean getOut = false;

        for(int i = N-1; i >= 0; --i){
            for(int j = 2; j <= 4; ++j){
                perm[i] = j;
                for(int x = 0; x < N; ++x){
                    if(perm[x] == grassA[x] || perm[x] == grassB[x]){
                        ++count;
                    }
                    if(count == M){
                        for(int ans : perm){
                            pw.print(ans);
                            getOut = true;
                        }
                    }

                    if(getOut){
                        break;
                    }
                }
                count = 0;
                findNextPermutation(perm);
                if(getOut){
                    break;
                }
            }
            if(getOut){
                break;
            }

        }


        pw.close();
    }


    public static int[] swap(int data[], int left, int right) {

        // Swap the data
        int temp = data[left];
        data[left] = data[right];
        data[right] = temp;

        // Return the updated array
        return data;
    }

    // Function to reverse the sub-array
// starting from left to the right
// both inclusive
    public static int[] reverse(int data[], int left, int right) {

        // Reverse the sub-array
        while (left < right) {
            int temp = data[left];
            data[left++] = data[right];
            data[right--] = temp;
        }

        // Return the updated array
        return data;
    }

    // Function to find the next permutation
    // of the given integer array
    public static boolean findNextPermutation(int data[]) {

        // If the given dataset is empty
        // or contains only one element
        // next_permutation is not possible
        if (data.length <= 1)
            return false;

        int last = data.length - 2;

        // find the longest non-increasing suffix
        // and find the pivot
        while (last >= 0) {
            if (data[last] < data[last + 1]) {
                break;
            }
            last--;
        }

        // If there is no increasing pair
        // there is no higher order permutation
        if (last < 0)
            return false;

        int nextGreater = data.length - 1;

        // Find the rightmost successor to the pivot
        for (int i = data.length - 1; i > last; i--) {
            if (data[i] > data[last]) {
                nextGreater = i;
                break;
            }
        }

        // Swap the successor and the pivot
        data = swap(data, nextGreater, last);

        // Reverse the suffix
        data = reverse(data, last + 1, data.length - 1);

        // Return true as the next_permutation is done
        return true;
    }

}