package Silver3;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        for (int i = 0; i < T ; i ++) {
            int N = Integer.parseInt(br.readLine()); // 입력값

            // 피보나치 수열의 0과 1의 개수를 저자할 2차원 배열
            int [][] dp = new int[N + 1][2];

            // 초기값 설정
            dp[0][0] = 1; // N = 0일 때 0의 개수
            dp[0][1] = 0; // N = 0일 때 1의 개수

            if(N > 0){
                dp[1][0] = 0; // N = 1일 때 0의 개수
                dp[1][1] = 1; // N = 1일 때 1의 개수
            }

            // 피보나치 수열 계산
            for(int j = 2; j <= N; j++){
                dp[j][0] = dp[j - 1][0] + dp[j - 2][0]; // 이전 두 항의 0의 개수를 더함
                dp[j][1] = dp[j - 1][1] + dp[j - 2][1]; // 이전 두 항의 1의 개수를 더함
            }
            // 결과 출력
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
        br.close();
    }
}
