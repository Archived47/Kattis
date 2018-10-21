package Done;

import java.io.*;
import java.util.Arrays;

public class bijele {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int[] pieces = new int[inputs.length];

        for (int i = 0; i < pieces.length; i++) {
            pieces[i] = Integer.parseInt(inputs[i]);
        }

        pieces[0] = 1 - pieces[0];
        pieces[1] = 1 - pieces[1];
        pieces[2] = 2 - pieces[2];
        pieces[3] = 2 - pieces[3];
        pieces[4] = 2 - pieces[4];
        pieces[5] = 8 - pieces[5];

        out.write(Arrays.toString(pieces).replaceAll("[\\[\\],]", ""));

        out.close();
    }

}
