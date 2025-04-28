import javax.smartcardio.CommandAPDU;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if (command == 1){
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            }

            else if (command == 2){
                if (stack.empty()) bw.write(-1 + "\n");
                else bw.write(stack.pop() + "\n");
            }

            else if (command == 3){
                bw.write(stack.size() + "\n");
            }

            else if (command == 4){
                if (stack.empty()) bw.write(1 + "\n");
                else bw.write(0 + "\n");
            }

            else if (command == 5){
                if (!stack.empty()) bw.write(stack.peek() + "\n");
                else bw.write(-1 + "\n");
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }

}