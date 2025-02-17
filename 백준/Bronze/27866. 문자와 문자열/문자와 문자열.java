import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        System.out.println(s.charAt(i-1));

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}