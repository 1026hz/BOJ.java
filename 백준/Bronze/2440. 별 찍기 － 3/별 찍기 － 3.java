import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=n; i>0; i--){
            System.out.print("*".repeat(i));
            System.out.println();
        }

        bw.flush();
        bw.close();
        br.close();

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}