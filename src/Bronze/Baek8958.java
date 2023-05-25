package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());



        for(int i = 0; i < N;i++){
            String OX = br.readLine();
            int count = 0;
            int score = 0;
        for(int j = 0; j < OX.length();j++){
            if(OX.charAt(j) == 'O'){
                count++;
                score += count;
            }else{
                count = 0;
            }
        }
            System.out.println(score);
        }
    }
}
