package 수학;

import java.io.*;
import java.util.StringTokenizer;

public class boj2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstNum = Integer.parseInt(st.nextToken());
        int secondNum = Integer.parseInt(st.nextToken());

        bw.write(gcd(firstNum, secondNum) + "\n");
        bw.write(String.valueOf(lcm(firstNum, secondNum)));
        bw.flush();
        bw.close();
        br.close();

    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
