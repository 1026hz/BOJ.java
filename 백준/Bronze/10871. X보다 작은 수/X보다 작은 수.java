import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        StringTokenizer st = new StringTokenizer(str1, " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        for (int i=0; i<n; i++) {
            int tmp = Integer.parseInt(st2.nextToken());
            if (tmp < x) System.out.println(tmp);
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}