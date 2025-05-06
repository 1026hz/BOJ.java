import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        for(int i=1; i<=n; i++){
            q.offer(i);
        }

        while(!q.isEmpty()){
            for(int i=0; i<k-1; i++){
                q.offer(q.poll());
            }
            ans.add(q.poll());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for(Integer num : ans){
            sb.append(num);
            if(!num.equals(ans.get(n - 1))) sb.append(", ");
        }
        sb.append(">");

        System.out.println(sb);

        br.close();

    }

}