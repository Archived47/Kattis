package Done;

import java.io.*;

public class pot {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int nrInputs = Integer.parseInt(in.readLine());
        int output = 0;

        for (int i = 0; i < nrInputs; i++) {
            String input = in.readLine();
            int p = Integer.parseInt(input.substring(0, input.length() - 1));
            int pow = Integer.parseInt(input.substring(input.length() - 1));
            output += Math.pow(p, pow);
        }

        out.write(String.valueOf(output));
        out.close();
    }

}
