package Done;

import java.io.*;

public class faktor {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = in.readLine().split("\\s");
        int articles = Integer.parseInt(inputs[0]);
        int impact = Integer.parseInt(inputs[1]);

        out.write((articles*(impact-1) + 1) + "\n");

        out.close();
    }

}
