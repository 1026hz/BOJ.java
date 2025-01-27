import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> tmp = new HashSet<>();

        for (int i=0; i<10; i++){
            int n = Integer.parseInt(br.readLine());
            tmp.add(n % 42);
        }
        bw.write(String.valueOf(tmp.size()));

        br.close();
        bw.flush();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}