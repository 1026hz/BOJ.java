import java.io.*;
import java.util.*;


public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] height = new int[9];
        int all = 0;
        boolean flag = false;

        for(int i=0; i<9; i++){
            int n = Integer.parseInt(br.readLine());
            height[i] = n;
            all += n;
        }

        Arrays.sort(height);

        for(int i=0; i<9; i++){
            for (int j=i+1; j<9; j++){
                if (all - height[i] - height[j] == 100){
                    for(int k=0; k<9; k++){
                        if (k != i && k != j)
                            bw.write(height[k] + "\n");
                    }

                    flag = true;
                    break;
                }
                if(flag) break;
            }
            if(flag) break;
        }

        bw.flush();
        bw.close();
        br.close();

    }

}