package Done;

import java.io.*;
import java.util.Scanner;

public class humancannonball2 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrTestCases = in.nextInt();

        float g = (float) 9.81;
        for (int i = 0; i < nrTestCases; i++) {
            float v = in.nextFloat();
            float angle = (float) Math.toRadians(in.nextFloat());
            float x = in.nextFloat();
            float h1 = in.nextFloat();
            float h2 = in.nextFloat();

            float t = (float) (x / (v * Math.cos(angle)));
            float y = (float) (v * t * Math.sin(angle) - 0.5 * g * Math.pow(t, 2));

            out.write((y + 1 < h2 && y - 1 > h1 ? "Safe" : "Not Safe") + "\n");
        }

        out.close();
    }

}
