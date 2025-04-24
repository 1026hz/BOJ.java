import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 2;
        int ans = cnt*cnt;

        for(int i=0; i<n; i++){
             cnt = cnt * 2 -1;
             ans = cnt*cnt;
        }

        bw.write(ans + "");

        bw.flush();
        bw.close();
        br.close();

    }

}