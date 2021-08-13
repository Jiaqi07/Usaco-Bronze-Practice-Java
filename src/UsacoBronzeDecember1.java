import java.util.*;
import java.io.*;

public class UsacoBronzeDecember1 {
    public static void main(String... args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int[] numbers = new int[7];
        int A, B, C;

        //Input
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 7; ++i){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        A = numbers[0];
        B = numbers[1];

        C = numbers[6] - A - B;

        pw.println(A + " " + B + " " + C);
        pw.close();
    }
}
/*
        Scanner in = new Scanner(System.in);
        int size = 7;
        int input;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ArrayList arClone = new ArrayList();
        for(int i =0; i < size; ++i){
            input = in.nextInt();
            ar.add(input);
        }
        arClone = (ArrayList)ar.clone();
        Collections.sort(arClone);
        int a = (int)arClone.get(0);//DEFINITELY the A VALUE 2
        int b = (int)arClone.get(1);//DEFINITELY the B VALUE 2
        int c = 0;
        int x3 = (int)arClone.get(2);// 4
        int x4 = (int)arClone.get(3);// 7
        int x5 = (int)arClone.get(4);// 9
        int x6 = (int)arClone.get(5);// 9
        int x7 = (int)arClone.get(6);// 11
        if(ar.contains(b+x3)&&ar.contains(a+x3)&&ar.contains(a+b+x3)){
            c = x3;
        }
        else if(ar.contains(b+x4)&&ar.contains(a+x4)&&ar.contains(a+b+x4)){
            c = x4;
        }
        else if(ar.contains(b+x5)&&ar.contains(a+x5)&&ar.contains(a+b+x5)){
            c = x5;
        }
        else if(ar.contains(b+x6)&&ar.contains(a+x6)&&ar.contains(a+b+x6)){
            c = x6;
        }
        System.out.println(a + " " + b + " " + c);
        in.close();
*/