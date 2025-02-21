import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        while (true) {

            StringTokenizer st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a ==0 && b == 0 && c == 0) break;

            int[] arr = new int[]{a,b,c};
            Arrays.sort(arr);

            if ((arr[0]*arr[0] + arr[1]*arr[1]) == arr[2]*arr[2]) System.out.println("right");
            else System.out.println("wrong");

            str = br.readLine();

        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}