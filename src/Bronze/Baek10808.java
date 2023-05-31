package Bronze;

import java.util.Scanner;

public class Baek10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        int [] abc = new int [26];
        for(int i = 0; i < word.length();i++){
            char num = word.charAt(i);
            abc[num - 'a']++;
        }
        for(int i = 0; i < abc.length;i++){
            System.out.print(abc[i] + " ");
        }
    }
}
