package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2755 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(tk.nextToken());

        int count = 0;
        double total = 0;
        String [][] arr = new String [N][3];
        for(int i = 0; i < N; i++) {
            tk = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = tk.nextToken();
            }
            int score = (int)(arr[i][1].charAt(0) - 48);
            count += score;
            String grade = arr[i][2];
            if(grade.equals("A+")){
                total += (double)score * 4.3;
            }else if(grade.equals("A0")){
                total += (double)score * 4.0;
            }else if(grade.equals("A-")){
                total += (double)score * 3.7;
            }
            else if(grade.equals("B+")){
                total += (double)score * 3.3;
            }
            else if(grade.equals("B0")){
                total += (double)score * 3.0;
            }
            else if(grade.equals("B-")){
                total += (double)score * 2.7;
            }
            else if(grade.equals("C+")){
                total += (double)score * 2.3;
            }
            else if(grade.equals("C0")){
                total += (double)score * 2.0;
            }
            else if(grade.equals("C-")){
                total += (double)score * 1.7;
            }
            else if(grade.equals("D+")){
                total += (double)score * 1.3;
            }
            else if(grade.equals("D0")){
                total += (double)score * 1.0;
            }
            else if(grade.equals("D-")){
                total += (double)score * 0.7;
            }
        }
        double avg = (total) / (double)count ;
        System.out.printf("%.2f", avg);
    }
}
