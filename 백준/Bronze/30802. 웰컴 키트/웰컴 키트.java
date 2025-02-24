import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int xl = Integer.parseInt(st.nextToken());
        int xxl = Integer.parseInt(st.nextToken());
        int xxxl = Integer.parseInt(st.nextToken());

        String str2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(str2, " ");
        int t = Integer.parseInt(st2.nextToken());
        int p = Integer.parseInt(st2.nextToken());

        int tshirt = cal(s, t) +
                cal(m, t) +
                cal(l, t) +
                cal(xl, t) +
                cal(xxl, t) +
                cal(xxxl, t);

        int pen1 = n / p;
        int pen2 = n % p;

        bw.write(tshirt + "\n");
        bw.write(pen1 + " " + pen2);

        bw.flush();
        bw.close();
        br.close();

    }
    public static int cal(int x, int t){
        return (x + t - 1) / t;
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}