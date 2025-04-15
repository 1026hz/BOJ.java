import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int ans = cal(b) - cal(a-1);

        bw.write(ans + "");

        bw.flush();
        bw.close();
        br.close();

    }

    public static int cal(int n){
        int sum = 0;
        int num = 1;
        int cnt = 0;
        while (cnt < n) {
            for (int i = 0; i < num && cnt < n; i++) {
                sum += num;
                cnt++;
            }
            num++;
        }
        return sum;
    }

}