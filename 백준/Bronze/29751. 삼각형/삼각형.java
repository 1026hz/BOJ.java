import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        Long w = Long.parseLong(st.nextToken());
        Long h = Long.parseLong(st.nextToken());

        System.out.println(w*h*0.5);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}