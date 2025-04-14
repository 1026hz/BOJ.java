import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++) {
            int[] a = new int[11];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);
            bw.write(a[8] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}