package Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Baek2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        int N =Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }
        while(queue.size() != 1){
            queue.remove();
            queue.add(queue.peek());
            queue.remove();
        }
        br.close();
        System.out.println(queue.peek());
    }
}
