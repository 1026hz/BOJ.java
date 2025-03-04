import java.io.*;
import java.util.*;

public class Main{

    static ArrayList<Integer>[] A;
    static boolean[] visited;
    static boolean found;

    public static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n];
        visited = new boolean[n];

        for (int i=0; i<n; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            A[a].add(b);
            A[b].add(a);
        }

        for(int i=0; i<n; i++){
            int depth = 1;
            dfs(i, depth);
            if (found) break;
        }

        bw.write( String.valueOf(found ? 1 : 0));
        bw.flush();
        bw.close();
        br.close();

    }

    public static void dfs(int node, int depth){

        if(depth == 5 || found){
            found = true;
            return;
        }

        visited[node] = true;

        for(int i : A[node]){ // 이웃 노드 중 visited false인 곳으로 방문, depth + 1 하기
            if (!visited[i]) dfs(i, depth+1);
        }
        visited[node] = false; // 방문했던 노드를 다시 방문하도록 초기화해야 모든 관계 탐색 가능. 백트래킹!
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

}