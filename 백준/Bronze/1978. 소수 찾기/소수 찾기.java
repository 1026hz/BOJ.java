import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ans = 0;
        for(int i=0; i<n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if (isPrime(tmp)) ans++;
        }

        bw.write(String.valueOf(ans));

        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean isPrime(int num){
        if (num==1) return false;
        else if (num==2 || num==3) return true;
        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}