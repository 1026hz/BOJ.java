import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans1 = gcd(a,b);

        bw.write(ans1 + "\n");
        bw.write(a*b/ans1 + "");
        bw.flush();

        bw.close();
        br.close();

    }

    public static int gcd(int a, int b){
        int tmp;
        while (b > 0){
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}