package Silver4;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        int last = 0;

        for(int i = 0; i < N;i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());

            switch (tk.nextToken()){
                case "push" :
                    last = Integer.parseInt(tk.nextToken());
                    queue.add(last);
                    break;
                case "pop" :
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;
                case "size" :
                    bw.write(queue.size() + "\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()){
                        bw.write("1\n");
                    }else {
                        bw.write("0\n");
                    }
                    break;
                case "front" :
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }else {
                        bw.write(queue.peek() + "\n");
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()){
                        bw.write("-1\n");
                    }else {
                        bw.write(last +"\n");
                    }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
