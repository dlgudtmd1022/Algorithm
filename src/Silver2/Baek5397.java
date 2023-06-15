package Silver2;

import java.io.*;
import java.util.Stack;

public class Baek5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            Stack<Character> word = new Stack<>();
            Stack<Character> keep = new Stack<>();

            String content = br.readLine();
            for(char move : content.toCharArray()){

            switch (move){
                case '<' :
                    if(!(word.isEmpty())){
                            keep.push(word.pop());
                    }
                    break;
                case '>' :
                    if(!keep.isEmpty()){
                        word.push(keep.pop());
                    }
                    break;
                case '-' :
                    if(!word.isEmpty()){
                        word.pop();
                    }
                    break;
                default:
                    word.push(move);
                    break;
                }
            }
            while(!word.isEmpty()){
                keep.push(word.pop());
            }
            while (!keep.isEmpty()){
                bw.write(keep.pop());
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
