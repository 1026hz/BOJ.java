import java.io.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i=0; i<n; i++){
            String s = br.readLine();
            if (is_group(s)) ans++;
        }

        bw.write(ans + "");

        bw.flush();
        bw.close();
        br.close();

    }

    public static boolean is_group(String s){
        boolean[] alphabet = new boolean[200];
        char tmp = s.charAt(0);
        for(int i=0; i<s.length(); i++){
            char now = s.charAt(i);
            if(!alphabet[now]) {
                alphabet[now] = true;
                tmp = now;
            }
            else{
                if(tmp != now)
                    return false;
            }
        }
        return true;
    }

}