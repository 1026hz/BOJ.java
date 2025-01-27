import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String asc = "12345678";
        String desc = "87654321";
        String ans;
        String s = br.readLine();
        s = s.replaceAll("\\s", "");

        if(s.equals(asc)) ans = "ascending";
        else if(s.equals(desc)) ans = "descending";
        else ans = "mixed";

        bw.write(ans);

        bw.flush();
        bw.close();
        br.close();

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}