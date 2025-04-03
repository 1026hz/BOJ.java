import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ans = fact(n) / (fact(n-k) * fact(k));

        bw.write(ans + "");

        bw.flush();
        bw.close();
        br.close();

    }

    public static int fact(int n){
        int ans = 1;
        for(int i=2; i<=n; i++){
            ans *= i;
        }
        return ans;
    }

}