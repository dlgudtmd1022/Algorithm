package Bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Baek4344{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int C = Integer.parseInt(br.readLine());

        for(int i = 0; i <  C ; i++){
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(tk.nextToken());
            int [] arr = new int[N];
            int sum = 0;
            for(int j = 0; j < N;j++) {
                arr[j] = Integer.parseInt(tk.nextToken());
                sum += arr[j];
            }
            double avg = (double) sum / N;
            int count = 0;
            for(int k = 0; k < N;k++) {
                if (arr[k] > avg) {
                    count++;
                }
            }
            double student = (double) count * 100 / N;
            System.out.printf("%.3f%%\n", student);
        }
    }
}

