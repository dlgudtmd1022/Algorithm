package Silver4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> alive = new LinkedList<>();
        Queue<Integer> dead = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N;i++){
            alive.offer(i);
        }

        while (!alive.isEmpty()) {
            for (int i = 1; i < K; i++) {
                alive.add(alive.poll());
            }
            dead.offer(alive.poll());
        }
        System.out.print("<");
        while (!(dead.size() == 1)) {
            System.out.print(dead.poll() + ", ");
        }
        System.out.print(dead.poll());
        System.out.print(">");
        bw.flush();
        bw.close();
        br.close();
    }
}
