import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long r = 31;
        long m = 1234567891;

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long ans = 0;
        long hash = 1;

        for (int i = 0; i < n; i++) {
            ans += ((long) (str.charAt(i) - 96) * hash);
            hash = (hash * r) % m;
        }

        bw.write(ans % m + "");
        bw.flush();
        bw.close();
        br.close();

    }

}