package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[3];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        if(arr[0] == arr[1] && arr[0] == arr[2]){
            result = 10000 + arr[0] * 1000;
        } else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
            if(arr[1] == arr[2]){
                result = 1000 + arr[1] * 100;
            } else {
                result = 1000 + arr[0] * 100;
            }
        }else {
            result = Math.max(Math.max(arr[0], arr[1]), arr[2]) * 100;
        }
        System.out.println(result);
    }
}
