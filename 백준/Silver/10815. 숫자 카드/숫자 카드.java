import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[] positive = new boolean[10000001];
        boolean[] negative = new boolean[10000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            if (num >= 0) positive[num] = true;
            else negative[Math.abs(num)] = true;
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            int num = Integer.parseInt(st.nextToken());
            if (num >= 0) {
                if (positive[num]) sb.append(1).append(" ");
                else sb.append(0).append(" ");
            }
            else {
                if (negative[Math.abs(num)]) sb.append(1).append(" ");
                else sb.append(0).append(" ");
            }

        }

        System.out.println(sb);
        br.close();

    }

}