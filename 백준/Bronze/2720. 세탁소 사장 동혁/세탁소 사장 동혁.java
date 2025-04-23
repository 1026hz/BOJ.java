import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int c = Integer.parseInt(br.readLine());
            bw.write(c/25 + " " + c%25/10 + " " + c%25%10/5 + " " + c%25%10%5/1);
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}