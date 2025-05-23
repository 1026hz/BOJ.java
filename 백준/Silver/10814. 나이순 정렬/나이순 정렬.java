import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder[] p = new StringBuilder[201];

        for(int i=0; i<p.length; i++){
            p[i] = new StringBuilder();
        }

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            p[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder sb = new StringBuilder();
        for(StringBuilder s : p){
            sb.append(s);
        }

        System.out.println(sb);


        br.close();

    }

}