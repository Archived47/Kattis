package Done;

import java.io.*;

public class carrot {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = in.readLine().split("\\s");
        int contestants = Integer.parseInt(input[0]);
        int problems = Integer.parseInt(input[1]);

        for (int i = 0; i < contestants; i++) {
            in.readLine();
        }

        out.write(String.valueOf(problems));

        out.close();
    }

}
