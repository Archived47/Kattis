package Done;

import java.io.*;

public class zamka {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(in.readLine());
        int D = Integer.parseInt(in.readLine());
        int X = Integer.parseInt(in.readLine());

        int minValue = Integer.MAX_VALUE;
        int maxValue = 0;
        for (int i = L; i <= D; i++) {
            char[] number = String.valueOf(i).toCharArray();
            int sum = 0;
            for (char c : number) {
                sum += Character.digit(c, 10);
            }
            if (sum == X) {
                if (i > maxValue) maxValue = i;
                if (i < minValue) minValue = i;
            }
        }

        out.write(String.valueOf(minValue) + "\n");
        out.write(String.valueOf(maxValue) + "\n");

        out.close();
    }

}
