import java.util.*;
import java.io.*;

public class Main{

    static char[][] maze;
    static int[][] dist;
    static int n;
    static int m;
    // 상하좌우
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        maze = new char[n][m];
        dist = new int[n][m];

        for(int i=0; i<n; i++){
            String str = br.readLine();
            for (int j=0; j<m; j++){
                maze[i][j] = str.charAt(j);
                dist[i][j] = -1; // 거리를 모두 -1로 초기설정
            }
        }
        dist[0][0] = 0;
        bfs(0,0);

        bw.write((dist[n-1][m-1] + 1) + "\n"); // 거리를 0부터 시작했으므로 +1 해줘야함
        bw.flush();
        bw.close();
        br.close();

    }

    public static void bfs(int a, int b){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(a,b));

        while(!q.isEmpty()){
            Pair now = q.poll();

            for(int i=0; i<4; i++){

                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];

                // 미로 범위를 벗어나면 continue
                if (nextX<0 || nextX>=n || nextY<0 || nextY>=m) continue;

                // 갈 수 없는 길이거나 방문했던 곳이면 continue
                if ( maze[nextX][nextY] == '0' || dist[nextX][nextY] != -1) continue;

                // 큐에 새로운 좌표 넣고 거리 저장
                q.offer(new Pair(nextX, nextY));
                dist[nextX][nextY] = dist[now.x][now.y] + 1;
            }
        }
    }

    public static class Pair{
        int x, y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

}