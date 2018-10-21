package Done;

import java.io.*;

public class bus {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrTestCases = Integer.parseInt(in.readLine());

        for (int i = 0; i < nrTestCases; i++) {
            int stops = Integer.parseInt(in.readLine());
            float passengers = 0;
            for (int j = 0; j < stops; j++) {
                passengers += 0.5;
                passengers *= 2;
            }

            out.write(String.valueOf((int)passengers + "\n"));
        }

        out.close();
    }

}
