
import java.io.*;
import java.util.Stack;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){

            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            boolean flag = true;

            if (s.equals("."))
                break;
            if (s.charAt(s.length()-1) != '.') {
                flag = false;
                continue;
            }

            for(int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push('(');
                } else if (s.charAt(i) == ')') {
                    if (!stack.empty() && stack.peek() == '(') stack.pop();
                    else stack.push(')');
                } else if (s.charAt(i) == '[') {
                    stack.push('[');
                } else if (s.charAt(i) == ']') {
                    if (!stack.empty() && stack.peek() == '[') stack.pop();
                    else stack.push(']');
                }
            }

            if (stack.empty() && flag == true){
                bw.write("yes\n");
            }
            else bw.write("no\n");

        }

        bw.flush();
        bw.close();
        br.close();

    }

}