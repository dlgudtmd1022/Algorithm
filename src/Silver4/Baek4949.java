package Silver4;

import java.io.*;
import java.util.Stack;

public class Baek4949 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        while(true) {
            String sentence = br.readLine();
            if(sentence.equals(".")) {
                break;
            }
            for (int i = 0; i < sentence.length(); i++) {
                char word = sentence.charAt(i);

                switch (word) {
                    case '(':
                        stack.push(word);
                        break;
                    case '[':
                        stack.push(word);
                        break;
                    case ')':
                        if (stack.isEmpty()) {
                            continue;
                        } else {
                            if (stack.peek() == '(') {
                                stack.pop();
                                break;
                            } else {
                               continue;
                            }
                        }
                    case ']':
                        if (stack.isEmpty()) {
                           continue;
                        } else {
                            if (stack.peek() == '[') {
                                stack.pop();
                                break;
                            } else {
                               continue;
                            }
                        }
                    case '.':
                        if (stack.isEmpty()) {
                            bw.write("yes\n");
                            break;
                        }else {
                            bw.write("no\n");
                            break;
                        }
                }
            }
            stack.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}


