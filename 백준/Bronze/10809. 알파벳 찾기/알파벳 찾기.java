import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<alphabet.length(); i++){
            System.out.printf("%s ",str.indexOf(alphabet.charAt(i)));
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}