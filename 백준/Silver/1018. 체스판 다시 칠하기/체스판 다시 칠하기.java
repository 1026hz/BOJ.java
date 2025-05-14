import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] board = new String[n+1];
        for(int i=0; i<n; i++){
            board[i] = br.readLine();
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<=n-8; i++){
            for (int j=0; j<=m-8; j++){
                int repaintW = 0;
                int repaintB = 0;

                for(int x=0; x<8; x++){
                    for (int y=0; y<8; y++){
                        char now = board[i+x].charAt(j+y);

                        char expectedW = ((x+y) % 2 == 0 ? 'W' : 'B');
                        char expectedB = ((x+y) % 2 == 0 ? 'B' : 'W');

                        if (now != expectedW) repaintW++;
                        if (now != expectedB) repaintB++;
                    }
                }

                min = Math.min(min, Math.min(repaintW, repaintB));

            }
        }

        System.out.println(min);

        br.close();

    }

}