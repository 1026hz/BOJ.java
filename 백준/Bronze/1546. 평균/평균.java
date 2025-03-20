import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] scores = new double[n];
        double maxScore = 0;

        for (int i=0; i<n; i++){
            scores[i] = Double.parseDouble(st.nextToken());
            if (scores[i] > maxScore) maxScore = scores[i];
        }

        double sum = 0;
        for (int i=0; i<n; i++) {
            sum += (scores[i] / maxScore) * 100;
        }

        double avg = sum / n;
        bw.write(avg + "\n");
        bw.flush();

        bw.close();
        br.close();

    }

}