import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Boolean flag = false;

        for(int i=0; i<n; i++){
            int ans = 0;
            int tmp = 0;
            String s = br.readLine();

            for(int j=0; j<s.length(); j++) {
                if (s.charAt(j) == 'O') tmp += 1;
                else tmp = 0;
                ans += tmp;
            }

            bw.write(String.valueOf(ans));
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}