import com.sun.source.tree.UsesTree;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> A = new HashSet<>(n);
        for(int i=0; i<n; i++) A.add(Integer.parseInt(st.nextToken()));

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            if (A.contains(Integer.parseInt(st.nextToken()))) sb.append(1).append('\n');
            else sb.append(0).append('\n');
        }

        System.out.println(sb);

    }
}