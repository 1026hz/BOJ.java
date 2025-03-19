import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = 1;
        int num = 1;
        int six = 6;

        while (n > num){
            num += six * ans;
            ans++;
        }
        bw.write(ans + "");


        bw.flush();
        bw.close();
        br.close();

    }

}