import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] maze = new char[n][m];
        int[][] dist = new int[n][m];

        // 상하좌우
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, -1, 0, 1};

        for (int i=0; i<n; i++){
            String line = br.readLine();
            for (int j=0; j<m; j++){
                maze[i][j] = line.charAt(j);
                dist[i][j] = -1;
            }
        }

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(0,0));
        dist[0][0] = 0;

        while(!q.isEmpty()){
            Pair now = q.poll();
            for(int i=0; i<4; i++){
                int nextX = now.x + dx[i];
                int nextY = now.y + dy[i];

                if (nextX<0 || nextX>=n || nextY<0 || nextY>=m) continue;
                if (maze[nextX][nextY] == '0' || dist[nextX][nextY] != -1) continue;

                dist[nextX][nextY] = dist[now.x][now.y] + 1;
                q.offer(new Pair(nextX, nextY));
            }
        }

        bw.write(String.valueOf(dist[n-1][m-1] + 1));
        bw.flush();
        bw.close();
        br.close();

    }

    public static class Pair{
        int x;
        int y;
        public Pair(int x, int y) {
             this.x = x;
             this.y = y;
        }
    }
}