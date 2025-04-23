import java.io.*;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        bw.write(n*(m%10) + "\n" + n *(m/10%10) + "\n" + n *(m/100%10) + "\n" + n*m);


        bw.flush();
        bw.close();
        br.close();

    }

}