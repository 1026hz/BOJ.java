import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = 31;
        int m = 1234567891;
        String alphabet = "0abcdefghijklmnopqrstuvwxyz";

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int ans = 0;
        int tmp = 1;

        for (int i=0; i<n; i++){
            ans += (alphabet.indexOf(str.charAt(i)) * tmp);
            tmp *= r;
        }

        bw.write(ans + "");
        bw.flush();
        bw.close();
        br.close();

    }

}