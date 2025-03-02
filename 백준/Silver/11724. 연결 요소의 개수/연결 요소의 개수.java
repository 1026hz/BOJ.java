import java.io.*;
import java.util.*;

public class Main{

    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void solution() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        visited = new boolean[n+1];

        for(int i=0; i<n+1; i++){ // 초기화를 해줘야 NullPointException 안 생김!!
            A[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }

        int count = 0;

        for (int i=1; i<n+1; i++){
            if (!visited[i]){
                count++;
                dfs(i);
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        br.close();
        bw.close();

    }

    public static void dfs(int x){
        if (visited[x]) return;
        visited[x] = true; // 방문처리
        for (int i : A[x]){
            if (!visited[i]){
                dfs(i);
            }
        }
    }


    public static void main(String[] args) throws IOException{
        solution();
    }

}