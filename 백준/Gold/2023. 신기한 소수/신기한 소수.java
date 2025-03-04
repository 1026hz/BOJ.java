import java.io.*;
import java.util.*;

public class Main{
    static int n = 0;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void solution() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        // 일의 자리 소수인 2,3,5,7부터 시작
        dfs(2,1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);

        bw.flush();
        bw.close();
        br.close();

    }

    public static void dfs(int a, int b) throws IOException {
        if ( b == n ) {
            if (isPrime(a)) {
                bw.write(a + "\n");
            }
            return;
        }
        for (int i=1; i<=9; i+=2){
            if (isPrime(a*10+i))
                dfs(a*10+i, b+1);
        }
    }

    public static boolean isPrime(int num){
        for(int i=2; i*i <= num; i++){ // 루트 num까지만 검사
            if (num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        solution();
    }

}