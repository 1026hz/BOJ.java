import java.io.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            boolean flag=true;
            String num = br.readLine();
            if (num.equals("0")) break;
            for (int i=0; i<num.length()/2; i++){
                if (num.charAt(i) != num.charAt(num.length()-1-i)){
                    bw.write("no\n");
                    flag=false;
                    break;
                }
            }
            if (flag) bw.write("yes\n");
            bw.flush();
        }
        
        bw.close();
        br.close();

    }

}