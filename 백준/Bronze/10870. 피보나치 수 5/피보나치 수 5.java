import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        int n = 0;
        int m = 1;

        if (cnt == 0) bw.write(n + "");
        else if (cnt == 1) bw.write(m + "");

        else {

            for (int i = 2; i <= cnt; i++) {
                int tmp = m;
                m = n + tmp;
                n = tmp;
            }

            bw.write(m + "");
        }


        bw.flush();
        bw.close();
        br.close();

    }

}