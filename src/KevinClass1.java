import java.io.*;
import java.util.*;

public class KevinClass1 {
    public static void main(String...args)throws Exception{
        int[] ar = new int[5];
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.sort(arrayList);
        arrayList.add(12);
        Queue<String> queue = new LinkedList<>();
        queue.add("h");
        queue.remove();
        queue.peek();
        Stack<String> s = new Stack<>();
        s.add("Hi");
        s.pop();
        s.peek();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(6);
        pq.add(3);
        pq.remove();
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("hi", 5);
        int x = hm.get("hi");
        for(String d : hm.keySet()){
            System.out.println(hm.get(d));
        }
        while(true){
            continue;
            //System.out.println("ahdau");
        }
        //boolean a = false;
      //  boolean b = true;
     //   System.out.println(b ? 3 : 4);
        //If t is true then print out 3, if b is false then print out 4.

        //System.out.println(a ? b ? 2 : 3 : 4);
    }
}
