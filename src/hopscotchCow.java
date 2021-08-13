import java.io.*;
import java.util.*;
//http://www.usaco.org/index.php?page=viewproblem2&cpid=528
public class hopscotchCow {
    static char[][] grid;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("hopscotch.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("hopscotch.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        /* Read the input into the grid array. */
        grid = new char[r][c];
        for(int i = 0; i < r; i++) {
            String s = br.readLine();
            for(int j = 0; j < c; j++) {
                grid[i][j] = s.charAt(j);
            }
        }

        /* Compute the answer! */
        pw.println(count(0,0));
        pw.close();
    }

    public static int count(int x, int y) {
        if(x == grid.length-1 && y == grid[x].length-1) {
            /* We arrived at the destination. */
            return 1;
        }

        /* Otherwise try all valid next moves and sum the total number of paths. */
        int ret = 0;
        for(int i = x+1; i < grid.length; i++) {
            for(int j = y+1; j < grid[i].length; j++) {
                if(grid[i][j] != grid[x][y]) {
                    ret += count(i, j);
                }
            }
        }
        return ret;
    }
}
