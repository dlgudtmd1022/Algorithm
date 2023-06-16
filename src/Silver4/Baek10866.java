package Silver4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Baek10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()){
                case "push_front" :
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    bw.write((deque.isEmpty() ? "-1" :deque.pollFirst()) + "\n");
                    break;
                case "pop_back" :
                    bw.write((deque.isEmpty() ? "-1" : deque.pollLast()) + "\n");
                    break;
                case "size" :
                    bw.write(deque.size() + "\n");
                    break;
                case "empty" :
                    bw.write((deque.isEmpty() ? "1" : "0") + "\n");
                    break;
                case "front" :
                    bw.write((deque.isEmpty()? "-1" : deque.peekFirst()) + "\n");
                    break;
                case "back" :
                    bw.write((deque.isEmpty()? "-1" : deque.peekLast())+ "\n");
                    break;

             }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
