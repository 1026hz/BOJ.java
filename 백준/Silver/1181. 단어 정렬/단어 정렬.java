import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> words = new HashSet<>();

        for(int i=0; i<n; i++){
            words.add(br.readLine());
        }

        List<String> ans = new ArrayList<>(words);
        ans.sort((a, b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b); // 사전 순 비교
        });

        StringBuilder sb = new StringBuilder();
        for(String s : ans){
            sb.append(s).append("\n");
        }

        System.out.println(sb);

        br.close();

    }

}