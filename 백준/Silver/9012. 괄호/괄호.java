import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int cnt = 0; cnt < n; cnt++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            String s = br.readLine();
            for (int i = 0; i < s.length(); i++) {
                Character current = s.charAt(i);
                if (current == '(') {
                    stack.push(current);
                } else if (current == ')') {
                    if (!stack.isEmpty()) {
                        if (stack.getLast() == '(') stack.pop();
                        else stack.push(current);
                    } else stack.push(current);
                }
            }
            if (stack.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }

        br.close();
    }
}