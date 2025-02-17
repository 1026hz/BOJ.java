import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s1 = br.readLine();
        int a = Integer.parseInt(s1);

        String s2 = br.readLine();
        int b = Integer.parseInt(s2);

        String s3 = br.readLine();
        int c = Integer.parseInt(s3);

        System.out.println(a+b-c);
        System.out.println(Integer.parseInt(s1+s2)-Integer.parseInt(s3));

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}