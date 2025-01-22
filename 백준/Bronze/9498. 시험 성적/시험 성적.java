import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());

        if (score <= 100 && score >= 90) bw.write("A");
        else if (score <= 89 && score >= 80) bw.write("B");
        else if (score <= 79 && score >= 70) bw.write("C");
        else if (score <= 69 && score >= 60) bw.write("D");
        else bw.write("F");

        bw.flush();
        bw.close();
        br.close();

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}