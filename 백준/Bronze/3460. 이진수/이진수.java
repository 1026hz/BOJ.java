import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;
            while (n >= 1) {

                if (n % 2 == 1) {
                    bw.write(cnt + " ");
                }
                cnt++;
                n /= 2;
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}