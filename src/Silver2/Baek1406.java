package Silver2;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baek1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> word = new Stack<>();
        Stack<String> keep = new Stack<>();

        String first = br.readLine();
        for (int i = 0; i < first.length(); i++) {
            String motion = Character.toString(first.charAt(i));
            word.push(motion);
        }

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String move = st.nextToken();
            switch (move) {
                case "L":
                    if (!word.isEmpty()) {
                        keep.push(word.pop());
                    }
                    break;
                case "D":
                    if (!keep.isEmpty()) {
                        word.push(keep.pop());
                    }
                    break;
                case "B":
                    if (!word.isEmpty()) {
                        word.pop();
                    }
                    break;
                case "P":
                    word.push(st.nextToken());
            }
        }
        while (!word.isEmpty()) {
            keep.push(word.pop());
        }
        while (!keep.isEmpty()) {
            bw.write(keep.pop());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
