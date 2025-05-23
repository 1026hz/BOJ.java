import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for(int cnt=0; cnt<t; cnt++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int [][] array;
            array = new int[k+1][n+1];

            for(int i=1; i<=k; i++){
                array[i][0] = 0;
            }

            for(int i=1; i<=n; i++) {
                array[0][i] = i;
            }

            for(int i=1; i<=k; i++){
                for (int j=1; j<=n; j++){
                    array[i][j] = array[i-1][j] + array[i][j-1];
                }
            }
            bw.write(array[k][n] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}