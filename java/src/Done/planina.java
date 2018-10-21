package Done;

import java.io.*;

public class planina {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int iterations = Integer.parseInt(in.readLine());
        int points = 2;

        for (int i = 0; i < iterations; i++) {
            points = points * 2 - 1;
        }

        out.write(String.valueOf(points * points));
        out.close();
    }

}