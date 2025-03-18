import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        boolean flag = false;

        for(int i=1; i<=n; i++){
            int tmp = i;
            int now = i;
            while(now > 0){
                tmp += now%10;
                now/=10;
            }
            if (tmp == n) {
                bw.write(String.valueOf(i));
                flag = true;
                break;
            }
        }
        if (flag == false) bw.write('0');


        bw.flush();
        bw.close();
        br.close();

    }

}