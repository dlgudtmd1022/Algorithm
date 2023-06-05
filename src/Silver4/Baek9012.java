package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String vps = br.readLine();
            for (int j = 0; j < vps.length(); j++) {
                char word = vps.charAt(j);
                if(word == '('){
                    stack.push(word);
                }else {
                    if(stack.isEmpty()){
                    stack.push(word);
                    break;
                        }   else {
                            stack.pop();
                        }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}


