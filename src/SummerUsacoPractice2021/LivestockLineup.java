package SummerUsacoPractice2021;

import java.util.*;
import java.io.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=965

public class LivestockLineup {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("lineup.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lineup.out")));
        int n = Integer.parseInt(br.readLine());
        //String[] cows = {"Beatrice", "Belinda", "Bella", "Bessie", "Betsy", "Blue", "Buttercup", "Sue"};
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Beatrice");
        hm.put(2, "Belinda");
        hm.put(3, "Bella");
        hm.put(4, "Bessie");
        hm.put(5, "Betsy");
        hm.put(6, "Blue");
        hm.put(7, "Buttercup");
        hm.put(8, "Sue");

        String[] cowConstraint1 = new String[n];
        String[] cowConstraint2 = new String[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cowConstraint1[i] = st.nextToken();
            st.nextToken();
            st.nextToken();
            st.nextToken();
            st.nextToken();
            cowConstraint2[i] = st.nextToken();
        }

        //System.out.println(Arrays.toString(cows));

        int cowsint[] = {1, 2, 3, 4, 5, 6, 7, 8};

        boolean go = true;
        while(go){
            findNextPermutation(cowsint);
            int count = 0;
            for(int i = 0; i < n; ++i){
                String constraint1 = cowConstraint1[i];
                String constraint2 = cowConstraint2[i];
                int index1 = 0;
                int index2 = 0;
                for (int j = 0; j < 8; j++) {
                    //System.out.println(j);
                    if (hm.get(cowsint[j]).equals(constraint1)) {
                        index1 = j;
                        break;
                    }
                }
                for (int j = 0; j < 8; j++) {
                    //System.out.println(j);
                    if (hm.get(cowsint[j]).equals(constraint2)) {
                        index2 = j;
                        break;
                    }
                }
                //System.out.println(index1 + " " + index2);
                //System.out.println();
               // for(int x : cowsint){
               //     System.out.print(hm.get(x) + " ");
               // }
                //System.out.println();

                if(index1+1 == index2 || index1-1 == index2) {
                    ++count;
                }
            }
            if(count == n){
                go = false;
            }

        }
        for(int x : cowsint){
            pw.println(hm.get(x));
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