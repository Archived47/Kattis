package Done;

import java.io.*;
import java.util.Arrays;

public class kornislav {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int[] kornislav = new int[inputs.length];
        for (int i = 0; i < kornislav.length; i++) {
            kornislav[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(kornislav);

        out.write(String.valueOf(kornislav[0] * kornislav[2]));
        out.close();
    }

}
