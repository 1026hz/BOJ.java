import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=1; i<=n; i++){
            bw.write(" ".repeat(n-i));
            bw.write("*".repeat(2*i-1));
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