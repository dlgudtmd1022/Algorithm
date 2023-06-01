package Silver4;

import java.io.*;
import java.util.StringTokenizer;

public class Baek10828 {
    static int[] stack;
    static int size = 0;

    public static void push(int num) {
        stack[size] = num;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        } else {
            int popNum = stack[size - 1]; // 마지막에 들어간 데이터를 popNum에 저장
            stack[size - 1] = 0; // 마지막 데이터를 0으로 설정
            size--; // 스택의 크기 -1
            return popNum; // 마지막에 들어간 데이터 반환
        }
    }

    public static int size(){
        return size;
    }
    public static int empty(){
        if(size == 0) { // 스택이 비어있으면
            return 1; // 1 반환
        }else{ // 스택이 비어있지않으면
            return 0; // 0 반환
        }
    }

    public static int top(){
        if(size == 0){
            return -1;
        }else{
            int topNum = stack[size - 1];
            return topNum;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        for(int i = 1; i <= N; i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());

            switch (tk.nextToken()){
                case "push" :
                    push(Integer.parseInt(tk.nextToken()));
                    break;
                case "pop" :
                    bw.write(pop() + "\n");
                    break;
                case "size" :
                    bw.write(size() + "\n");
                    break;
                case "empty" :
                    bw.write(empty() + "\n");
                    break;
                case "top" :
                    bw.write(top() + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
