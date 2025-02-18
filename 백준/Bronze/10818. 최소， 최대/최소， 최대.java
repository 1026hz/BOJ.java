import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int max = -1000001;
        int min = 1000001;
        for (int i=0; i<n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp > max) max = tmp;
            if (tmp < min) min = tmp;
        }
        System.out.println(min + " " + max);

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}