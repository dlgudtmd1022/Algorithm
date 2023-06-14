package Silver4;

import java.io.*;
import java.util.Stack;


public class Baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T ; i ++){
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j = 0 ; j < word.length(); j++){
                char vpsW = word.charAt(j);

                if(vpsW == '('){
                    stack.push(vpsW);
                } else {
                    if(stack.isEmpty()){
                        stack.push(vpsW);
                        break;
                    } else{
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


