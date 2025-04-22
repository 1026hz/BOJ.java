import java.io.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        int min = 10000;

        for (int i=m; i<=n; i++){
            if(isPrime(i)){
                ans += i;
                if (i < min) min = i;
            }
        }

        if (ans == 0) bw.write(-1 + "");
        else bw.write(ans + "\n" + min);

        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean isPrime(int num){
        if (num == 1) return false;
        for(int i=2; i*i<=num; i++){
            if (num%i == 0) return false;
        }
        return true;
    }


}