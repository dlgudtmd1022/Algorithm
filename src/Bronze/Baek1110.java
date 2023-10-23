package Bronze;

import java.io.*;

public class Baek1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int newN = N;
        int count = 0;

        do {
            int a = (N % 10) * 10;
            int b = ((N / 10) + (N % 10)) % 10;
            N = a + b;
            count++;
        } while (N != newN);
        System.out.println(count);
    }
}
