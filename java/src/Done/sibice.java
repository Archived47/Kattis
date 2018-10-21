package Done;

import java.io.*;

public class sibice {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int matches = Integer.parseInt(inputs[0]);
        int w = Integer.parseInt(inputs[1]);
        int h = Integer.parseInt(inputs[2]);

        for (int i = 0; i < matches; i++) {
            int length = Integer.parseInt(in.readLine());
            if (Math.sqrt(Math.pow(h, 2) + Math.pow(w, 2)) >= length) {
                out.write("DA\n");
            } else {
                out.write("NE\n");
            }
        }

        out.close();
    }

}
