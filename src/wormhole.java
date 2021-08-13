/*
ID: alanjia1
LANG: JAVA
TASK: wormhole
*/
import java.io.*;
import java.util.*;

public class wormhole{
    public static void main(String...args)throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("wormhole.in"));
        PrintWriter pw = new PrintWriter("wormhole.out");
    }


}
class portal{
    public int ID;
    public int xLoc;
    public int yLoc;
    public portal partner;
    public portal(int i, int x, int y){
        xLoc = x;
        yLoc = y;
        ID = i;
    }
    public void setPartner(portal other){
        partner = other;
    }

}
