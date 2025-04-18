import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        boolean flag = true;

        for(int i=0, j=s.length()-1; i<j; i++, j-- ){
            if(s.charAt(i) != s.charAt(j)) flag = false;
        }

        if(flag) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
        br.close();

    }

}