import java.io.*;
import java.util.*;

public class Main{

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }

        for (int i=1; i<=n; i++){ // 정점 번호가 작은 것을 먼저 방문 !
            Collections.sort(A[i]);
        }

        visited = new boolean[n+1];
        dfs(v);
        bw.write('\n');
        visited = new boolean[n+1];
        bfs(v);
        bw.write('\n');

        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int i) throws IOException {
        visited[i] = true;
        bw.write(i + " ");
        for (int j : A[i]){
            if(!visited[j]) dfs(j);
        }
    }

    public static void bfs(int i) throws IOException {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(i);
        visited[i] = true;

        while(!q.isEmpty()){
            int now = q.poll();
            bw.write(now + " ");
            for (int j : A[now]){
                if(!visited[j]){
                    visited[j] = true;
                    q.add(j);
                }
            }
        }

    }


    public static void main(String[] args) throws IOException{
        solution();
    }

}
