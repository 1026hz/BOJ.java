import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int cnt = 1;
        while (!str.equals("0")){
            System.out.println("Case " + cnt + ": Sorting... done!");
            str = br.readLine();
            cnt +=1;
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}