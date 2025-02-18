import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            String floor = String.valueOf((n % h)!=0 ? n%h : h);
            String room = String.valueOf((n % h)==0 ? n/h : n/h + 1);
            if (room.length() == 1) room = "0" + room;
            System.out.println(floor + room);
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}